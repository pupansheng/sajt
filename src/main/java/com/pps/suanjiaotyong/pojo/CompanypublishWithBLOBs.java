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
}