package com.pps.suanjiaotyong.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbDriverExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbDriverExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNull() {
            addCriterion("realName is null");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNotNull() {
            addCriterion("realName is not null");
            return (Criteria) this;
        }

        public Criteria andRealnameEqualTo(String value) {
            addCriterion("realName =", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotEqualTo(String value) {
            addCriterion("realName <>", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThan(String value) {
            addCriterion("realName >", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("realName >=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThan(String value) {
            addCriterion("realName <", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThanOrEqualTo(String value) {
            addCriterion("realName <=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLike(String value) {
            addCriterion("realName like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotLike(String value) {
            addCriterion("realName not like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameIn(List<String> values) {
            addCriterion("realName in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotIn(List<String> values) {
            addCriterion("realName not in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameBetween(String value1, String value2) {
            addCriterion("realName between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotBetween(String value1, String value2) {
            addCriterion("realName not between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCartypeIsNull() {
            addCriterion("carType is null");
            return (Criteria) this;
        }

        public Criteria andCartypeIsNotNull() {
            addCriterion("carType is not null");
            return (Criteria) this;
        }

        public Criteria andCartypeEqualTo(String value) {
            addCriterion("carType =", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeNotEqualTo(String value) {
            addCriterion("carType <>", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeGreaterThan(String value) {
            addCriterion("carType >", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeGreaterThanOrEqualTo(String value) {
            addCriterion("carType >=", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeLessThan(String value) {
            addCriterion("carType <", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeLessThanOrEqualTo(String value) {
            addCriterion("carType <=", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeLike(String value) {
            addCriterion("carType like", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeNotLike(String value) {
            addCriterion("carType not like", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeIn(List<String> values) {
            addCriterion("carType in", values, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeNotIn(List<String> values) {
            addCriterion("carType not in", values, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeBetween(String value1, String value2) {
            addCriterion("carType between", value1, value2, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeNotBetween(String value1, String value2) {
            addCriterion("carType not between", value1, value2, "cartype");
            return (Criteria) this;
        }

        public Criteria andCarnumberIsNull() {
            addCriterion("carNumber is null");
            return (Criteria) this;
        }

        public Criteria andCarnumberIsNotNull() {
            addCriterion("carNumber is not null");
            return (Criteria) this;
        }

        public Criteria andCarnumberEqualTo(String value) {
            addCriterion("carNumber =", value, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberNotEqualTo(String value) {
            addCriterion("carNumber <>", value, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberGreaterThan(String value) {
            addCriterion("carNumber >", value, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberGreaterThanOrEqualTo(String value) {
            addCriterion("carNumber >=", value, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberLessThan(String value) {
            addCriterion("carNumber <", value, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberLessThanOrEqualTo(String value) {
            addCriterion("carNumber <=", value, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberLike(String value) {
            addCriterion("carNumber like", value, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberNotLike(String value) {
            addCriterion("carNumber not like", value, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberIn(List<String> values) {
            addCriterion("carNumber in", values, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberNotIn(List<String> values) {
            addCriterion("carNumber not in", values, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberBetween(String value1, String value2) {
            addCriterion("carNumber between", value1, value2, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarnumberNotBetween(String value1, String value2) {
            addCriterion("carNumber not between", value1, value2, "carnumber");
            return (Criteria) this;
        }

        public Criteria andCarsizeIsNull() {
            addCriterion("carSize is null");
            return (Criteria) this;
        }

        public Criteria andCarsizeIsNotNull() {
            addCriterion("carSize is not null");
            return (Criteria) this;
        }

        public Criteria andCarsizeEqualTo(String value) {
            addCriterion("carSize =", value, "carsize");
            return (Criteria) this;
        }

        public Criteria andCarsizeNotEqualTo(String value) {
            addCriterion("carSize <>", value, "carsize");
            return (Criteria) this;
        }

        public Criteria andCarsizeGreaterThan(String value) {
            addCriterion("carSize >", value, "carsize");
            return (Criteria) this;
        }

        public Criteria andCarsizeGreaterThanOrEqualTo(String value) {
            addCriterion("carSize >=", value, "carsize");
            return (Criteria) this;
        }

        public Criteria andCarsizeLessThan(String value) {
            addCriterion("carSize <", value, "carsize");
            return (Criteria) this;
        }

        public Criteria andCarsizeLessThanOrEqualTo(String value) {
            addCriterion("carSize <=", value, "carsize");
            return (Criteria) this;
        }

        public Criteria andCarsizeLike(String value) {
            addCriterion("carSize like", value, "carsize");
            return (Criteria) this;
        }

        public Criteria andCarsizeNotLike(String value) {
            addCriterion("carSize not like", value, "carsize");
            return (Criteria) this;
        }

        public Criteria andCarsizeIn(List<String> values) {
            addCriterion("carSize in", values, "carsize");
            return (Criteria) this;
        }

        public Criteria andCarsizeNotIn(List<String> values) {
            addCriterion("carSize not in", values, "carsize");
            return (Criteria) this;
        }

        public Criteria andCarsizeBetween(String value1, String value2) {
            addCriterion("carSize between", value1, value2, "carsize");
            return (Criteria) this;
        }

        public Criteria andCarsizeNotBetween(String value1, String value2) {
            addCriterion("carSize not between", value1, value2, "carsize");
            return (Criteria) this;
        }

        public Criteria andMaxloadIsNull() {
            addCriterion("maxLoad is null");
            return (Criteria) this;
        }

        public Criteria andMaxloadIsNotNull() {
            addCriterion("maxLoad is not null");
            return (Criteria) this;
        }

        public Criteria andMaxloadEqualTo(String value) {
            addCriterion("maxLoad =", value, "maxload");
            return (Criteria) this;
        }

        public Criteria andMaxloadNotEqualTo(String value) {
            addCriterion("maxLoad <>", value, "maxload");
            return (Criteria) this;
        }

        public Criteria andMaxloadGreaterThan(String value) {
            addCriterion("maxLoad >", value, "maxload");
            return (Criteria) this;
        }

        public Criteria andMaxloadGreaterThanOrEqualTo(String value) {
            addCriterion("maxLoad >=", value, "maxload");
            return (Criteria) this;
        }

        public Criteria andMaxloadLessThan(String value) {
            addCriterion("maxLoad <", value, "maxload");
            return (Criteria) this;
        }

        public Criteria andMaxloadLessThanOrEqualTo(String value) {
            addCriterion("maxLoad <=", value, "maxload");
            return (Criteria) this;
        }

        public Criteria andMaxloadLike(String value) {
            addCriterion("maxLoad like", value, "maxload");
            return (Criteria) this;
        }

        public Criteria andMaxloadNotLike(String value) {
            addCriterion("maxLoad not like", value, "maxload");
            return (Criteria) this;
        }

        public Criteria andMaxloadIn(List<String> values) {
            addCriterion("maxLoad in", values, "maxload");
            return (Criteria) this;
        }

        public Criteria andMaxloadNotIn(List<String> values) {
            addCriterion("maxLoad not in", values, "maxload");
            return (Criteria) this;
        }

        public Criteria andMaxloadBetween(String value1, String value2) {
            addCriterion("maxLoad between", value1, value2, "maxload");
            return (Criteria) this;
        }

        public Criteria andMaxloadNotBetween(String value1, String value2) {
            addCriterion("maxLoad not between", value1, value2, "maxload");
            return (Criteria) this;
        }

        public Criteria andCarimageIsNull() {
            addCriterion("carImage is null");
            return (Criteria) this;
        }

        public Criteria andCarimageIsNotNull() {
            addCriterion("carImage is not null");
            return (Criteria) this;
        }

        public Criteria andCarimageEqualTo(String value) {
            addCriterion("carImage =", value, "carimage");
            return (Criteria) this;
        }

        public Criteria andCarimageNotEqualTo(String value) {
            addCriterion("carImage <>", value, "carimage");
            return (Criteria) this;
        }

        public Criteria andCarimageGreaterThan(String value) {
            addCriterion("carImage >", value, "carimage");
            return (Criteria) this;
        }

        public Criteria andCarimageGreaterThanOrEqualTo(String value) {
            addCriterion("carImage >=", value, "carimage");
            return (Criteria) this;
        }

        public Criteria andCarimageLessThan(String value) {
            addCriterion("carImage <", value, "carimage");
            return (Criteria) this;
        }

        public Criteria andCarimageLessThanOrEqualTo(String value) {
            addCriterion("carImage <=", value, "carimage");
            return (Criteria) this;
        }

        public Criteria andCarimageLike(String value) {
            addCriterion("carImage like", value, "carimage");
            return (Criteria) this;
        }

        public Criteria andCarimageNotLike(String value) {
            addCriterion("carImage not like", value, "carimage");
            return (Criteria) this;
        }

        public Criteria andCarimageIn(List<String> values) {
            addCriterion("carImage in", values, "carimage");
            return (Criteria) this;
        }

        public Criteria andCarimageNotIn(List<String> values) {
            addCriterion("carImage not in", values, "carimage");
            return (Criteria) this;
        }

        public Criteria andCarimageBetween(String value1, String value2) {
            addCriterion("carImage between", value1, value2, "carimage");
            return (Criteria) this;
        }

        public Criteria andCarimageNotBetween(String value1, String value2) {
            addCriterion("carImage not between", value1, value2, "carimage");
            return (Criteria) this;
        }

        public Criteria andIdcartimageIsNull() {
            addCriterion("idCartImage is null");
            return (Criteria) this;
        }

        public Criteria andIdcartimageIsNotNull() {
            addCriterion("idCartImage is not null");
            return (Criteria) this;
        }

        public Criteria andIdcartimageEqualTo(String value) {
            addCriterion("idCartImage =", value, "idcartimage");
            return (Criteria) this;
        }

        public Criteria andIdcartimageNotEqualTo(String value) {
            addCriterion("idCartImage <>", value, "idcartimage");
            return (Criteria) this;
        }

        public Criteria andIdcartimageGreaterThan(String value) {
            addCriterion("idCartImage >", value, "idcartimage");
            return (Criteria) this;
        }

        public Criteria andIdcartimageGreaterThanOrEqualTo(String value) {
            addCriterion("idCartImage >=", value, "idcartimage");
            return (Criteria) this;
        }

        public Criteria andIdcartimageLessThan(String value) {
            addCriterion("idCartImage <", value, "idcartimage");
            return (Criteria) this;
        }

        public Criteria andIdcartimageLessThanOrEqualTo(String value) {
            addCriterion("idCartImage <=", value, "idcartimage");
            return (Criteria) this;
        }

        public Criteria andIdcartimageLike(String value) {
            addCriterion("idCartImage like", value, "idcartimage");
            return (Criteria) this;
        }

        public Criteria andIdcartimageNotLike(String value) {
            addCriterion("idCartImage not like", value, "idcartimage");
            return (Criteria) this;
        }

        public Criteria andIdcartimageIn(List<String> values) {
            addCriterion("idCartImage in", values, "idcartimage");
            return (Criteria) this;
        }

        public Criteria andIdcartimageNotIn(List<String> values) {
            addCriterion("idCartImage not in", values, "idcartimage");
            return (Criteria) this;
        }

        public Criteria andIdcartimageBetween(String value1, String value2) {
            addCriterion("idCartImage between", value1, value2, "idcartimage");
            return (Criteria) this;
        }

        public Criteria andIdcartimageNotBetween(String value1, String value2) {
            addCriterion("idCartImage not between", value1, value2, "idcartimage");
            return (Criteria) this;
        }

        public Criteria andDriverslicenseimageIsNull() {
            addCriterion("driversLicenseImage is null");
            return (Criteria) this;
        }

        public Criteria andDriverslicenseimageIsNotNull() {
            addCriterion("driversLicenseImage is not null");
            return (Criteria) this;
        }

        public Criteria andDriverslicenseimageEqualTo(String value) {
            addCriterion("driversLicenseImage =", value, "driverslicenseimage");
            return (Criteria) this;
        }

        public Criteria andDriverslicenseimageNotEqualTo(String value) {
            addCriterion("driversLicenseImage <>", value, "driverslicenseimage");
            return (Criteria) this;
        }

        public Criteria andDriverslicenseimageGreaterThan(String value) {
            addCriterion("driversLicenseImage >", value, "driverslicenseimage");
            return (Criteria) this;
        }

        public Criteria andDriverslicenseimageGreaterThanOrEqualTo(String value) {
            addCriterion("driversLicenseImage >=", value, "driverslicenseimage");
            return (Criteria) this;
        }

        public Criteria andDriverslicenseimageLessThan(String value) {
            addCriterion("driversLicenseImage <", value, "driverslicenseimage");
            return (Criteria) this;
        }

        public Criteria andDriverslicenseimageLessThanOrEqualTo(String value) {
            addCriterion("driversLicenseImage <=", value, "driverslicenseimage");
            return (Criteria) this;
        }

        public Criteria andDriverslicenseimageLike(String value) {
            addCriterion("driversLicenseImage like", value, "driverslicenseimage");
            return (Criteria) this;
        }

        public Criteria andDriverslicenseimageNotLike(String value) {
            addCriterion("driversLicenseImage not like", value, "driverslicenseimage");
            return (Criteria) this;
        }

        public Criteria andDriverslicenseimageIn(List<String> values) {
            addCriterion("driversLicenseImage in", values, "driverslicenseimage");
            return (Criteria) this;
        }

        public Criteria andDriverslicenseimageNotIn(List<String> values) {
            addCriterion("driversLicenseImage not in", values, "driverslicenseimage");
            return (Criteria) this;
        }

        public Criteria andDriverslicenseimageBetween(String value1, String value2) {
            addCriterion("driversLicenseImage between", value1, value2, "driverslicenseimage");
            return (Criteria) this;
        }

        public Criteria andDriverslicenseimageNotBetween(String value1, String value2) {
            addCriterion("driversLicenseImage not between", value1, value2, "driverslicenseimage");
            return (Criteria) this;
        }

        public Criteria andWalkimagesIsNull() {
            addCriterion("walkImages is null");
            return (Criteria) this;
        }

        public Criteria andWalkimagesIsNotNull() {
            addCriterion("walkImages is not null");
            return (Criteria) this;
        }

        public Criteria andWalkimagesEqualTo(String value) {
            addCriterion("walkImages =", value, "walkimages");
            return (Criteria) this;
        }

        public Criteria andWalkimagesNotEqualTo(String value) {
            addCriterion("walkImages <>", value, "walkimages");
            return (Criteria) this;
        }

        public Criteria andWalkimagesGreaterThan(String value) {
            addCriterion("walkImages >", value, "walkimages");
            return (Criteria) this;
        }

        public Criteria andWalkimagesGreaterThanOrEqualTo(String value) {
            addCriterion("walkImages >=", value, "walkimages");
            return (Criteria) this;
        }

        public Criteria andWalkimagesLessThan(String value) {
            addCriterion("walkImages <", value, "walkimages");
            return (Criteria) this;
        }

        public Criteria andWalkimagesLessThanOrEqualTo(String value) {
            addCriterion("walkImages <=", value, "walkimages");
            return (Criteria) this;
        }

        public Criteria andWalkimagesLike(String value) {
            addCriterion("walkImages like", value, "walkimages");
            return (Criteria) this;
        }

        public Criteria andWalkimagesNotLike(String value) {
            addCriterion("walkImages not like", value, "walkimages");
            return (Criteria) this;
        }

        public Criteria andWalkimagesIn(List<String> values) {
            addCriterion("walkImages in", values, "walkimages");
            return (Criteria) this;
        }

        public Criteria andWalkimagesNotIn(List<String> values) {
            addCriterion("walkImages not in", values, "walkimages");
            return (Criteria) this;
        }

        public Criteria andWalkimagesBetween(String value1, String value2) {
            addCriterion("walkImages between", value1, value2, "walkimages");
            return (Criteria) this;
        }

        public Criteria andWalkimagesNotBetween(String value1, String value2) {
            addCriterion("walkImages not between", value1, value2, "walkimages");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}