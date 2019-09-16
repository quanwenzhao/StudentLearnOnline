package com.zhao.model;

public class User {

	private int id;
	private String account;
	private String password;
	private int status;
	private String name;
	private String nickName;
	private String phone;
	private String iconUrl;

	public User() {};

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
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

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {

		this.phone = phone;
	}

	public String getIconUrl() {

		return iconUrl;
	}

	public void setIconUrl(String iconUrl) {

		this.iconUrl = iconUrl;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", account='" + account + '\'' +
				", password='" + password + '\'' +
				", status=" + status +
				", name='" + name + '\'' +
				", nickName='" + nickName + '\'' +
				", phone='" + phone + '\'' +
				", iconUrl='" + iconUrl + '\'' +
				'}';
	}
}
