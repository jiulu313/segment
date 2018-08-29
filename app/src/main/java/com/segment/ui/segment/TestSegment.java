package com.segment.ui.segment;


import android.view.View;

import com.segment.lib.core.BaseSegment;
import com.segment.ui.R;


public class TestSegment extends BaseSegment {

    @Override
    protected int getLayoutId() {
        return R.layout.segment_test;
    }


    @Override
    protected void initView(View root) {
        super.initView(root);
        root.findViewById(R.id.btn_login_in_test).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presentFragment(new LoginSegment());
            }
        });
    }



}
