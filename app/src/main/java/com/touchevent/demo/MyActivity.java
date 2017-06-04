package com.touchevent.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;

public class MyActivity extends AppCompatActivity {
    private final static String TAG = MyActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.i(TAG, "dispatchTouchEvent    action:" + StringUtils.getMotionEventName(ev));
        boolean superReturn = super.dispatchTouchEvent(ev);
        Log.d(TAG, "dispatchTouchEvent    action:" + StringUtils.getMotionEventName(ev) + " " + superReturn);
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
