package com.pps.suanjiaotyong.pojo;

import com.pps.suanjiaotyong.pojo.group.Result;

public class TbUser {
    private Integer id;

    private String username;

    private String password;

    private String phone;

    private Integer usertype;

    private Integer userinfoid;

    @Override
    public String toString() {
        return "TbUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", usertype=" + usertype +
                ", userinfoid=" + userinfoid +
                ", status=" + status +
                '}';
    }

    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getUsertype() {
        return usertype;
    }

    public void setUsertype(Integer usertype) {
        this.usertype = usertype;
    }

    public Integer getUserinfoid() {
        return userinfoid;
    }

    public void setUserinfoid(Integer userinfoid) {
        this.userinfoid = userinfoid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }


}