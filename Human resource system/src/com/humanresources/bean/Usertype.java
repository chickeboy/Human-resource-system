package com.humanresources.bean;

public class Usertype {
	private int userid;
	private String username;
	private String type;

	public Usertype(int userid, String username, String type) {
		super();
		this.userid = userid;
		this.username = username;
		this.type = type;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
