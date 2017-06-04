package com.touchevent.demo;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * Created by apple on 2017/6/3.
 */
public class ViewGroup2 extends LinearLayout {
    private final static String TAG = ViewGroup2.class.getName();

    public ViewGroup2(Context context) {
        super(context);
    }

    public ViewGroup2(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.i(TAG, "dispatchTouchEvent    action:" + StringUtils.getMotionEventName(ev));
        boolean superReturn = super.dispatchTouchEvent(ev);
        Log.d(TAG, "dispatchTouchEvent    action:" + StringUtils.getMotionEventName(ev) + " " + superReturn);
        return superReturn;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.i(TAG, "onInterceptTouchEvent action:" + StringUtils.getMotionEventName(ev));
        boolean superReturn = super.onInterceptTouchEvent(ev);
        Log.d(TAG, "onInterceptTouchEvent action:" + StringUtils.getMotionEventName(ev) + " " + superReturn);
        return superReturn;
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        Log.i(TAG, "onTouchEvent          action:" + StringUtils.getMotionEventName(ev));
        boolean superReturn = super.onTouchEvent(ev);
        Log.d(TAG, "onTouchEvent          action:" + StringUtils.getMotionEventName(ev) + " " + superReturn);
        return superReturn;
    }
}
