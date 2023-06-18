package com.neu.MyNotification;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

import com.neu.MyEditText.MyEditText;
import com.neu.R;

public class MyNotification extends AppCompatActivity {
    //1、创建一个manage对象作为全局对象
    private NotificationManager manager;
    private NotificationCompat.Builder builder;
    private Notification notification;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_notification);
        //2、通过getSystemService(通知) 的方法获取NotificationManager对象
        manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        //4、判断当前安卓的版本，8.0以上才进行创建
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel("lee", "测试通知", NotificationManager.IMPORTANCE_HIGH);
            manager.createNotificationChannel(channel);
        }

        //实现跳转的话
        Intent intent = new Intent(this, MyEditText.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_IMMUTABLE);

        //3、使用notificationCompat类的Builder构造器来创建Notification对象
        builder = new NotificationCompat.Builder(this, "lee")
                .setContentTitle("测试标题") //设置小标题
                .setColor(Color.parseColor("#FCAAAA"))
                .setLargeIcon(BitmapFactory.decodeResource(getResources(),R.drawable.tx))
                .setContentText("测试的内容:关于notification控件的使用,模拟具体的通知效果")//设置内容具体信息
                .setSmallIcon(R.drawable.email)
                .setAutoCancel(true)
                .setContentIntent(pendingIntent);
                //.build();
    }

    //发送通知
    public void sendNotification(View view) {
        builder.setContentTitle("哈哈哈");
        notification=builder.build();//通过此函数将构造器里的内容构造成一个通知

        manager.notify(1,notification);
    }

    //取消通知
    public void closeNotification(View view) {
        manager.cancel(1);
    }
}