package com.humanresources.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AttendanceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AttendanceExample() {
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

        public Criteria andWorktimeIsNull() {
            addCriterion("worktime is null");
            return (Criteria) this;
        }

        public Criteria andWorktimeIsNotNull() {
            addCriterion("worktime is not null");
            return (Criteria) this;
        }

        public Criteria andWorktimeEqualTo(Date value) {
            addCriterion("worktime =", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeNotEqualTo(Date value) {
            addCriterion("worktime <>", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeGreaterThan(Date value) {
            addCriterion("worktime >", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeGreaterThanOrEqualTo(Date value) {
            addCriterion("worktime >=", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeLessThan(Date value) {
            addCriterion("worktime <", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeLessThanOrEqualTo(Date value) {
            addCriterion("worktime <=", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeIn(List<Date> values) {
            addCriterion("worktime in", values, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeNotIn(List<Date> values) {
            addCriterion("worktime not in", values, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeBetween(Date value1, Date value2) {
            addCriterion("worktime between", value1, value2, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeNotBetween(Date value1, Date value2) {
            addCriterion("worktime not between", value1, value2, "worktime");
            return (Criteria) this;
        }

        public Criteria andAfterworktimeIsNull() {
            addCriterion("afterworktime is null");
            return (Criteria) this;
        }

        public Criteria andAfterworktimeIsNotNull() {
            addCriterion("afterworktime is not null");
            return (Criteria) this;
        }

        public Criteria andAfterworktimeEqualTo(Date value) {
            addCriterion("afterworktime =", value, "afterworktime");
            return (Criteria) this;
        }

        public Criteria andAfterworktimeNotEqualTo(Date value) {
            addCriterion("afterworktime <>", value, "afterworktime");
            return (Criteria) this;
        }

        public Criteria andAfterworktimeGreaterThan(Date value) {
            addCriterion("afterworktime >", value, "afterworktime");
            return (Criteria) this;
        }

        public Criteria andAfterworktimeGreaterThanOrEqualTo(Date value) {
            addCriterion("afterworktime >=", value, "afterworktime");
            return (Criteria) this;
        }

        public Criteria andAfterworktimeLessThan(Date value) {
            addCriterion("afterworktime <", value, "afterworktime");
            return (Criteria) this;
        }

        public Criteria andAfterworktimeLessThanOrEqualTo(Date value) {
            addCriterion("afterworktime <=", value, "afterworktime");
            return (Criteria) this;
        }

        public Criteria andAfterworktimeIn(List<Date> values) {
            addCriterion("afterworktime in", values, "afterworktime");
            return (Criteria) this;
        }

        public Criteria andAfterworktimeNotIn(List<Date> values) {
            addCriterion("afterworktime not in", values, "afterworktime");
            return (Criteria) this;
        }

        public Criteria andAfterworktimeBetween(Date value1, Date value2) {
            addCriterion("afterworktime between", value1, value2, "afterworktime");
            return (Criteria) this;
        }

        public Criteria andAfterworktimeNotBetween(Date value1, Date value2) {
            addCriterion("afterworktime not between", value1, value2, "afterworktime");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andWorkstateidIsNull() {
            addCriterion("workstateid is null");
            return (Criteria) this;
        }

        public Criteria andWorkstateidIsNotNull() {
            addCriterion("workstateid is not null");
            return (Criteria) this;
        }

        public Criteria andWorkstateidEqualTo(Integer value) {
            addCriterion("workstateid =", value, "workstateid");
            return (Criteria) this;
        }

        public Criteria andWorkstateidNotEqualTo(Integer value) {
            addCriterion("workstateid <>", value, "workstateid");
            return (Criteria) this;
        }

        public Criteria andWorkstateidGreaterThan(Integer value) {
            addCriterion("workstateid >", value, "workstateid");
            return (Criteria) this;
        }

        public Criteria andWorkstateidGreaterThanOrEqualTo(Integer value) {
            addCriterion("workstateid >=", value, "workstateid");
            return (Criteria) this;
        }

        public Criteria andWorkstateidLessThan(Integer value) {
            addCriterion("workstateid <", value, "workstateid");
            return (Criteria) this;
        }

        public Criteria andWorkstateidLessThanOrEqualTo(Integer value) {
            addCriterion("workstateid <=", value, "workstateid");
            return (Criteria) this;
        }

        public Criteria andWorkstateidIn(List<Integer> values) {
            addCriterion("workstateid in", values, "workstateid");
            return (Criteria) this;
        }

        public Criteria andWorkstateidNotIn(List<Integer> values) {
            addCriterion("workstateid not in", values, "workstateid");
            return (Criteria) this;
        }

        public Criteria andWorkstateidBetween(Integer value1, Integer value2) {
            addCriterion("workstateid between", value1, value2, "workstateid");
            return (Criteria) this;
        }

        public Criteria andWorkstateidNotBetween(Integer value1, Integer value2) {
            addCriterion("workstateid not between", value1, value2, "workstateid");
            return (Criteria) this;
        }

        public Criteria andAfterstateidIsNull() {
            addCriterion("afterstateid is null");
            return (Criteria) this;
        }

        public Criteria andAfterstateidIsNotNull() {
            addCriterion("afterstateid is not null");
            return (Criteria) this;
        }

        public Criteria andAfterstateidEqualTo(Integer value) {
            addCriterion("afterstateid =", value, "afterstateid");
            return (Criteria) this;
        }

        public Criteria andAfterstateidNotEqualTo(Integer value) {
            addCriterion("afterstateid <>", value, "afterstateid");
            return (Criteria) this;
        }

        public Criteria andAfterstateidGreaterThan(Integer value) {
            addCriterion("afterstateid >", value, "afterstateid");
            return (Criteria) this;
        }

        public Criteria andAfterstateidGreaterThanOrEqualTo(Integer value) {
            addCriterion("afterstateid >=", value, "afterstateid");
            return (Criteria) this;
        }

        public Criteria andAfterstateidLessThan(Integer value) {
            addCriterion("afterstateid <", value, "afterstateid");
            return (Criteria) this;
        }

        public Criteria andAfterstateidLessThanOrEqualTo(Integer value) {
            addCriterion("afterstateid <=", value, "afterstateid");
            return (Criteria) this;
        }

        public Criteria andAfterstateidIn(List<Integer> values) {
            addCriterion("afterstateid in", values, "afterstateid");
            return (Criteria) this;
        }

        public Criteria andAfterstateidNotIn(List<Integer> values) {
            addCriterion("afterstateid not in", values, "afterstateid");
            return (Criteria) this;
        }

        public Criteria andAfterstateidBetween(Integer value1, Integer value2) {
            addCriterion("afterstateid between", value1, value2, "afterstateid");
            return (Criteria) this;
        }

        public Criteria andAfterstateidNotBetween(Integer value1, Integer value2) {
            addCriterion("afterstateid not between", value1, value2, "afterstateid");
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