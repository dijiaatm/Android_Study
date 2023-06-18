package com.neu.MyPopupWindow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;

import com.neu.R;

public class MyPopupWindow extends AppCompatActivity {
    private boolean popubVisible=false;
    PopupWindow popupWindow=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_popup_window);
    }

    public void pwClick(View view) {
        if (popubVisible == true)
        {
            popupWindow.dismiss();//点击后关闭popWindow
            popubVisible = false;

        }
        else {
            //1、引入布局文件
            View popView = getLayoutInflater().inflate(R.layout.popubwindow, null);
            //4、可以通过popView来获取该布局文件内的控件对象
            Button btn_one = popView.findViewById(R.id.btn_1);
            Button btn_two = popView.findViewById(R.id.btn_2);
            //2、将布局文件引入到pop中,并设置宽高
            popupWindow = new PopupWindow(popView, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            //3、设置pop展示的位置
            popupWindow.showAsDropDown(view);
            popubVisible = true;//界面已经显示
            //5、为popWindow中的按钮添加点击事件
            btn_one.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.e("lee", "我是popWindow中个人信息按钮");
                    popupWindow.dismiss();//点击后关闭popWindow
                    popubVisible = false;
                }
            });
            btn_two.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.e("lee", "我是popWindow中地址详情按钮");
                    popupWindow.dismiss();//点击后关闭popWindow
                    popubVisible = false;
                }
            });
        }
    }
}