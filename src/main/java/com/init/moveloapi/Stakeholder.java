package com.init.moveloapi;

public abstract class Stakeholder {

	protected String Login;
	protected String Password;

	protected abstract String getlogin();

	protected abstract String getpassword();

	protected abstract void setlogin(String login);

	protected abstract void setpassword(String password);
}
