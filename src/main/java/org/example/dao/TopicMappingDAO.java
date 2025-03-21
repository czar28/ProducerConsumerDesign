package org.example.dao;

import org.example.model.Consumer;
import org.example.model.Topic;

import java.util.Comparator;
import java.util.List;

public interface TopicMappingDAO {

    public List<Consumer> fetchConsumers(Topic topic);

    void addConsumer(Topic topic, Consumer consumer);


    void removeConsumer(Topic topic, Consumer consumer);
}
