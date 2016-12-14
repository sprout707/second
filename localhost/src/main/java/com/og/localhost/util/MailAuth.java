package com.og.localhost.util;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

class MailAuth extends Authenticator {
	
	private String id="localhost702@gmail.com";
	private String pw="asdf123!!@";
	
	public PasswordAuthentication getPasswordAuthentication()
	{
		return new PasswordAuthentication(id, pw);
	}
	
	

}
