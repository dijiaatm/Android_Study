package com.neu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {
    //初始化一堆数据存放的容i去
    private List<Bean> beanList = new ArrayList<>();
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        initDataSource();
        initView();

    }

    //获取数据
    public void initDataSource() {
        for (int i = 0; i < 100; i++) {
            Bean bean = new Bean();
            bean.setUsername("测试" + i + "号");
            bean.setImage("@drawable/tx");
            bean.setContext("你在" + i + "天后回家...");
            beanList.add(bean);
        }
    }

    //后台拿到控件对象
    public void initView() {
        listView = findViewById(R.id.lv_one);
        listView.setAdapter(new MyAdapter(beanList, this));//存数据
        //设置点击事件
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.e("lee","onItemClick"+position);
            }
        });
    }
}