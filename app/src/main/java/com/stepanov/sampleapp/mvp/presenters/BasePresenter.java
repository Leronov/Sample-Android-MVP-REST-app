package com.stepanov.sampleapp.mvp.presenters;

import androidx.annotation.Nullable;

import com.stepanov.sampleapp.mvp.contracts.BaseContract;

abstract class BasePresenter<V extends BaseContract.View> implements BaseContract.Presenter<V> {

    @Nullable
    protected V view;

    @Override
    public void onAttachView(V view) {
        this.view = view;
    }

    @Override
    public void onDetachView() {
        this.view = null;
    }
}
