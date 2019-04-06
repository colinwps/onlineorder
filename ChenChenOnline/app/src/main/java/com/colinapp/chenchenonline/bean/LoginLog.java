package com.colinapp.chenchenonline.bean;

import cn.bmob.v3.BmobObject;

/*
    设备启动信息
 */
public class LoginLog  extends BmobObject {
    private String appVer;
    private String loginDate;
    private String userName;

    public String getAppVer() {
        return appVer;
    }

    public String getLoginDate() {
        return loginDate;
    }

    public String getUserName() {
        return userName;
    }

    public void setAppVer(String appVer) {
        this.appVer = appVer;
    }

    public void setLoginDate(String loginDate) {
        this.loginDate = loginDate;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


}
