package com.pps.suanjiaotyong.pojo;

public class TbUser {
    private Integer id;

    private String username;

    private String password;

    private String phone;

    private Integer usertype;

    private String driverinf;

    private String companyinf;

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

    public String getDriverinf() {
        return driverinf;
    }

    public void setDriverinf(String driverinf) {
        this.driverinf = driverinf == null ? null : driverinf.trim();
    }

    public String getCompanyinf() {
        return companyinf;
    }

    public void setCompanyinf(String companyinf) {
        this.companyinf = companyinf == null ? null : companyinf.trim();
    }

    @Override
    public String toString() {
        return "TbUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", usertype=" + usertype +
                ", driverinf='" + driverinf + '\'' +
                ", companyinf='" + companyinf + '\'' +
                '}';
    }
}