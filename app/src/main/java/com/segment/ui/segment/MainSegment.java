package com.segment.ui.segment;

import android.view.View;
import android.widget.Toast;

import com.segment.lib.core.BaseSegment;
import com.segment.ui.R;

public class MainSegment extends BaseSegment{
    @Override
    protected int getLayoutId() {
        return R.layout.segment_main;
    }

    @Override
    protected void initView(View root) {
        super.initView(root);
        root.findViewById(R.id.btn_main).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getParentActivity(),"我是主界面",Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onBackPressed() {
        return true;
    }
}
