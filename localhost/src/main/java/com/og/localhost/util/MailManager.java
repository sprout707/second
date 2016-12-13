package com.og.localhost.util;

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
    	prop = new Properties(); 
    	
    	prop.put("mail.smtp.user", "localhost702@gmail.com"); 
    	
    	prop.put("mail.smtp.host", "smtp.gmail.com");
    	prop.put("mail.smtp.port", "465");
    	prop.put("mail.smtp.starttls.enable", "true");
    	prop.put("mail.smtp.auth", "true");
    	prop.put("mail.smtp.debug", "true");
    	
    	prop.put("mail.smtp.socketFactory.port", "465");
    	prop.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
    	prop.put("mail.smtp.socketFactory.fallback", "false");
    	
    	prop.put("mail.smtp.ssl.enable", "true");
    	prop.put("mail.smtp.ssl.trust", "smtp.gmail.com");
    	
    	//사용자 인증정보
    	smtpAuth = new MailAuth();
    	//세션
    	ses = Session.getInstance(prop, smtpAuth);
	}
	
	public void sendMail(String recipient, String certificationCode)  
    		throws Exception
	{
    	//전송내용 설정
    	MimeMessage msg = new MimeMessage(ses);

    	String subject = "[localhost] 비밀번호 찾기 인증코드 발송"; 
    	msg.setSubject(subject); //제목
    	        
    	String sender = "localhost702@gmail.com"; 
    	Address fromAddr = new InternetAddress(sender);
    	msg.setFrom(fromAddr); //보내는 사람
    	        
    	Address toAddr = new InternetAddress(recipient);
    	msg.addRecipient(Message.RecipientType.TO, toAddr); //받는사람
    	        
    	StringBuilder content=new StringBuilder();
    	content.append(" <h2>localhost</h2> ");
    	content.append("  다음 인증코드를 입력하세요<br/> ");
    	content.append(" <h3>\"</h3><span style='font-size:16px; font-weight:bold;'> ");
    	content.append(certificationCode);
    	content.append(" </span><h3>\"</h3> ");
    	content.append(" <br/>감사합니다. ");
    	msg.setContent(content.toString(), "text/html;charset=UTF-8"); //메일내용
    	        
    	// 메일 발송
    	Transport.send(msg);
    	
    }

}
