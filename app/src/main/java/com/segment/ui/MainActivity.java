package com.segment.ui;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;
import android.view.Window;

import com.segment.lib.core.ActionBarLayout;
import com.segment.lib.core.BaseSegment;
import com.segment.ui.segment.TestSegment;

import java.util.ArrayList;

public class MainActivity extends Activity implements ActionBarLayout.ActionBarLayoutDelegate{
    private ActionBarLayout actionBarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        actionBarLayout = new ActionBarLayout(this);
        actionBarLayout.init(new ArrayList<BaseSegment>());
        actionBarLayout.setDelegate(this);

//        actionBarLayout.setBottomBar(createBottomBar());
        actionBarLayout.setBottomBarHeight(240);

        actionBarLayout.presentFragment(new TestSegment());
        setContentView(actionBarLayout, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));

    }


    @Override
    public boolean onPreIme() {
        Log.d("which2","onPreIme...");
        return false;
    }

    @Override
    public boolean needPresentFragment(BaseSegment fragment, boolean removeLast, boolean forceWithoutAnimation, ActionBarLayout layout) {
        Log.d("which2","needPresentFragment...");

        //这个很重要，必须要返回true，才可以到下个界面
        return true;
    }

    @Override
    public boolean needAddFragmentToStack(BaseSegment fragment, ActionBarLayout layout) {
        Log.d("which2","needAddFragmentToStack...");
        return true;
    }

    @Override
    public boolean needCloseLastFragment(ActionBarLayout layout) {
        Log.d("which2","needCloseLastFragment...");
        return false;
    }

    @Override
    public void onRebuildAllFragments(ActionBarLayout layout) {
        Log.d("which2","onRebuildAllFragments...");
    }
}
