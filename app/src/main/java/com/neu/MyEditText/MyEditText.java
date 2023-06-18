package com.neu.MyEditText;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.neu.R;

public class MyEditText extends AppCompatActivity {
        EditText username = null;
        EditText password = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_edit_text);
        //根据id获取到对象
        username = findViewById(R.id.userName);
        password = findViewById(R.id.password);
        Button btn = findViewById(R.id.login);
        //添加点击事件
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("Lee", "进入点击事件");
                //此处在getText之后要通过toString方法，进行强制类型转换
                String name = MyEditText.this.username.getText().toString();
                String pwd = MyEditText.this.password.getText().toString();
                Log.e("lee", "输入的用户名是:" + name);
                Log.e("lee", "输入的用密码是:" + pwd);
            }
        });
    }

}