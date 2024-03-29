package com.cdac.project.faculty.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MailingController {

	 @Autowired
	 private JavaMailSender javaMailSender;
	 
	 @RequestMapping(value="/api/sendEmail",method=RequestMethod.POST)
	 //@ResponseStatus(value=HttpStatus.OK)
	 public String sendEmail(@ModelAttribute("reciever") String reciever,@ModelAttribute("subject") String subject,@ModelAttribute("message") String message) {
		 SimpleMailMessage msg = new SimpleMailMessage();
		// System.out.println(reciever+" "+subject+" "+message);
	        msg.setTo(reciever);
	        msg.setSubject(subject);
	        msg.setText(message);
	        javaMailSender.send(msg);
	        return "redirect:/fadmin/mailing";
	 }
}
