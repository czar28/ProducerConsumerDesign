package org.example.dao.impl;

import org.example.dao.TopicDAO;
import org.example.model.Topic;

import java.util.List;

public class TopicDAOImpl implements TopicDAO {

    List<Topic> topicsList;
    @Override
    public void saveTopic(Topic topic) {
        topicsList.add(topic);
    }

    @Override
    public void deleteTopic(Topic topic) {

    }
}
