package com.pps.suanjiaotyong.pojo;

public class TbCompany {
    private Integer id;

    private String truename;

    private String phone;

    private String companyname;

    private String companyaddress;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTruename() {
        return truename;
    }

    public void setTruename(String truename) {
        this.truename = truename == null ? null : truename.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
    }

    public String getCompanyaddress() {
        return companyaddress;
    }

    public void setCompanyaddress(String companyaddress) {
        this.companyaddress = companyaddress == null ? null : companyaddress.trim();
    }

    @Override
    public String toString() {
        return "TbCompany{" +
                "id=" + id +
                ", truename='" + truename + '\'' +
                ", phone='" + phone + '\'' +
                ", companyname='" + companyname + '\'' +
                ", companyaddress='" + companyaddress + '\'' +
                '}';
    }
}