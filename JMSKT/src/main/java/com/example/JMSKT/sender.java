package com.example.JMSKT;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.sender.model.OrderTransaction;
@RestController
public class sender {
	
	@Autowired
	 private JmsTemplate jmstemplate;
	@PostMapping("/send")
	public void send(@RequestBody OrderTransaction tran)
	{
		System.out.println("Sending msg");
		jmstemplate.convertAndSend("OrderTransactionQ", tran);
	}

}
