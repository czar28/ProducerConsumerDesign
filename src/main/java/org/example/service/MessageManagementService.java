package org.example.service;

import org.example.model.Message;
import org.example.model.Topic;

public interface MessageManagementService {

    public void syncDataToSubscribedConsumers(Topic topic, Message message);
}
