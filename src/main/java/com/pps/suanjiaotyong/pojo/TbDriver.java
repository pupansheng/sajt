package com.pps.suanjiaotyong.pojo;

public class TbDriver {
    private Integer id;

    private String truename;

    private String phone;

    private Integer cartype;

    private String platenum;

    private String carsize;

    private String maxload;

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

    public Integer getCartype() {
        return cartype;
    }

    public void setCartype(Integer cartype) {
        this.cartype = cartype;
    }

    public String getPlatenum() {
        return platenum;
    }

    public void setPlatenum(String platenum) {
        this.platenum = platenum == null ? null : platenum.trim();
    }

    public String getCarsize() {
        return carsize;
    }

    public void setCarsize(String carsize) {
        this.carsize = carsize == null ? null : carsize.trim();
    }

    public String getMaxload() {
        return maxload;
    }

    public void setMaxload(String maxload) {
        this.maxload = maxload == null ? null : maxload.trim();
    }

    @Override
    public String toString() {
        return "TbDriver{" +
                "id=" + id +
                ", truename='" + truename + '\'' +
                ", phone='" + phone + '\'' +
                ", cartype=" + cartype +
                ", platenum='" + platenum + '\'' +
                ", carsize='" + carsize + '\'' +
                ", maxload='" + maxload + '\'' +
                '}';
    }
}