package com.felix.mpermissionchecker.sample.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.felix.mpermissionchecker.sample.R;

public class FragmentContainerActivity extends AppCompatActivity {
    private ViewPager vpContainer;
    private TabLayout tabLay;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_container);
        initView();
    }

    private void initView() {
        vpContainer = (ViewPager) findViewById(R.id.vp_container);
        tabLay = (TabLayout) findViewById(R.id.tab_layout);
    }
}
