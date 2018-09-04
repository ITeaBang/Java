package io;

import java.io.Serializable;

public class Member implements Serializable{
	private String email;
	private String phone;
	private String pw;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	@Override
	public String toString() {
		return "Member [email=" + email + ", phone=" + phone + ", pw=" + pw + "]";
	}
}
