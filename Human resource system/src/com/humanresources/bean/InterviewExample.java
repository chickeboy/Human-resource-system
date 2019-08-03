package com.humanresources.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InterviewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InterviewExample() {
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

        public Criteria andResumeidIsNull() {
            addCriterion("resumeid is null");
            return (Criteria) this;
        }

        public Criteria andResumeidIsNotNull() {
            addCriterion("resumeid is not null");
            return (Criteria) this;
        }

        public Criteria andResumeidEqualTo(Integer value) {
            addCriterion("resumeid =", value, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidNotEqualTo(Integer value) {
            addCriterion("resumeid <>", value, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidGreaterThan(Integer value) {
            addCriterion("resumeid >", value, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("resumeid >=", value, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidLessThan(Integer value) {
            addCriterion("resumeid <", value, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidLessThanOrEqualTo(Integer value) {
            addCriterion("resumeid <=", value, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidIn(List<Integer> values) {
            addCriterion("resumeid in", values, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidNotIn(List<Integer> values) {
            addCriterion("resumeid not in", values, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidBetween(Integer value1, Integer value2) {
            addCriterion("resumeid between", value1, value2, "resumeid");
            return (Criteria) this;
        }

        public Criteria andResumeidNotBetween(Integer value1, Integer value2) {
            addCriterion("resumeid not between", value1, value2, "resumeid");
            return (Criteria) this;
        }

        public Criteria andRecruitmentidIsNull() {
            addCriterion("recruitmentid is null");
            return (Criteria) this;
        }

        public Criteria andRecruitmentidIsNotNull() {
            addCriterion("recruitmentid is not null");
            return (Criteria) this;
        }

        public Criteria andRecruitmentidEqualTo(Integer value) {
            addCriterion("recruitmentid =", value, "recruitmentid");
            return (Criteria) this;
        }

        public Criteria andRecruitmentidNotEqualTo(Integer value) {
            addCriterion("recruitmentid <>", value, "recruitmentid");
            return (Criteria) this;
        }

        public Criteria andRecruitmentidGreaterThan(Integer value) {
            addCriterion("recruitmentid >", value, "recruitmentid");
            return (Criteria) this;
        }

        public Criteria andRecruitmentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("recruitmentid >=", value, "recruitmentid");
            return (Criteria) this;
        }

        public Criteria andRecruitmentidLessThan(Integer value) {
            addCriterion("recruitmentid <", value, "recruitmentid");
            return (Criteria) this;
        }

        public Criteria andRecruitmentidLessThanOrEqualTo(Integer value) {
            addCriterion("recruitmentid <=", value, "recruitmentid");
            return (Criteria) this;
        }

        public Criteria andRecruitmentidIn(List<Integer> values) {
            addCriterion("recruitmentid in", values, "recruitmentid");
            return (Criteria) this;
        }

        public Criteria andRecruitmentidNotIn(List<Integer> values) {
            addCriterion("recruitmentid not in", values, "recruitmentid");
            return (Criteria) this;
        }

        public Criteria andRecruitmentidBetween(Integer value1, Integer value2) {
            addCriterion("recruitmentid between", value1, value2, "recruitmentid");
            return (Criteria) this;
        }

        public Criteria andRecruitmentidNotBetween(Integer value1, Integer value2) {
            addCriterion("recruitmentid not between", value1, value2, "recruitmentid");
            return (Criteria) this;
        }

        public Criteria andInterviewtimeIsNull() {
            addCriterion("interviewtime is null");
            return (Criteria) this;
        }

        public Criteria andInterviewtimeIsNotNull() {
            addCriterion("interviewtime is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewtimeEqualTo(Date value) {
            addCriterion("interviewtime =", value, "interviewtime");
            return (Criteria) this;
        }

        public Criteria andInterviewtimeNotEqualTo(Date value) {
            addCriterion("interviewtime <>", value, "interviewtime");
            return (Criteria) this;
        }

        public Criteria andInterviewtimeGreaterThan(Date value) {
            addCriterion("interviewtime >", value, "interviewtime");
            return (Criteria) this;
        }

        public Criteria andInterviewtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("interviewtime >=", value, "interviewtime");
            return (Criteria) this;
        }

        public Criteria andInterviewtimeLessThan(Date value) {
            addCriterion("interviewtime <", value, "interviewtime");
            return (Criteria) this;
        }

        public Criteria andInterviewtimeLessThanOrEqualTo(Date value) {
            addCriterion("interviewtime <=", value, "interviewtime");
            return (Criteria) this;
        }

        public Criteria andInterviewtimeIn(List<Date> values) {
            addCriterion("interviewtime in", values, "interviewtime");
            return (Criteria) this;
        }

        public Criteria andInterviewtimeNotIn(List<Date> values) {
            addCriterion("interviewtime not in", values, "interviewtime");
            return (Criteria) this;
        }

        public Criteria andInterviewtimeBetween(Date value1, Date value2) {
            addCriterion("interviewtime between", value1, value2, "interviewtime");
            return (Criteria) this;
        }

        public Criteria andInterviewtimeNotBetween(Date value1, Date value2) {
            addCriterion("interviewtime not between", value1, value2, "interviewtime");
            return (Criteria) this;
        }

        public Criteria andInterviewIsNull() {
            addCriterion("interview is null");
            return (Criteria) this;
        }

        public Criteria andInterviewIsNotNull() {
            addCriterion("interview is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewEqualTo(Integer value) {
            addCriterion("interview =", value, "interview");
            return (Criteria) this;
        }

        public Criteria andInterviewNotEqualTo(Integer value) {
            addCriterion("interview <>", value, "interview");
            return (Criteria) this;
        }

        public Criteria andInterviewGreaterThan(Integer value) {
            addCriterion("interview >", value, "interview");
            return (Criteria) this;
        }

        public Criteria andInterviewGreaterThanOrEqualTo(Integer value) {
            addCriterion("interview >=", value, "interview");
            return (Criteria) this;
        }

        public Criteria andInterviewLessThan(Integer value) {
            addCriterion("interview <", value, "interview");
            return (Criteria) this;
        }

        public Criteria andInterviewLessThanOrEqualTo(Integer value) {
            addCriterion("interview <=", value, "interview");
            return (Criteria) this;
        }

        public Criteria andInterviewIn(List<Integer> values) {
            addCriterion("interview in", values, "interview");
            return (Criteria) this;
        }

        public Criteria andInterviewNotIn(List<Integer> values) {
            addCriterion("interview not in", values, "interview");
            return (Criteria) this;
        }

        public Criteria andInterviewBetween(Integer value1, Integer value2) {
            addCriterion("interview between", value1, value2, "interview");
            return (Criteria) this;
        }

        public Criteria andInterviewNotBetween(Integer value1, Integer value2) {
            addCriterion("interview not between", value1, value2, "interview");
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