package org.example.dao.impl;

import org.example.dao.MessageDAO;
import org.example.model.Message;

import java.util.Map;

public class MessageDAOImpl implements MessageDAO {

    Map<Integer, Message> messageMap;
    @Override
    public Message getMessageById(Integer messageId) {
        if(messageMap.containsKey(messageId)) {
            return messageMap.get(messageId);
        } else {
            System.out.println("No Message found");
            return null;
        }
    }

    @Override
    public void saveOrUpdateMessage(Message message) {
        messageMap.put(message.getId(), message);
    }
}
