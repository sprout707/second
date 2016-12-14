package com.og.localhost.util;

import java.util.Date;
import java.util.Properties;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailManager {
	
	private Properties prop;
	private Authenticator smtpAuth;
	private Session ses;
	
	public MailManager()
	{
		setSMTP();
	}
	
	//메일발송 관련 설정
		private void setSMTP()
		{
			//SMTP 설정(gmail)
			prop = System.getProperties();
	        prop.put("mail.smtp.starttls.enable", "true");     // gmail은 무조건 true 고정
	        prop.put("mail.smtp.host", "smtp.gmail.com");      // smtp 서버 주소
	        prop.put("mail.smtp.auth","true");                 // gmail은 무조건 true 고정
	        prop.put("mail.smtp.port", "587");                 // gmail 포트
	           
	    	//사용자 인증정보
	    	smtpAuth = new MailAuth();
	    	ses = Session.getDefaultInstance(prop, smtpAuth);
		}
		
		public void sendMail(String recipient, String certificationCode)  
	    		throws Exception
		{
	    	//전송내용 설정
	    	MimeMessage msg = new MimeMessage(ses);

	    	Address fromAddr = new InternetAddress("localhost<localhost702@gmail.com>");
	    	msg.setFrom(fromAddr); //보내는 사람
	    	        
	    	Address toAddr = new InternetAddress(recipient);
	    	msg.addRecipient(Message.RecipientType.TO, toAddr); //받는사람
	    	
	    	msg.setSentDate(new Date()); //발송일
	    	
	    	String subject = "[localhost] 비밀번호 찾기 인증코드 발송"; 
	    	msg.setSubject(subject); //제목
	    	        
	    	StringBuilder content=new StringBuilder();
	    	content.append(" <h2>localhost</h2> ");
	    	content.append("  다음 인증코드를 입력하세요<br/> ");
	    	content.append(" <h3>\"</h3><span style='font-size:16px; font-weight:bold;'> ");
	    	content.append(certificationCode);
	    	content.append(" </span><h3>\"</h3> ");
	    	content.append(" <br/>감사합니다. ");
	    	
	    	msg.setText(content.toString(), "UTF-8"); //메일내용
	    	msg.setHeader("content-Type", "text/html");
	    	        
	    	// 메일 발송
	    	Transport.send(msg);
	    	
	    }

	}
