package com.felix.mpermissionchecker.sample.view.impl;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.felix.mpermissionchecker.sample.R;

public class FragmentContainerActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_container);
        initView();
    }

    private void initView() {
    }
}
