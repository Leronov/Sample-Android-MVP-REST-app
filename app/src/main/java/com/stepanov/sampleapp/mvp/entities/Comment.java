package com.stepanov.sampleapp.mvp.entities;

public class Comment {

    final int postId;
    final int id;
    final String name;
    final String email;
    final String body;

    public Comment(int postId, int id, String name, String email, String body) {
        this.postId = postId;
        this.id = id;
        this.name = name;
        this.email = email;
        this.body = body;
    }
}
