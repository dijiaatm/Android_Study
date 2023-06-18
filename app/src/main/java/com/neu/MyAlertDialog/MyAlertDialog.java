package com.neu.MyAlertDialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.neu.R;

public class MyAlertDialog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_alert_dialog);
    }

    public void alertClick(View view) {
        //首先要引入此布局
        View dialog_view = getLayoutInflater().inflate(R.layout.dialog_view, null);

        //创建出了一个builder构造器
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        //通过builder构造器设置弹窗的相关属性
        builder.setIcon(R.drawable.tx)//添加icon
                .setTitle("我是弹窗标题")
                .setMessage("我是弹窗的具体信息内容")
                .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Log.e("lee","我是alertDialog的确定按钮");
                    }
                })
                .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Log.e("lee","我是alertDialog的取消按钮");
                    }
                })
                .setView(dialog_view)
                .create()
                .show();
    }
}