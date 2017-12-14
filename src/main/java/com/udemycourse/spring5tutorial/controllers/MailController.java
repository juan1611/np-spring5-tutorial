package com.udemycourse.spring5tutorial.controllers;


import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udemycourse.spring5tutorial.mail.MailSender;


@RestController
public class MailController {


	private MailSender mailSender;
	

	public MailController(@Qualifier("smtpMailSender") MailSender smtp) {//Nombre del Componente en SmtpMailSender
		this.mailSender = smtp;
	}


	@RequestMapping("/mail")
	public String mail() throws MessagingException{
		
		mailSender.send("hernandvo@gmail.com", "A test mail", "Body of the test mail - From Spring (Java) ☺");
		
		return "Mail sent";
	}
	
}
