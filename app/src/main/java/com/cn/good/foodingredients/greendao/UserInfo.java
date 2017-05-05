package com.cn.good.foodingredients.greendao;

import org.greenrobot.greendao.annotation.*;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit.

/**
 * Entity mapped to table "USER_INFO".
 */
@Entity
public class UserInfo {

    @Id
    private Long id;
    private String ss;
    private Long uid;
    private String mobile;

    @Generated
    public UserInfo() {
    }

    public UserInfo(Long id) {
        this.id = id;
    }

    @Generated
    public UserInfo(Long id, String ss, Long uid, String mobile) {
        this.id = id;
        this.ss = ss;
        this.uid = uid;
        this.mobile = mobile;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSs() {
        return ss;
    }

    public void setSs(String ss) {
        this.ss = ss;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

}