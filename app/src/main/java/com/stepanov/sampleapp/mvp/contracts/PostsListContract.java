package com.stepanov.sampleapp.mvp.contracts;

import androidx.annotation.StringRes;

import com.stepanov.sampleapp.mvp.entities.UserPost;

import java.util.List;

public interface PostsListContract {

    interface View extends BaseContract.View {

        void showPostsList(List<UserPost> posts);

        void showError(@StringRes int errorId);
    }

    interface Presenter extends BaseContract.Presenter<View> {

        void onPostClick(UserPost post);
    }
}
