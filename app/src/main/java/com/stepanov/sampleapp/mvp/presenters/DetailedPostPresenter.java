package com.stepanov.sampleapp.mvp.presenters;

import com.stepanov.sampleapp.mvp.contracts.DetailedPostContract;
import com.stepanov.sampleapp.mvp.data.PostRepository;

public class DetailedPostPresenter extends BasePresenter<DetailedPostContract.View>
        implements DetailedPostContract.Presenter {

    private final PostRepository postProxy;

    public DetailedPostPresenter(PostRepository postProxy) {
        this.postProxy = postProxy;
    }

    @Override
    public void onBackPressed() {
        // TODO
    }

    @Override
    public void onFirstTimeViewCreated() {
        // TODO
    }
}
