package com.colinapp.chenchenonline;

import android.annotation.SuppressLint;
import android.os.Build;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import com.colinapp.chenchenonline.bean.LoginLog;

import java.util.Date;

import cn.bmob.v3.Bmob;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.SaveListener;


public class WelcomeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_welcome);

        //初始化BMOB
        Bmob.initialize(this,"8b21a374a9e5cd7af44c7e859bb60729");
        LoginLog log = new LoginLog();
        log.setUserName("Colin");
        log.setAppVer(Build.ID);
        Date date = new Date();
        log.setLoginDate(date.toString());
        log.save(new SaveListener<String>() {
            @Override
            public void done(String s, BmobException e) {
                if (e == null ){
                    Toast.makeText(WelcomeActivity.this,"连接数据库成功",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(WelcomeActivity.this,"连接数据库失败" + e.getMessage(),Toast.LENGTH_SHORT).show();
                }
            }
        });

    }


}
