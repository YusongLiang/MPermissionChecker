package com.felix.mpermissionchecker.sample.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.felix.mpermissionchecker.library.app.BasePermissionFragment;
import com.felix.mpermissionchecker.sample.R;

public class MPermissionFragment extends BasePermissionFragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_m_permission, container, false);
        initView(view);
        return view;
    }

    private void initView(View view) {
    }
}
