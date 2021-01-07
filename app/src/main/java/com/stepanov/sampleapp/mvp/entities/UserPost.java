package com.stepanov.sampleapp.mvp.entities;

public class UserPost {

    final int userId;
    final int id;
    final String title;
    final String body;

    public UserPost(int userId, int id, String title, String body) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public int getUserId() {
        return userId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }
}
