package org.example.service;

import org.example.model.Consumer;
import org.example.model.Publisher;
import org.example.model.Topic;

public interface TopicManagementService {

    public void subscribeToPublish(Publisher publisher, Topic topic);
    public void unsubscribeToPublish(Publisher publisher, Topic topic);
    public void subscribeToConsume(Consumer consumer, Topic topic);
    public void unsubscribeToConsume(Consumer consumer, Topic topic);
}
