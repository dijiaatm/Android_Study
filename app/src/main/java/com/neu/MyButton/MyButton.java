package com.neu.MyButton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import com.neu.R;

public class MyButton extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_button);

        //1、根据id获取组件
        Button btn_one = findViewById(R.id.btn_one);
        //2、设置点击事件
//        btn_one.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                //打印输出一句话
//                Log.e("Lee", "onClick:我被点接了");
//                btn_one.setText("我被点击了");
//            }
//        });
        //长按事件
//        btn_one.setOnLongClickListener(new View.OnLongClickListener() {
//            @Override
//            public boolean onLongClick(View view) {
//                Log.e("Lee", "onClick:我被长按了");
//                btn_one.setText("我被长按了");
//                return false;
//            }
//        });
//        btn_one.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View view, MotionEvent motionEvent) {
//                Log.e("Lee", "onTouch:我被触摸了");
//                btn_one.setText("我被触摸了");
//                return true;
//            }
//        });
    }

    public void LeeClick(View view) {
        Log.e("Lee","我是自定义的点击事件");
    }
}