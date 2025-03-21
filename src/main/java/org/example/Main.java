package org.example;

import org.example.dao.MessageDAO;
import org.example.dao.TopicDAO;
import org.example.dao.TopicMappingDAO;
import org.example.dao.impl.MessageDAOImpl;
import org.example.dao.impl.TopicDAOImpl;
import org.example.dao.impl.TopicMappingDAOImpl;
import org.example.model.Consumer;
import org.example.model.Message;
import org.example.model.Publisher;
import org.example.model.Topic;
import org.example.service.MessageManagementService;
import org.example.service.TopicManagementService;
import org.example.service.impl.MessageManagementServiceImpl;
import org.example.service.impl.TopicManagementServiceImpl;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Driver class


        TopicDAO topicDAO = new TopicDAOImpl();
        Topic topic = new Topic("testTopic");
        topicDAO.saveTopic(topic);

        TopicManagementService topicManagementService = new TopicManagementServiceImpl();
        MessageManagementService messageManagementService = new MessageManagementServiceImpl();


        Publisher publisher = new Publisher();
        topicManagementService.subscribeToPublish(publisher, topic);

        Consumer consumer = new Consumer();
        topicManagementService.subscribeToConsume(consumer, topic);

        Message message = new Message("Hey this is my first msg");

        MessageDAO messageDAO = new MessageDAOImpl();
        messageDAO.saveOrUpdateMessage(message);



        publisher.pushMessage(topic, message);



    }
}