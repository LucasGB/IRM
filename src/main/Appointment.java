package main;

import java.io.Serializable;

/**
 *
 * @author lucas
 */
public class Appointment implements Serializable{
    private Integer id;
    private String date;
    private String time;
    private String topic;
    private String description;
    private boolean notification;
    
    public Appointment(Integer id, String date, String time, String topic, String description, boolean notification){
        this.id = id;
        this.date = date;
        this.time = time;
        this.topic = topic;
        this.description = description;
        this.notification = notification;
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the time
     */
    public String getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * @return the topic
     */
    public String getTopic() {
        return topic;
    }

    /**
     * @param topic the topic to set
     */
    public void setTopic(String topic) {
        this.topic = topic;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the notification
     */
    public boolean getNotification() {
        return notification;
    }

    /**
     * @param notification the notification to set
     */
    public void setNotification(boolean notification) {
        this.notification = notification;
    }
}