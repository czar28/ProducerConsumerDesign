package org.example.dao.impl;

import org.example.dao.TopicMappingDAO;
import org.example.model.Consumer;
import org.example.model.Topic;

import java.util.List;
import java.util.Map;

public class TopicMappingDAOImpl implements TopicMappingDAO {

    Map<Topic, List<Consumer>> topicListMap;
    @Override
    public List<Consumer> fetchConsumers(Topic topic) {
        return topicListMap.get(topic);
    }

    @Override
    public void addConsumer(Topic topic, Consumer consumer) {
        topicListMap.get(topic).add(consumer);
    }

    @Override
    public void removeConsumer(Topic topic, Consumer consumer) {
        topicListMap.get(topic).remove(consumer);
    }
}
