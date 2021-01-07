package com.stepanov.sampleapp.mvp.entities;

public class UserPost {

    final int userId;
    final int id;
    final String title;
    final String body;

    UserPost(int userId, int id, String title, String body) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
    }

}
