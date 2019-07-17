package com.pps.suanjiaotyong.pojo;

import java.util.Date;

public class Companypublish {
    private String id;

    private Integer uid;

    private Integer type;

    private String fromaddress;

    private String toaddress;

    private Date loadtime;

    @Override
    public String toString() {
        return "Companypublish{" +
                "id='" + id + '\'' +
                ", uid=" + uid +
                ", type=" + type +
                ", fromaddress='" + fromaddress + '\'' +
                ", toaddress='" + toaddress + '\'' +
                ", loadtime=" + loadtime +
                ", unloadtime=" + unloadtime +
                ", goodssize='" + goodssize + '\'' +
                ", goodsweight=" + goodsweight +
                ", amount='" + amount + '\'' +
                ", invoice=" + invoice +
                ", companyphone='" + companyphone + '\'' +
                ", pay=" + pay +
                ", goodsprice=" + goodsprice +
                ", receivername='" + receivername + '\'' +
                ", receiverphone='" + receiverphone + '\'' +
                '}';
    }

    private Date unloadtime;

    private String goodssize;

    private Double goodsweight;

    private String amount;

    private Integer invoice;

    private String companyphone;

    private Double pay;

    private Double goodsprice;

    private String receivername;

    private String receiverphone;

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

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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

    public String getGoodssize() {
        return goodssize;
    }

    public void setGoodssize(String goodssize) {
        this.goodssize = goodssize == null ? null : goodssize.trim();
    }

    public Double getGoodsweight() {
        return goodsweight;
    }

    public void setGoodsweight(Double goodsweight) {
        this.goodsweight = goodsweight;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount == null ? null : amount.trim();
    }

    public Integer getInvoice() {
        return invoice;
    }

    public void setInvoice(Integer invoice) {
        this.invoice = invoice;
    }

    public String getCompanyphone() {
        return companyphone;
    }

    public void setCompanyphone(String companyphone) {
        this.companyphone = companyphone == null ? null : companyphone.trim();
    }

    public Double getPay() {
        return pay;
    }

    public void setPay(Double pay) {
        this.pay = pay;
    }

    public Double getGoodsprice() {
        return goodsprice;
    }

    public void setGoodsprice(Double goodsprice) {
        this.goodsprice = goodsprice;
    }

    public String getReceivername() {
        return receivername;
    }

    public void setReceivername(String receivername) {
        this.receivername = receivername == null ? null : receivername.trim();
    }

    public String getReceiverphone() {
        return receiverphone;
    }

    public void setReceiverphone(String receiverphone) {
        this.receiverphone = receiverphone == null ? null : receiverphone.trim();
    }
}