package org.example.dao;

import org.example.model.Message;

public interface MessageDAO {

    public Message getMessageById(Integer messageId);
    public void saveOrUpdateMessage(Message message);
}
