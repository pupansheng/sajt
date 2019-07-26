package com.pps.suanjiaotyong.pojo;

public class CompanypublishWithBLOBs extends Companypublish {
    private String remark;

    private String receiverpeople;

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getReceiverpeople() {
        return receiverpeople;
    }

    public void setReceiverpeople(String receiverpeople) {
        this.receiverpeople = receiverpeople == null ? null : receiverpeople.trim();
    }

    @Override
    public String toString() {
        return "CompanypublishWithBLOBs{" +
                "receiverpeople='" + receiverpeople + '\'' +
                ", id='" + id + '\'' +
                ", uid=" + uid +
                ", linkname='" + linkname + '\'' +
                ", linkphone='" + linkphone + '\'' +
                ", goodsname='" + goodsname + '\'' +
                ", goodslength=" + goodslength +
                ", goodsheight=" + goodsheight +
                ", goodswidth=" + goodswidth +
                ", goodsamount=" + goodsamount +
                ", needtype='" + needtype + '\'' +
                ", cartype='" + cartype + '\'' +
                ", toaddress='" + toaddress + '\'' +
                ", loadtime=" + loadtime +
                ", unloadtime=" + unloadtime +
                ", goodsprice=" + goodsprice +
                ", accountprice=" + accountprice +
                ", assessedprice=" + assessedprice +
                ", invoice=" + invoice +
                ", paytype=" + paytype +
                ", createtime=" + createtime +
                ", lever=" + lever +
                '}';
    }
}