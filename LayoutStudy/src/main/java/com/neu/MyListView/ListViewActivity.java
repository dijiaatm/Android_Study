package com.neu.MyListView;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.neu.R;

import java.util.List;

public class ListViewActivity extends AppCompatActivity {
    //初始化一堆数据存放的容i去
    private List<Bean> beanList;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
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
        listView.setAdapter(new MyAdapter(beanList,this));//存数据
    }
}