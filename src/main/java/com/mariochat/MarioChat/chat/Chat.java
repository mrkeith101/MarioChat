package com.mariochat.MarioChat.chat;

import org.springframework.data.mongodb.core.mapping.Document;
@Document("Chat")
public class Chat {
    private String message;

    public void setMessage(String message){
        this.message = message;
        System.out.println("chat");

    }

    public String getMessage(){
        return message;
    }
}
