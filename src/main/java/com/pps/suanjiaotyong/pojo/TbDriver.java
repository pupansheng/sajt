package com.pps.suanjiaotyong.pojo;

public class TbDriver {
    private Integer id;

    private String realname;

    private String phone;

    @Override
    public String toString() {
        return "TbDriver{" +
                "id=" + id +
                ", realname='" + realname + '\'' +
                ", phone='" + phone + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", cartype='" + cartype + '\'' +
                ", carnumber='" + carnumber + '\'' +
                ", carsize='" + carsize + '\'' +
                ", maxload='" + maxload + '\'' +
                ", carimage='" + carimage + '\'' +
                ", idcartimage='" + idcartimage + '\'' +
                ", driverslicenseimage='" + driverslicenseimage + '\'' +
                ", walkimages='" + walkimages + '\'' +
                ", status=" + status +
                '}';
    }

    private String province;

    private String city;

    private String cartype;

    private String carnumber;

    private String carsize;

    private String maxload;

    private String carimage;

    private String idcartimage;

    private String driverslicenseimage;

    private String walkimages;

    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getCartype() {
        return cartype;
    }

    public void setCartype(String cartype) {
        this.cartype = cartype == null ? null : cartype.trim();
    }

    public String getCarnumber() {
        return carnumber;
    }

    public void setCarnumber(String carnumber) {
        this.carnumber = carnumber == null ? null : carnumber.trim();
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

    public String getCarimage() {
        return carimage;
    }

    public void setCarimage(String carimage) {
        this.carimage = carimage == null ? null : carimage.trim();
    }

    public String getIdcartimage() {
        return idcartimage;
    }

    public void setIdcartimage(String idcartimage) {
        this.idcartimage = idcartimage == null ? null : idcartimage.trim();
    }

    public String getDriverslicenseimage() {
        return driverslicenseimage;
    }

    public void setDriverslicenseimage(String driverslicenseimage) {
        this.driverslicenseimage = driverslicenseimage == null ? null : driverslicenseimage.trim();
    }

    public String getWalkimages() {
        return walkimages;
    }

    public void setWalkimages(String walkimages) {
        this.walkimages = walkimages == null ? null : walkimages.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}