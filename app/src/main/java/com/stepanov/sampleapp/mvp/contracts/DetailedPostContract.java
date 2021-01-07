package com.stepanov.sampleapp.mvp.contracts;

import com.stepanov.sampleapp.mvp.entities.Comment;
import com.stepanov.sampleapp.mvp.entities.UserPost;

import java.util.List;

public interface DetailedPostContract extends BaseContract {

    interface View extends BaseContract.View {

        void showPostInfo(UserPost post);
        void showCommentsList(List<Comment> comments);
    }

    interface Presenter extends BaseContract.Presenter<View> {

        void onBackPressed();
    }

}
