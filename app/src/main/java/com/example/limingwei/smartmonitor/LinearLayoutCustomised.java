package com.example.limingwei.smartmonitor;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * Created by limingwei on 17/2/2.
 */
public class LinearLayoutCustomised extends LinearLayout{
    private boolean touchEventsDisabled = true;

//	public LinearLayoutCustomised(Context context) {
//		super(context);
//	}

    public LinearLayoutCustomised(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return touchEventsDisabled;
    }

    public void interceptChildTouchEvents(boolean b) {
        touchEventsDisabled = b;
    }
}
