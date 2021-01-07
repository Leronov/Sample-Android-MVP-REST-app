package com.stepanov.sampleapp.mvp.contracts;

import androidx.annotation.StringRes;

public interface BaseContract {

    interface View {

        void showError(@StringRes int errorMes);
    }

    interface Presenter<V extends View> {

        void onAttachView(V view);
        void onDetachView();
        void onFirstTimeViewCreated();
    }
}
