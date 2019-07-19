package com.pps.suanjiaotyong.pojo;

public class TbPerson {
    private Integer id;

    private String realname;

    private String province;

    private String city;

    private String idcartimageurl;

    private String address;

    @Override
    public String toString() {
        return "TbPerson{" +
                "id=" + id +
                ", realname='" + realname + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", idcartimageurl='" + idcartimageurl + '\'' +
                ", address='" + address + '\'' +
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

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
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

    public String getIdcartimageurl() {
        return idcartimageurl;
    }

    public void setIdcartimageurl(String idcartimageurl) {
        this.idcartimageurl = idcartimageurl == null ? null : idcartimageurl.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}