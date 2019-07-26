package com.pps.suanjiaotyong.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Driverpublish {
    private String id;

    private Integer uid;

    private String linkname;

    private String linkphone;

    private Double carlength;

    private Double carwidth;

    private Double carheight;

    private Double carweight;

    private String needtype;

    private String cartype;

    private String fromaddress;

    private String toaddress;

    private BigDecimal price;

    private String route;

    private Date loadtime;

    private Date unloadtime;

    private Date createtime;

    private Integer status;

    private Integer lever;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getLinkname() {
        return linkname;
    }

    public void setLinkname(String linkname) {
        this.linkname = linkname == null ? null : linkname.trim();
    }

    public String getLinkphone() {
        return linkphone;
    }

    public void setLinkphone(String linkphone) {
        this.linkphone = linkphone == null ? null : linkphone.trim();
    }

    public Double getCarlength() {
        return carlength;
    }

    public void setCarlength(Double carlength) {
        this.carlength = carlength;
    }

    public Double getCarwidth() {
        return carwidth;
    }

    public void setCarwidth(Double carwidth) {
        this.carwidth = carwidth;
    }

    public Double getCarheight() {
        return carheight;
    }

    public void setCarheight(Double carheight) {
        this.carheight = carheight;
    }

    public Double getCarweight() {
        return carweight;
    }

    public void setCarweight(Double carweight) {
        this.carweight = carweight;
    }

    public String getNeedtype() {
        return needtype;
    }

    public void setNeedtype(String needtype) {
        this.needtype = needtype == null ? null : needtype.trim();
    }

    public String getCartype() {
        return cartype;
    }

    public void setCartype(String cartype) {
        this.cartype = cartype == null ? null : cartype.trim();
    }

    public String getFromaddress() {
        return fromaddress;
    }

    public void setFromaddress(String fromaddress) {
        this.fromaddress = fromaddress == null ? null : fromaddress.trim();
    }

    public String getToaddress() {
        return toaddress;
    }

    public void setToaddress(String toaddress) {
        this.toaddress = toaddress == null ? null : toaddress.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route == null ? null : route.trim();
    }

    public Date getLoadtime() {
        return loadtime;
    }

    public void setLoadtime(Date loadtime) {
        this.loadtime = loadtime;
    }

    public Date getUnloadtime() {
        return unloadtime;
    }

    public void setUnloadtime(Date unloadtime) {
        this.unloadtime = unloadtime;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getLever() {
        return lever;
    }

    public void setLever(Integer lever) {
        this.lever = lever;
    }

    @Override
    public String toString() {
        return "Driverpublish{" +
                "id='" + id + '\'' +
                ", uid=" + uid +
                ", linkname='" + linkname + '\'' +
                ", linkphone='" + linkphone + '\'' +
                ", carlength=" + carlength +
                ", carwidth=" + carwidth +
                ", carheight=" + carheight +
                ", carweight=" + carweight +
                ", needtype='" + needtype + '\'' +
                ", cartype='" + cartype + '\'' +
                ", fromaddress='" + fromaddress + '\'' +
                ", toaddress='" + toaddress + '\'' +
                ", price=" + price +
                ", route='" + route + '\'' +
                ", loadtime=" + loadtime +
                ", unloadtime=" + unloadtime +
                ", createtime=" + createtime +
                ", status=" + status +
                ", lever=" + lever +
                '}';
    }
}