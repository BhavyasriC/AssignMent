package com.zoho.console;

public class UserDetails {
	private AccountDetails account;
	public AccountDetails getAccount() {
		return account;
	}
	public void setAccount(AccountDetails account) {
		this.account = account;
	}
	private String name;
	private String phone;
	private String userName;
	private String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserDetails [account=" + account + ", name=" + name + ", phone=" + phone + ", userName=" + userName
				+ ", password=" + password + "]";
	}
	
	
	

}
