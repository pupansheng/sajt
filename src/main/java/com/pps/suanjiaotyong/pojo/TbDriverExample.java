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

        public Criteria andTruenameIsNull() {
            addCriterion("truename is null");
            return (Criteria) this;
        }

        public Criteria andTruenameIsNotNull() {
            addCriterion("truename is not null");
            return (Criteria) this;
        }

        public Criteria andTruenameEqualTo(String value) {
            addCriterion("truename =", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameNotEqualTo(String value) {
            addCriterion("truename <>", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameGreaterThan(String value) {
            addCriterion("truename >", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameGreaterThanOrEqualTo(String value) {
            addCriterion("truename >=", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameLessThan(String value) {
            addCriterion("truename <", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameLessThanOrEqualTo(String value) {
            addCriterion("truename <=", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameLike(String value) {
            addCriterion("truename like", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameNotLike(String value) {
            addCriterion("truename not like", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameIn(List<String> values) {
            addCriterion("truename in", values, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameNotIn(List<String> values) {
            addCriterion("truename not in", values, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameBetween(String value1, String value2) {
            addCriterion("truename between", value1, value2, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameNotBetween(String value1, String value2) {
            addCriterion("truename not between", value1, value2, "truename");
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

        public Criteria andCartypeIsNull() {
            addCriterion("cartype is null");
            return (Criteria) this;
        }

        public Criteria andCartypeIsNotNull() {
            addCriterion("cartype is not null");
            return (Criteria) this;
        }

        public Criteria andCartypeEqualTo(Integer value) {
            addCriterion("cartype =", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeNotEqualTo(Integer value) {
            addCriterion("cartype <>", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeGreaterThan(Integer value) {
            addCriterion("cartype >", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("cartype >=", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeLessThan(Integer value) {
            addCriterion("cartype <", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeLessThanOrEqualTo(Integer value) {
            addCriterion("cartype <=", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeIn(List<Integer> values) {
            addCriterion("cartype in", values, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeNotIn(List<Integer> values) {
            addCriterion("cartype not in", values, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeBetween(Integer value1, Integer value2) {
            addCriterion("cartype between", value1, value2, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeNotBetween(Integer value1, Integer value2) {
            addCriterion("cartype not between", value1, value2, "cartype");
            return (Criteria) this;
        }

        public Criteria andPlatenumIsNull() {
            addCriterion("platenum is null");
            return (Criteria) this;
        }

        public Criteria andPlatenumIsNotNull() {
            addCriterion("platenum is not null");
            return (Criteria) this;
        }

        public Criteria andPlatenumEqualTo(String value) {
            addCriterion("platenum =", value, "platenum");
            return (Criteria) this;
        }

        public Criteria andPlatenumNotEqualTo(String value) {
            addCriterion("platenum <>", value, "platenum");
            return (Criteria) this;
        }

        public Criteria andPlatenumGreaterThan(String value) {
            addCriterion("platenum >", value, "platenum");
            return (Criteria) this;
        }

        public Criteria andPlatenumGreaterThanOrEqualTo(String value) {
            addCriterion("platenum >=", value, "platenum");
            return (Criteria) this;
        }

        public Criteria andPlatenumLessThan(String value) {
            addCriterion("platenum <", value, "platenum");
            return (Criteria) this;
        }

        public Criteria andPlatenumLessThanOrEqualTo(String value) {
            addCriterion("platenum <=", value, "platenum");
            return (Criteria) this;
        }

        public Criteria andPlatenumLike(String value) {
            addCriterion("platenum like", value, "platenum");
            return (Criteria) this;
        }

        public Criteria andPlatenumNotLike(String value) {
            addCriterion("platenum not like", value, "platenum");
            return (Criteria) this;
        }

        public Criteria andPlatenumIn(List<String> values) {
            addCriterion("platenum in", values, "platenum");
            return (Criteria) this;
        }

        public Criteria andPlatenumNotIn(List<String> values) {
            addCriterion("platenum not in", values, "platenum");
            return (Criteria) this;
        }

        public Criteria andPlatenumBetween(String value1, String value2) {
            addCriterion("platenum between", value1, value2, "platenum");
            return (Criteria) this;
        }

        public Criteria andPlatenumNotBetween(String value1, String value2) {
            addCriterion("platenum not between", value1, value2, "platenum");
            return (Criteria) this;
        }

        public Criteria andCarsizeIsNull() {
            addCriterion("carsize is null");
            return (Criteria) this;
        }

        public Criteria andCarsizeIsNotNull() {
            addCriterion("carsize is not null");
            return (Criteria) this;
        }

        public Criteria andCarsizeEqualTo(String value) {
            addCriterion("carsize =", value, "carsize");
            return (Criteria) this;
        }

        public Criteria andCarsizeNotEqualTo(String value) {
            addCriterion("carsize <>", value, "carsize");
            return (Criteria) this;
        }

        public Criteria andCarsizeGreaterThan(String value) {
            addCriterion("carsize >", value, "carsize");
            return (Criteria) this;
        }

        public Criteria andCarsizeGreaterThanOrEqualTo(String value) {
            addCriterion("carsize >=", value, "carsize");
            return (Criteria) this;
        }

        public Criteria andCarsizeLessThan(String value) {
            addCriterion("carsize <", value, "carsize");
            return (Criteria) this;
        }

        public Criteria andCarsizeLessThanOrEqualTo(String value) {
            addCriterion("carsize <=", value, "carsize");
            return (Criteria) this;
        }

        public Criteria andCarsizeLike(String value) {
            addCriterion("carsize like", value, "carsize");
            return (Criteria) this;
        }

        public Criteria andCarsizeNotLike(String value) {
            addCriterion("carsize not like", value, "carsize");
            return (Criteria) this;
        }

        public Criteria andCarsizeIn(List<String> values) {
            addCriterion("carsize in", values, "carsize");
            return (Criteria) this;
        }

        public Criteria andCarsizeNotIn(List<String> values) {
            addCriterion("carsize not in", values, "carsize");
            return (Criteria) this;
        }

        public Criteria andCarsizeBetween(String value1, String value2) {
            addCriterion("carsize between", value1, value2, "carsize");
            return (Criteria) this;
        }

        public Criteria andCarsizeNotBetween(String value1, String value2) {
            addCriterion("carsize not between", value1, value2, "carsize");
            return (Criteria) this;
        }

        public Criteria andMaxloadIsNull() {
            addCriterion("maxload is null");
            return (Criteria) this;
        }

        public Criteria andMaxloadIsNotNull() {
            addCriterion("maxload is not null");
            return (Criteria) this;
        }

        public Criteria andMaxloadEqualTo(String value) {
            addCriterion("maxload =", value, "maxload");
            return (Criteria) this;
        }

        public Criteria andMaxloadNotEqualTo(String value) {
            addCriterion("maxload <>", value, "maxload");
            return (Criteria) this;
        }

        public Criteria andMaxloadGreaterThan(String value) {
            addCriterion("maxload >", value, "maxload");
            return (Criteria) this;
        }

        public Criteria andMaxloadGreaterThanOrEqualTo(String value) {
            addCriterion("maxload >=", value, "maxload");
            return (Criteria) this;
        }

        public Criteria andMaxloadLessThan(String value) {
            addCriterion("maxload <", value, "maxload");
            return (Criteria) this;
        }

        public Criteria andMaxloadLessThanOrEqualTo(String value) {
            addCriterion("maxload <=", value, "maxload");
            return (Criteria) this;
        }

        public Criteria andMaxloadLike(String value) {
            addCriterion("maxload like", value, "maxload");
            return (Criteria) this;
        }

        public Criteria andMaxloadNotLike(String value) {
            addCriterion("maxload not like", value, "maxload");
            return (Criteria) this;
        }

        public Criteria andMaxloadIn(List<String> values) {
            addCriterion("maxload in", values, "maxload");
            return (Criteria) this;
        }

        public Criteria andMaxloadNotIn(List<String> values) {
            addCriterion("maxload not in", values, "maxload");
            return (Criteria) this;
        }

        public Criteria andMaxloadBetween(String value1, String value2) {
            addCriterion("maxload between", value1, value2, "maxload");
            return (Criteria) this;
        }

        public Criteria andMaxloadNotBetween(String value1, String value2) {
            addCriterion("maxload not between", value1, value2, "maxload");
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