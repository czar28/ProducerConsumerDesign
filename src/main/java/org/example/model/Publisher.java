package org.example.model;

import org.example.service.MessageManagementService;
import org.example.service.impl.MessageManagementServiceImpl;

import java.util.List;

public class Publisher {

    MessageManagementService messageManagementService = new MessageManagementServiceImpl();

    private  int id;
    List<Topic> publishingTopics;

    public  void addTopic(Topic topic) {
        if(!publishingTopics.contains(topic))
            publishingTopics.add(topic);
    }

    public void removeTopic(Topic topic) {
        publishingTopics.remove(topic);
    }

    public void pushMessage(Topic topic, Message message) {
        messageManagementService.syncDataToSubscribedConsumers(topic, message);
    }
}
