package com.touchevent.demo;

import android.view.MotionEvent;

/**
 * Created by apple on 2017/6/3.
 */

public class StringUtils {

    public static String getMotionEventName(MotionEvent ev){
        String result;
        switch (ev.getAction()){
            case MotionEvent.ACTION_DOWN:
                result = "ACTION_DOWN";
                break;
            case MotionEvent.ACTION_MOVE:
                result = "ACTION_MOVE";
                break;
            case MotionEvent.ACTION_UP:
                result = "ACTION_UP";
                break;
            case MotionEvent.ACTION_MASK:
                result = "ACTION_MASK";
                break;
            default:
                result = ""+ev.getAction();
        }
        return result;
    }

}
