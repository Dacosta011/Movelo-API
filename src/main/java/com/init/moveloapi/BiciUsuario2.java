package com.init.moveloapi;

public class BiciUsuario2 extends Stakeholder {
	public BiciUsuario2() {
		super();
		this.Login = "";
		this.Password = "";
	}

	public BiciUsuario2(String login, String password) {
		super();
		this.Login = login;
		this.Password = password;
	}

	@Override
	protected String getlogin() {
		return this.Login;
	}

	@Override
	protected String getpassword() {
		return this.Password;
	}

	@Override
	protected void setlogin(String login) {
		this.Login = login;
	}

	@Override
	protected void setpassword(String password) {
		this.Password = password;
	}

	@Override
	public String toString() {
		return "BiciUsuario2 [Login=" + Login + ", Password=" + Password + "]";
	}
	
	
	
}
