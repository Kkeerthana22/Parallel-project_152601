package com.capgemini.bankwallet.bean;

public class Customer {
			
			private String name;
			private int age;
			private String aadharNumber;
			private String phoneNumber;
			private String email;
			private String gender;
			private String username;
			private String password;
		
			public String getUsername() {
				return username;
			}
			public void setUsername(String username) {
				this.username = username;
			}
			public String getPassword() {
				return password;
			}
			public void setPassword(String password) {
				this.password = password;
			}
		
			
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public int getAge() {
				return age;
			}
			public void setAge(int age) {
				this.age = age;
			}
			public String getAadharNumber() {
				return aadharNumber;
			}
			public void setAadharNumber(String aadharNumber2) {
				this.aadharNumber = aadharNumber2;
			}
			public String getPhoneNumber() {
				return phoneNumber;
			}
			public void setPhoneNumber(String phoneNumber) {
				this.phoneNumber = phoneNumber;
			}
			public String getEmail() {
				return email;
			}
			public void setEmail(String email) {
				this.email = email;
			}
			public String getGender() {
				return gender;
			}
			public void setGender(String gender) {
				this.gender = gender;
			}
			@Override
			public String toString() {
				return "Customer [name=" + name + ", age=" + age + ", aadharNumber=" + aadharNumber + ", phoneNumber="
						+ phoneNumber + ", email=" + email + ", gender=" + gender + ", username=" + username
						+ ", password=" + password + "]";
			}
}
				
		
			
			


