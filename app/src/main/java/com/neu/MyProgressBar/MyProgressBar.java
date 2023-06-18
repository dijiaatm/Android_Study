package com.neu.MyProgressBar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import com.neu.R;

public class MyProgressBar extends AppCompatActivity {

    //1、获取这个控件对象
    ProgressBar progressBar = null;
    ProgressBar pbl = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_progress_bar);
        progressBar = findViewById(R.id.pb);
        pbl = findViewById(R.id.pbl);
    }

    public void checkClick(View view) {
        if (progressBar.getVisibility()== View.GONE) {
            progressBar.setVisibility(View.VISIBLE);
        }else {
            progressBar.setVisibility(View.GONE);
        }
    }

    public void inCrementClick(View view) {
        //获取当前进度条的进度数
        int progress = pbl.getProgress();
        //设置每次点击后增加的进度条进度的数
        progress+=10;
        //将增加后的进度条的值放到页面上
        pbl.setProgress(progress);
    }
}