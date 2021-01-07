package com.stepanov.sampleapp.mvp.data;

import com.stepanov.sampleapp.mvp.entities.Comment;
import com.stepanov.sampleapp.mvp.entities.UserPost;

import java.util.List;

public interface PostRepository {

    List<UserPost> getPostsList();

    List<Comment> getPostComments(int postId);
}
