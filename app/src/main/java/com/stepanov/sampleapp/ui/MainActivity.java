package com.stepanov.sampleapp.ui;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

import com.stepanov.sampleapp.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main_activity_layout);
    }
}
