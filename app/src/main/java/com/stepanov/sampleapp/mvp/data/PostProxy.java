package com.stepanov.sampleapp.mvp.data;

import com.stepanov.sampleapp.mvp.entities.Comment;
import com.stepanov.sampleapp.mvp.entities.UserPost;

import java.util.Collections;
import java.util.List;

class PostProxy implements PostRepository {


    @Override
    public List<UserPost> getPostsList() {
        // TODO
        return null;
    }

    @Override
    public List<Comment> getPostComments(int postId) {
        // TODO
        return null;
    }
}
