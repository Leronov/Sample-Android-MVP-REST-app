package com.stepanov.sampleapp.mvp.data;

import com.stepanov.sampleapp.mvp.entities.Comment;
import com.stepanov.sampleapp.mvp.entities.UserPost;

import java.util.List;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Single;

class NetPostRepository implements PostRepository {

    @Override
    public Single<List<UserPost>> getPostsList() {
        return PostAPI.client.loadPosts();
    }

    @Override
    public Single<List<Comment>> getPostComments(int postId) {
        return PostAPI.client.loadComments(postId);
    }

    static class PostAPI {
        private static final String BASE_URL = "http://jsonplaceholder.typicode.com/";
        static final PostRESTAPI client = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(new OkHttpClient())
                .build().create(PostRESTAPI.class);
    }
}
