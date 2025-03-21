package org.example.util;

public class Utils {

    private static int topicId = 1;
    private static int messageId = 1;

    public static synchronized int getTopicId() {
        return topicId++;
    }

    public static synchronized int getMessageId() {
        return messageId++;
    }
}
