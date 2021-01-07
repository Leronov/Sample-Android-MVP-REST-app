package com.stepanov.sampleapp.mvp.data;

import com.stepanov.sampleapp.mvp.entities.Comment;
import com.stepanov.sampleapp.mvp.entities.UserPost;
import java.util.List;
import rx.Single;


class PostProxy implements PostRepository {

    private final LocalPostRepository localRepository;

    private final PostRepository netRepository;

    PostProxy() {
        this.localRepository = new LocalPostRepository();
        this.netRepository = new NetPostRepository();
    }

    @Override
    public Single<List<UserPost>> getPostsList() {
        return netRepository.getPostsList();
    }

    @Override
    public Single<List<Comment>> getPostComments(int postId) {
        return netRepository.getPostComments(postId);
    }
}
