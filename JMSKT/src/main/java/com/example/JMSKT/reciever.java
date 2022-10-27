package com.example.JMSKT;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.example.sender.model.OrderTransaction;
@Component
public class reciever {
	
	@JmsListener(destination ="OrderTransactionQ",containerFactory ="myFactory")
	public void recieve(OrderTransaction tran)
	{
		System.out.println("Recieving Message "+tran.toString());
	}
	

}
