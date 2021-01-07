package com.stepanov.sampleapp.mvp.data;

import com.stepanov.sampleapp.mvp.entities.Comment;
import com.stepanov.sampleapp.mvp.entities.UserPost;

import java.util.List;

import rx.Single;

class LocalPostRepository implements PostRepository {

    @Override
    public Single<List<UserPost>> getPostsList() {
        return null;
    }

    @Override
    public Single<List<Comment>> getPostComments(int postId) {
        return null;
    }

    public void savePostsList(List<UserPost> posts) {

    }

    public void saveComments(List<Comment> comments) {

    }
}
