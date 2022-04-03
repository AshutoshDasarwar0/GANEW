package com.citiustech.service;

import java.io.UnsupportedEncodingException;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.citiustech.model.UserModel;
import com.citiustech.repository.UserRegistrationRepository;

@Service
public class UserRegistrationService {
	@Autowired
	private UserRegistrationRepository registrationRepository;
	
	@Autowired
    JavaMailSender mailSender;
	
	public String saveUser(UserModel userModel) {
		System.out.println(userModel);
//		registrationRepository.saveUser("emp104",userModel.getTitle(), userModel.getFirstName(), userModel.getLastName(), userModel.getEmail(), Date.valueOf(LocalDate.now()), 1,"password", Date.valueOf(LocalDate.now()));
     //registrationRepository.saveUser("emp101","male", "Ahutosh", "dasarwar", "Ashutosh@gmail.com",Date.valueOf(LocalDate.now()), 1,"emp101",Date.valueOf(LocalDate.now()));
	    String msg ="hello,Dear this is message for security check";
	    String subject="password";
	    String to = userModel.getEmail();
	    String from = "ashutosh.dasarwar1@gmail.com";
	    
	    sendEmail(msg,subject,from,"ashutoshdasarwar@gmail");
	    
		return "ss";
	}

	private void sendEmail(String msg, String subject, String from,String to) {
		// TODO Auto-generated method stub
		
		String host="smtp.gmail.com";
	
		Properties properties=System.getProperties();
		System.out.println("properties"+properties);
       
		properties.put("mail.smtp.host",host);
		properties.put("mail.smtp.post", "465");
		properties.put("mail.smtp.ssl.enable","true");
		properties.put("mail.smpt.auth", "true");
		
		

		Session session=Session.getDefaultInstance(properties, new Authenticator() {

			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("ashutosh.dasarwar1@gmail.com", "Ashu@8888");
			}
			
			
		});
		
		
		session.setDebug(true);
		
		
		MimeMessage m=new MimeMessage(session);
		try {
		m.setFrom();
		m.addRecipient(Message.RecipientType.TO, new InternetAddress(to) );
		
		m.setSubject(subject);
		
		m.setText(msg);
		
		Transport.send(m);
		
		System.out.println("Send Success....");
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
//	public void sendEmail(String userName,String password) {
//        MimeMessage mimeMessage = mailSender.createMimeMessage();
// 
//        try {
// 
//            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
// 
//            mimeMessageHelper.setSubject("Welcome");
//            mimeMessageHelper.setFrom(new InternetAddress(userName, "ashutoshdasarwar@gmail.com"));
//            mimeMessageHelper.setTo(userName);
//            mimeMessageHelper.setText("password"+password);
// 
//            mailSender.send(mimeMessageHelper.getMimeMessage());
// 
//        } catch (MessagingException e) {
//            e.printStackTrace();
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
//    }
}
 


