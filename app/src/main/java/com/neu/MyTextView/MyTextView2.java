package com.neu.MyTextView;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class MyTextView2 extends androidx.appcompat.widget.AppCompatTextView {

    @Override
    public boolean isFocused() {
        return true;
    }

    public MyTextView2(Context context) {
        super(context);
    }

    public MyTextView2(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyTextView2(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


}
