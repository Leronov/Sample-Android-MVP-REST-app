package com.stepanov.sampleapp.mvp.data;

import com.stepanov.sampleapp.mvp.entities.Comment;
import com.stepanov.sampleapp.mvp.entities.UserPost;

import java.util.List;

import rx.Single;

public interface PostRepository {

    Single<List<UserPost>> getPostsList();

    Single<List<Comment>> getPostComments(int postId);
}
