	package com.capgemini.bankwallet.dao;




import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import com.capgemini.bankwallet.bean.Account;
import com.capgemini.bankwallet.bean.Customer;




	public class BankWalletDao implements IBankWalletDao {
		

		JdbcUtil util = new JdbcUtil();
		
		 float balance;
		 static Customer cust1;
		Account acc = new Account();
		int accountNo;
		static int acn;
		String details;
			public boolean addAccount(Account account){
			
				
				Connection con = util.GetConnection();
				Statement smt;
				try {
					
					 smt =con.createStatement();
					//rs=smt.executeQuery("select * from paymentwalletdb.Customer");
					
					
					PreparedStatement psmt =	con.prepareStatement("insert  into paymentdb.Customer values(?,?,?,?,?,?,?,?,?)");
					PreparedStatement psmt1= con.prepareStatement("insert  into paymentdb.Account values(?,?)");
					psmt1.setFloat(1,account.getBalance());
					psmt1.setInt(2,account.getAccountNo());
					
					psmt.setString(1,account.getCust().getUsername());
					psmt.setString(2,account.getCust().getPassword());
					psmt.setString(3,account.getCust().getName());
					psmt.setInt(4,account.getCust().getAge());
					psmt.setString(5,account.getCust().getGender());
					psmt.setString(6,account.getCust().getEmail());
					psmt.setString(7,account.getCust().getAadharNumber());
					psmt.setString(8,account.getCust().getPhoneNumber());
					psmt.setInt(9, account.getAccountNo());
					psmt.execute();
					psmt1.execute();
					con.close();
				}
			
				catch (SQLException e) {
					e.printStackTrace();
				}
			return true;	
			}
					
					

				
	
			@Override
			public float showBalance() {
				accountNo=acn;
				Connection con = util.GetConnection();
				Statement smt;
				try {
					smt=con.createStatement();
					String query="select * from account where accountNo='"+accountNo+"' ";
					ResultSet rs=smt.executeQuery(query);
					while(rs.next()) {
						balance=rs.getFloat("balance");
					}
					con.close();
				} catch (Exception e) {
					// TODO: handle exception
				}
				
				return balance;
			}
			@Override
			public boolean depositAmount(float amount) {
				Connection con = util.GetConnection();
				try {
					String deposit ="THE AMOUNT"+amount+"IS DEPSOITED" + "\n";
					String insertq="INSERT INTO transactions value(?,?)";
					accountNo=acn;
					String query="update account set balance=balance+? where accountNo=?";
					PreparedStatement ps=con.prepareStatement(query);
					ps.setFloat(1, amount);
					ps.setInt(2, accountNo);
					ps.executeUpdate();
					PreparedStatement ps22=con.prepareStatement(insertq);
					ps22.setString(1, deposit);
					ps22.setInt(2, accountNo);
					ps22.execute();
				con.close();
				} catch (SQLException e) {
					// TODO: handle exception
				}
				
				
				
				return true;
			}


			@Override
			public boolean withdrawAmount(float amount) {
				int accountNo=acn;
				Connection con = util.GetConnection();
				
				try {	
					String withdraw ="THE AMOUNT"+amount+"IS WITHDRAWED" + "\n";
						String insertq="INSERT INTO transactions value(?,?)";
						Statement st=con.createStatement();
						String query="select * from account where accountNo='"+accountNo+"' ";
						ResultSet rs=st.executeQuery(query);
						while(rs.next()) {
							balance=rs.getFloat("balance");
						}
						if(balance >= amount) {
							String query1="update account set balance=balance-? where accountNo=?";
						PreparedStatement ps=con.prepareStatement(query1);
						ps.setFloat(1, amount);
						ps.setInt(2, accountNo);
						ps.executeUpdate();
						PreparedStatement ps22=con.prepareStatement(insertq);
						ps22.setString(1, withdraw);
						ps22.setInt(2, accountNo);
						ps22.execute();
						}
						else {
							System.out.println("Not updated");
						}
						con.close();
				} catch (Exception e) {
					// TODO: handle exception
				}
				
				
				return false;
			}


			@Override
			public boolean loginAccount(String username, String password) {
				
				Statement smt;
				Connection con=util.GetConnection();
				try {
					smt=con.createStatement();
					String query="select * from customer where username='"+username+"' and password='"+password+"' ";
					smt.executeQuery(query);	
					 ResultSet rs=smt.getResultSet();
					 while(rs.next()) {
						 username=rs.getString("username");
						 password=rs.getString("password");
						 if(username.equals(username) && password.equals(password)) {
							 acn=rs.getInt("accountNo");
							 return true;
							 
						 }
						}	
					
					con.close();
				} catch (Exception e) {
					// TODO: handle exception
				}
				return false;
			}


			@Override
			public boolean fundTransfer(int accountNo2, float amount) {
				accountNo=acn;
				Connection con=util.GetConnection();
				try {
					String fdt ="THE AMOUNT"+amount+"IS TRANSFERRED TO ACCOUNT NUMBER "+  accountNo2+ "\n";
					String insertfund="INSERT INTO transactions value(?,?)";
				
				
				String query2="select * from account where accountNo='"+accountNo+"'";
				Statement st1=con.createStatement();
				ResultSet rs1=st1.executeQuery(query2);
				while(rs1.next()) {
					balance=rs1.getFloat("balance");
					
					if(balance>amount) {
						String query3="update account set balance= balance-? where accountNo =?";
						PreparedStatement ps1=con.prepareStatement(query3);
						ps1.setFloat(1, amount);
						ps1.setInt(2, accountNo);
						ps1.execute();
						
						
					}
				}
					String query="select * from account where accountNo='"+accountNo2+"'";
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery(query);
						while(rs.next()) {
							balance=rs.getFloat("balance");
						}
						String query1="update account set balance =balance+? where accountNo=?";
						PreparedStatement ps=con.prepareStatement(query1);
						ps.setFloat(1,amount);
						ps.setInt(2,accountNo2);
						ps.execute();
						
						PreparedStatement ps2=con.prepareStatement(insertfund);
						ps2.setString(1, fdt);
						ps2.setInt(2, accountNo);
						ps2.execute();
					
				
				con.close();
				}		
					catch (Exception e) {
						// TODO: handle exception
					}
					return true;	
				
			}


			@Override
			public void printTransaction() {
				  accountNo=acn;
				 Connection con=util.GetConnection();
				 try {
					 Statement st=con.createStatement();
					 String query="select * from transactions where accountNo='"+ accountNo +"'";
					
					ResultSet rs=st.executeQuery(query);
					while(rs.next()) {
						details=rs.getString("transaction_info");
						System.out.println(details);
					}
					con.close();
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
	}

			