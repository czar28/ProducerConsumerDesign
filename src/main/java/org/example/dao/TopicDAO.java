package org.example.dao;

import org.example.model.Topic;

public interface TopicDAO {
    public void saveTopic(Topic topic);
    public void deleteTopic(Topic topic);
}
