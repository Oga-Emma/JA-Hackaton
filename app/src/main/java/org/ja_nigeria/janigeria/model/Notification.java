package org.ja_nigeria.janigeria.model;

public class Notification {
    private String message;
    private String date;
    private String profileImageUrl;

    public Notification() {
    }

    public Notification(String message, String date, String profileImage) {
        this.message = message;
        this.date = date;
        this.profileImageUrl = profileImage;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getProfileImage() {
        return profileImageUrl;
    }

    public void setProfileImage(String profileImage) {
        this.profileImageUrl = profileImage;
    }
}
