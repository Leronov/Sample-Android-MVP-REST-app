package com.stepanov.sampleapp.ui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.stepanov.sampleapp.R;
import com.stepanov.sampleapp.mvp.contracts.PostsListContract;
import com.stepanov.sampleapp.mvp.data.PostProxy;
import com.stepanov.sampleapp.mvp.entities.UserPost;
import com.stepanov.sampleapp.mvp.presenters.MainPresenter;

import java.util.List;

public class MainActivity extends Activity implements PostsListContract.View {

    private final PostsListContract.Presenter presenter = new MainPresenter(new PostProxy());
    private PostsAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main_activity_layout);
        RecyclerView recyclerView = findViewById(R.id.postsList);
        adapter = new PostsAdapter();
        recyclerView.setAdapter(adapter);
        presenter.onAttachView(this);
        presenter.onFirstTimeViewCreated();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.onDetachView();
    }

    @Override
    public void showPostsList(List<UserPost> posts) {
        adapter.setData(posts);
    }

    @Override
    public void showError(int errorId) {
        Toast.makeText(getApplicationContext(), errorId, Toast.LENGTH_SHORT).show();
    }
}
