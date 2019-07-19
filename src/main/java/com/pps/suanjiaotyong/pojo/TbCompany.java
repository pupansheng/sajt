package com.pps.suanjiaotyong.pojo;

public class TbCompany {
    private Integer id;

    private String companyname;

    private String companyaddress;

    private String companylicence;

    private String accountlicence;

    private String corporateidentitycard;

    private String companylinkname;

    private String companyphone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getCompanylicence() {
        return companylicence;
    }

    public void setCompanylicence(String companylicence) {
        this.companylicence = companylicence == null ? null : companylicence.trim();
    }

    public String getAccountlicence() {
        return accountlicence;
    }

    public void setAccountlicence(String accountlicence) {
        this.accountlicence = accountlicence == null ? null : accountlicence.trim();
    }

    public String getCorporateidentitycard() {
        return corporateidentitycard;
    }

    public void setCorporateidentitycard(String corporateidentitycard) {
        this.corporateidentitycard = corporateidentitycard == null ? null : corporateidentitycard.trim();
    }

    public String getCompanylinkname() {
        return companylinkname;
    }

    public void setCompanylinkname(String companylinkname) {
        this.companylinkname = companylinkname == null ? null : companylinkname.trim();
    }

    public String getCompanyphone() {
        return companyphone;
    }

    public void setCompanyphone(String companyphone) {
        this.companyphone = companyphone == null ? null : companyphone.trim();
    }
}