package com.socket;

import java.io.Serializable;

/**
 * Class Message
 * @author Emil
 */

public class Message implements Serializable{
    
    //Variabler
    private static final long serialVersionUID = 1L;
    public String type, sender, content, recipient;
    
    /**
     * Message (Konstruktor)
     * @param type
     * @param sender
     * @param content
     * @param recipient 
     */
    
    public Message(String type, String sender, String content, String recipient){
        this.type = type; this.sender = sender; this.content = content; this.recipient = recipient;
    }
    
    /**
     * ToString
     * @return 
     */
    
    @Override
    public String toString(){
        return "{type='"+type+"', sender='"+sender+"', content='"+content+"', recipient='"+recipient+"'}";
    }
}
