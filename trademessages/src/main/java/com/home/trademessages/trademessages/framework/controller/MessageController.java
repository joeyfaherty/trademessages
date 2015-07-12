package com.home.trademessages.trademessages.framework.controller;

import javax.ws.rs.Path;

import com.home.trademessages.trademessages.framework.model.Message;


public class MessageController {
	
	@Path("/messages")
	public Message getAllMessages() {
		//TODO: get messages from service 
		return null;
	}

}
