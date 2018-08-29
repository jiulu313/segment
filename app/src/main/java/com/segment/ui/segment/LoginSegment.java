package com.segment.ui.segment;

import android.view.View;

import com.segment.lib.core.BaseSegment;
import com.segment.ui.R;

public class LoginSegment extends BaseSegment{
    @Override
    protected int getLayoutId() {
        return R.layout.segment_login;
    }

    @Override
    protected void initView(View root) {
        super.initView(root);
        root.findViewById(R.id.btn_login_in_login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presentFragment(new MainSegment());
            }
        });

    }
}
