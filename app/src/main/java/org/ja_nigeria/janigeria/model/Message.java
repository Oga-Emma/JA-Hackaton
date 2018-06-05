package org.ja_nigeria.janigeria.model;

public class Message {

    private String senderName;
    private String messageDate;
    private String messageBody;
    private String profileUrl;

    public Message() {
    }

    public Message(String senderName, String messageDate, String messageBody, String profileUrl) {
        this.senderName = senderName;
        this.messageDate = messageDate;
        this.messageBody = messageBody;
        this.profileUrl = profileUrl;
    }


    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getMessageDate() {
        return messageDate;
    }

    public void setMessageDate(String messageDate) {
        this.messageDate = messageDate;
    }

    public String getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }

    public String getProfileUrl() {
        return profileUrl;
    }

    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }
}