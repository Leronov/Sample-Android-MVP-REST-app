package com.stepanov.sampleapp.mvp.data;

import com.stepanov.sampleapp.mvp.entities.Comment;
import com.stepanov.sampleapp.mvp.entities.UserPost;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

interface PostRESTAPI {

    @GET("./posts")
    Single<List<UserPost>> loadPosts();

    @GET("./comments")
    Single<List<Comment>> loadComments(@Query("postId") int postId);
}
