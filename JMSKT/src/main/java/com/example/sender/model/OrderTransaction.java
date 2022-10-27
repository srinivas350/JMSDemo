package com.example.sender.model;

import javax.persistence.Entity;

@Entity
public class OrderTransaction {
	
	String msg;

	public String getMsg() {
		return msg;
	}

	@Override
	public String toString() {
		return "OrderTransaction [msg=" + msg + "]";
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	

}
