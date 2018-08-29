package com.segment.ui;


import com.segment.lib.core.BaseSegment;


public class TestSegment extends BaseSegment {

    @Override
    protected int getLayoutId() {
        return R.layout.segment_test;
    }

    @Override
    protected boolean hasBottomBar() {
        return true;
    }


}
