package com.sswh.platform.entity;

/**
 * Created by wangchengcheng on 2019/3/18
 */
public class User {
    private int iid;

    private String name;

    private String password;


    public int getIid() {
        return iid;
    }

    public void setIid(int iid) {
        this.iid = iid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "iid=" + iid +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
