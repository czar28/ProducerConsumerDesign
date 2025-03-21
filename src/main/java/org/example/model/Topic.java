package org.example.model;

import org.example.util.Utils;

public class Topic {

    private int id;
    private String name;

    public Topic(String name) {
        this.id = Utils.getTopicId();
        this.name = name;
    }
}
