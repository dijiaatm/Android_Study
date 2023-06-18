package com.neu.MyListView;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.neu.R;

import java.util.List;

public class MyAdapter extends BaseAdapter {

    //创建这个类的目的是为了接收onCreate方法中的数据源用的
    private List<Bean> beanList;
    //创建context的目的是为了让当前的方法具有指向性
    private Context context;

    //为这两个成员变量设置有参构造器
    public MyAdapter(List<Bean> beanList, Context context) {
        this.beanList = beanList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return beanList.size();
    }

    //获取item
    @Override
    public Object getItem(int position) {
        return null;
    }

    //获取itemID
    @Override
    public long getItemId(int position) {
        return position;
    }

    //获取返回的View
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //当数据源有了,我需要给listView进行视图布局和数据的相互绑定
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.list_item_view, parent, false);
        }
        //然后让他去拿list_item中的各个组件，然后把数据set进去
        TextView username = convertView.findViewById(R.id.tv_one);
        username.setText(beanList.get(position).getUsername());
        TextView context = convertView.findViewById(R.id.tv_two);
        context.setText(beanList.get(position).getContext());
        //打印输出调用次数
        Log.e("lee","getView :方法调用"+position+"次");
        return convertView;
    }
}
