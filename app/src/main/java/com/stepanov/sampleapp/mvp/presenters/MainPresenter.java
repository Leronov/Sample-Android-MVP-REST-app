package com.stepanov.sampleapp.mvp.presenters;

import com.stepanov.sampleapp.mvp.contracts.PostsListContract;
import com.stepanov.sampleapp.mvp.data.PostRepository;
import com.stepanov.sampleapp.mvp.entities.UserPost;

public class MainPresenter extends BasePresenter<PostsListContract.View>
        implements PostsListContract.Presenter {

    private final PostRepository postProxy;

    public MainPresenter(PostRepository postProxy) {
        this.postProxy = postProxy;
    }


    @Override
    public void onPostClick(UserPost post) {
        // TODO
    }

    @Override
    public void onFirstTimeViewCreated() {
        // TODO
    }
}
