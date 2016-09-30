package com.felix.mpermissionchecker.sample.view.impl;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.felix.mpermissionchecker.library.app.BasePermissionActivity;
import com.felix.mpermissionchecker.sample.R;

public class MPermissionActivity extends BasePermissionActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_permission);
    }
}
