package com.stepanov.sampleapp.mvp.presenters;

import androidx.annotation.NonNull;

import com.stepanov.sampleapp.R;
import com.stepanov.sampleapp.mvp.contracts.PostsListContract;
import com.stepanov.sampleapp.mvp.data.PostRepository;
import com.stepanov.sampleapp.mvp.entities.UserPost;

import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;


public class MainPresenter extends BasePresenter<PostsListContract.View>
        implements PostsListContract.Presenter {

    private final PostRepository postProxy;
    private final CompositeDisposable disposable = new CompositeDisposable();

    public MainPresenter(PostRepository postProxy) {
        this.postProxy = postProxy;
    }


    @Override
    public void onPostClick(UserPost post) {
        // TODO
    }

    @Override
    public void onFirstTimeViewCreated() {
        disposable.add(postProxy.getPostsList()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableSingleObserver<List<UserPost>>() {

                    @Override
                    public void onSuccess(@NonNull List<UserPost> userPosts) {
                        view.showPostsList(userPosts);
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        view.showError(R.string.error);
                    }
                }));
    }
}
