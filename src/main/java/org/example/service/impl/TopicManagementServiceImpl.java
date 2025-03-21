package org.example.service.impl;

import org.example.model.Consumer;
import org.example.model.Publisher;
import org.example.model.Topic;
import org.example.service.TopicManagementService;

public class TopicManagementServiceImpl implements TopicManagementService {

    @Override
    public void subscribeToPublish(Publisher publisher, Topic topic) {
        publisher.addTopic(topic);
    }

    @Override
    public void unsubscribeToPublish(Publisher publisher, Topic topic) {

    }

    @Override
    public void subscribeToConsume(Consumer consumer, Topic topic) {

    }

    @Override
    public void unsubscribeToConsume(Consumer consumer, Topic topic) {

    }
}
