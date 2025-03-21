package org.example.service.impl;

import org.example.dao.TopicMappingDAO;
import org.example.dao.impl.TopicMappingDAOImpl;
import org.example.model.Consumer;
import org.example.model.Message;
import org.example.model.Topic;
import org.example.service.MessageManagementService;

import java.util.List;

public class MessageManagementServiceImpl implements MessageManagementService {

    TopicMappingDAO topicMappingDAO = new TopicMappingDAOImpl();
    @Override
    public void syncDataToSubscribedConsumers(Topic topic, Message message) {
        //get Data from TopicMapping Table

        List<Consumer> consumersSubscribed = topicMappingDAO.fetchConsumers(topic);
        for(Consumer consumer: consumersSubscribed) {
            consumer.consumeTopic(topic, message);
        }
    }
}
