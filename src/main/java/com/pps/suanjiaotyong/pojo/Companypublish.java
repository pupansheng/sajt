package com.pps.suanjiaotyong.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Companypublish {
    private String id;

    private Integer uid;

    private String linkname;

    private String linkphone;

    private String goodsname;

    private Double goodslength;

    private Double goodsheight;

    private Double goodswidth;

    private Double goodsweight;

    private Integer goodsamount;

    private String needtype;

    private String cartype;

    private String fromaddress;

    private String toaddress;

    private Date loadtime;

    private Date unloadtime;

    private Double goodsprice;

    private BigDecimal accountprice;

    private Double assessedprice;

    private Integer invoice;

    private Integer paytype;

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

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }

    public Double getGoodslength() {
        return goodslength;
    }

    public void setGoodslength(Double goodslength) {
        this.goodslength = goodslength;
    }

    public Double getGoodsheight() {
        return goodsheight;
    }

    public void setGoodsheight(Double goodsheight) {
        this.goodsheight = goodsheight;
    }

    public Double getGoodswidth() {
        return goodswidth;
    }

    public void setGoodswidth(Double goodswidth) {
        this.goodswidth = goodswidth;
    }

    public Double getGoodsweight() {
        return goodsweight;
    }

    public void setGoodsweight(Double goodsweight) {
        this.goodsweight = goodsweight;
    }

    public Integer getGoodsamount() {
        return goodsamount;
    }

    public void setGoodsamount(Integer goodsamount) {
        this.goodsamount = goodsamount;
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

    public Double getGoodsprice() {
        return goodsprice;
    }

    public void setGoodsprice(Double goodsprice) {
        this.goodsprice = goodsprice;
    }

    public BigDecimal getAccountprice() {
        return accountprice;
    }

    public void setAccountprice(BigDecimal accountprice) {
        this.accountprice = accountprice;
    }

    public Double getAssessedprice() {
        return assessedprice;
    }

    public void setAssessedprice(Double assessedprice) {
        this.assessedprice = assessedprice;
    }

    public Integer getInvoice() {
        return invoice;
    }

    public void setInvoice(Integer invoice) {
        this.invoice = invoice;
    }

    public Integer getPaytype() {
        return paytype;
    }

    public void setPaytype(Integer paytype) {
        this.paytype = paytype;
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
}