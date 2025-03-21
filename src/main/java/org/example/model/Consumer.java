package org.example.model;

import java.util.List;
import java.util.Map;

public class Consumer {

    private int id;
    List<Topic> subscribedTopics;
    Map<Topic, Message> consumedTopicMap;

    public void addTopic(Topic topic) {
        subscribedTopics.add(topic);
    }

    public void consumeTopic(Topic topic, Message message) {
        consumedTopicMap.put(topic, message);
    }

    public void removeTopic(Topic topic) {
        subscribedTopics.add(topic);
    }

    public Message getLatestMessage(Topic topic) {
        return consumedTopicMap.get(topic);
    }
}
