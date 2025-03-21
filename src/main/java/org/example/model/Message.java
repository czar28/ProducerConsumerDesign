package org.example.model;

import org.example.util.Utils;

public class Message {

    private Integer id;
    private String content;

    public Message(String content) {
        this.id = Utils.getMessageId();
        this.content = content;
    }

    public Integer getId() {
        return id;
    }
}
