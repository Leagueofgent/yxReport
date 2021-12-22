package com.aks.yxReport.pojo;

import java.util.ArrayList;
import java.util.List;

public class ClbxReportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClbxReportExample() {
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

        public Criteria andDhIsNull() {
            addCriterion("dh is null");
            return (Criteria) this;
        }

        public Criteria andDhIsNotNull() {
            addCriterion("dh is not null");
            return (Criteria) this;
        }

        public Criteria andDhEqualTo(String value) {
            addCriterion("dh =", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhNotEqualTo(String value) {
            addCriterion("dh <>", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhGreaterThan(String value) {
            addCriterion("dh >", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhGreaterThanOrEqualTo(String value) {
            addCriterion("dh >=", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhLessThan(String value) {
            addCriterion("dh <", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhLessThanOrEqualTo(String value) {
            addCriterion("dh <=", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhLike(String value) {
            addCriterion("dh like", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhNotLike(String value) {
            addCriterion("dh not like", value, "dh");
            return (Criteria) this;
        }

        public Criteria andDhIn(List<String> values) {
            addCriterion("dh in", values, "dh");
            return (Criteria) this;
        }

        public Criteria andDhNotIn(List<String> values) {
            addCriterion("dh not in", values, "dh");
            return (Criteria) this;
        }

        public Criteria andDhBetween(String value1, String value2) {
            addCriterion("dh between", value1, value2, "dh");
            return (Criteria) this;
        }

        public Criteria andDhNotBetween(String value1, String value2) {
            addCriterion("dh not between", value1, value2, "dh");
            return (Criteria) this;
        }

        public Criteria andSqrIsNull() {
            addCriterion("sqr is null");
            return (Criteria) this;
        }

        public Criteria andSqrIsNotNull() {
            addCriterion("sqr is not null");
            return (Criteria) this;
        }

        public Criteria andSqrEqualTo(String value) {
            addCriterion("sqr =", value, "sqr");
            return (Criteria) this;
        }

        public Criteria andSqrNotEqualTo(String value) {
            addCriterion("sqr <>", value, "sqr");
            return (Criteria) this;
        }

        public Criteria andSqrGreaterThan(String value) {
            addCriterion("sqr >", value, "sqr");
            return (Criteria) this;
        }

        public Criteria andSqrGreaterThanOrEqualTo(String value) {
            addCriterion("sqr >=", value, "sqr");
            return (Criteria) this;
        }

        public Criteria andSqrLessThan(String value) {
            addCriterion("sqr <", value, "sqr");
            return (Criteria) this;
        }

        public Criteria andSqrLessThanOrEqualTo(String value) {
            addCriterion("sqr <=", value, "sqr");
            return (Criteria) this;
        }

        public Criteria andSqrLike(String value) {
            addCriterion("sqr like", value, "sqr");
            return (Criteria) this;
        }

        public Criteria andSqrNotLike(String value) {
            addCriterion("sqr not like", value, "sqr");
            return (Criteria) this;
        }

        public Criteria andSqrIn(List<String> values) {
            addCriterion("sqr in", values, "sqr");
            return (Criteria) this;
        }

        public Criteria andSqrNotIn(List<String> values) {
            addCriterion("sqr not in", values, "sqr");
            return (Criteria) this;
        }

        public Criteria andSqrBetween(String value1, String value2) {
            addCriterion("sqr between", value1, value2, "sqr");
            return (Criteria) this;
        }

        public Criteria andSqrNotBetween(String value1, String value2) {
            addCriterion("sqr not between", value1, value2, "sqr");
            return (Criteria) this;
        }

        public Criteria andSsbmIsNull() {
            addCriterion("ssbm is null");
            return (Criteria) this;
        }

        public Criteria andSsbmIsNotNull() {
            addCriterion("ssbm is not null");
            return (Criteria) this;
        }

        public Criteria andSsbmEqualTo(String value) {
            addCriterion("ssbm =", value, "ssbm");
            return (Criteria) this;
        }

        public Criteria andSsbmNotEqualTo(String value) {
            addCriterion("ssbm <>", value, "ssbm");
            return (Criteria) this;
        }

        public Criteria andSsbmGreaterThan(String value) {
            addCriterion("ssbm >", value, "ssbm");
            return (Criteria) this;
        }

        public Criteria andSsbmGreaterThanOrEqualTo(String value) {
            addCriterion("ssbm >=", value, "ssbm");
            return (Criteria) this;
        }

        public Criteria andSsbmLessThan(String value) {
            addCriterion("ssbm <", value, "ssbm");
            return (Criteria) this;
        }

        public Criteria andSsbmLessThanOrEqualTo(String value) {
            addCriterion("ssbm <=", value, "ssbm");
            return (Criteria) this;
        }

        public Criteria andSsbmLike(String value) {
            addCriterion("ssbm like", value, "ssbm");
            return (Criteria) this;
        }

        public Criteria andSsbmNotLike(String value) {
            addCriterion("ssbm not like", value, "ssbm");
            return (Criteria) this;
        }

        public Criteria andSsbmIn(List<String> values) {
            addCriterion("ssbm in", values, "ssbm");
            return (Criteria) this;
        }

        public Criteria andSsbmNotIn(List<String> values) {
            addCriterion("ssbm not in", values, "ssbm");
            return (Criteria) this;
        }

        public Criteria andSsbmBetween(String value1, String value2) {
            addCriterion("ssbm between", value1, value2, "ssbm");
            return (Criteria) this;
        }

        public Criteria andSsbmNotBetween(String value1, String value2) {
            addCriterion("ssbm not between", value1, value2, "ssbm");
            return (Criteria) this;
        }

        public Criteria andFycdbmIsNull() {
            addCriterion("fycdbm is null");
            return (Criteria) this;
        }

        public Criteria andFycdbmIsNotNull() {
            addCriterion("fycdbm is not null");
            return (Criteria) this;
        }

        public Criteria andFycdbmEqualTo(String value) {
            addCriterion("fycdbm =", value, "fycdbm");
            return (Criteria) this;
        }

        public Criteria andFycdbmNotEqualTo(String value) {
            addCriterion("fycdbm <>", value, "fycdbm");
            return (Criteria) this;
        }

        public Criteria andFycdbmGreaterThan(String value) {
            addCriterion("fycdbm >", value, "fycdbm");
            return (Criteria) this;
        }

        public Criteria andFycdbmGreaterThanOrEqualTo(String value) {
            addCriterion("fycdbm >=", value, "fycdbm");
            return (Criteria) this;
        }

        public Criteria andFycdbmLessThan(String value) {
            addCriterion("fycdbm <", value, "fycdbm");
            return (Criteria) this;
        }

        public Criteria andFycdbmLessThanOrEqualTo(String value) {
            addCriterion("fycdbm <=", value, "fycdbm");
            return (Criteria) this;
        }

        public Criteria andFycdbmLike(String value) {
            addCriterion("fycdbm like", value, "fycdbm");
            return (Criteria) this;
        }

        public Criteria andFycdbmNotLike(String value) {
            addCriterion("fycdbm not like", value, "fycdbm");
            return (Criteria) this;
        }

        public Criteria andFycdbmIn(List<String> values) {
            addCriterion("fycdbm in", values, "fycdbm");
            return (Criteria) this;
        }

        public Criteria andFycdbmNotIn(List<String> values) {
            addCriterion("fycdbm not in", values, "fycdbm");
            return (Criteria) this;
        }

        public Criteria andFycdbmBetween(String value1, String value2) {
            addCriterion("fycdbm between", value1, value2, "fycdbm");
            return (Criteria) this;
        }

        public Criteria andFycdbmNotBetween(String value1, String value2) {
            addCriterion("fycdbm not between", value1, value2, "fycdbm");
            return (Criteria) this;
        }

        public Criteria andSqrqIsNull() {
            addCriterion("sqrq is null");
            return (Criteria) this;
        }

        public Criteria andSqrqIsNotNull() {
            addCriterion("sqrq is not null");
            return (Criteria) this;
        }

        public Criteria andSqrqEqualTo(String value) {
            addCriterion("sqrq =", value, "sqrq");
            return (Criteria) this;
        }

        public Criteria andSqrqNotEqualTo(String value) {
            addCriterion("sqrq <>", value, "sqrq");
            return (Criteria) this;
        }

        public Criteria andSqrqGreaterThan(String value) {
            addCriterion("sqrq >", value, "sqrq");
            return (Criteria) this;
        }

        public Criteria andSqrqGreaterThanOrEqualTo(String value) {
            addCriterion("sqrq >=", value, "sqrq");
            return (Criteria) this;
        }

        public Criteria andSqrqLessThan(String value) {
            addCriterion("sqrq <", value, "sqrq");
            return (Criteria) this;
        }

        public Criteria andSqrqLessThanOrEqualTo(String value) {
            addCriterion("sqrq <=", value, "sqrq");
            return (Criteria) this;
        }

        public Criteria andSqrqLike(String value) {
            addCriterion("sqrq like", value, "sqrq");
            return (Criteria) this;
        }

        public Criteria andSqrqNotLike(String value) {
            addCriterion("sqrq not like", value, "sqrq");
            return (Criteria) this;
        }

        public Criteria andSqrqIn(List<String> values) {
            addCriterion("sqrq in", values, "sqrq");
            return (Criteria) this;
        }

        public Criteria andSqrqNotIn(List<String> values) {
            addCriterion("sqrq not in", values, "sqrq");
            return (Criteria) this;
        }

        public Criteria andSqrqBetween(String value1, String value2) {
            addCriterion("sqrq between", value1, value2, "sqrq");
            return (Criteria) this;
        }

        public Criteria andSqrqNotBetween(String value1, String value2) {
            addCriterion("sqrq not between", value1, value2, "sqrq");
            return (Criteria) this;
        }

        public Criteria andFygsIsNull() {
            addCriterion("fygs is null");
            return (Criteria) this;
        }

        public Criteria andFygsIsNotNull() {
            addCriterion("fygs is not null");
            return (Criteria) this;
        }

        public Criteria andFygsEqualTo(String value) {
            addCriterion("fygs =", value, "fygs");
            return (Criteria) this;
        }

        public Criteria andFygsNotEqualTo(String value) {
            addCriterion("fygs <>", value, "fygs");
            return (Criteria) this;
        }

        public Criteria andFygsGreaterThan(String value) {
            addCriterion("fygs >", value, "fygs");
            return (Criteria) this;
        }

        public Criteria andFygsGreaterThanOrEqualTo(String value) {
            addCriterion("fygs >=", value, "fygs");
            return (Criteria) this;
        }

        public Criteria andFygsLessThan(String value) {
            addCriterion("fygs <", value, "fygs");
            return (Criteria) this;
        }

        public Criteria andFygsLessThanOrEqualTo(String value) {
            addCriterion("fygs <=", value, "fygs");
            return (Criteria) this;
        }

        public Criteria andFygsLike(String value) {
            addCriterion("fygs like", value, "fygs");
            return (Criteria) this;
        }

        public Criteria andFygsNotLike(String value) {
            addCriterion("fygs not like", value, "fygs");
            return (Criteria) this;
        }

        public Criteria andFygsIn(List<String> values) {
            addCriterion("fygs in", values, "fygs");
            return (Criteria) this;
        }

        public Criteria andFygsNotIn(List<String> values) {
            addCriterion("fygs not in", values, "fygs");
            return (Criteria) this;
        }

        public Criteria andFygsBetween(String value1, String value2) {
            addCriterion("fygs between", value1, value2, "fygs");
            return (Criteria) this;
        }

        public Criteria andFygsNotBetween(String value1, String value2) {
            addCriterion("fygs not between", value1, value2, "fygs");
            return (Criteria) this;
        }

        public Criteria andXmhIsNull() {
            addCriterion("xmh is null");
            return (Criteria) this;
        }

        public Criteria andXmhIsNotNull() {
            addCriterion("xmh is not null");
            return (Criteria) this;
        }

        public Criteria andXmhEqualTo(String value) {
            addCriterion("xmh =", value, "xmh");
            return (Criteria) this;
        }

        public Criteria andXmhNotEqualTo(String value) {
            addCriterion("xmh <>", value, "xmh");
            return (Criteria) this;
        }

        public Criteria andXmhGreaterThan(String value) {
            addCriterion("xmh >", value, "xmh");
            return (Criteria) this;
        }

        public Criteria andXmhGreaterThanOrEqualTo(String value) {
            addCriterion("xmh >=", value, "xmh");
            return (Criteria) this;
        }

        public Criteria andXmhLessThan(String value) {
            addCriterion("xmh <", value, "xmh");
            return (Criteria) this;
        }

        public Criteria andXmhLessThanOrEqualTo(String value) {
            addCriterion("xmh <=", value, "xmh");
            return (Criteria) this;
        }

        public Criteria andXmhLike(String value) {
            addCriterion("xmh like", value, "xmh");
            return (Criteria) this;
        }

        public Criteria andXmhNotLike(String value) {
            addCriterion("xmh not like", value, "xmh");
            return (Criteria) this;
        }

        public Criteria andXmhIn(List<String> values) {
            addCriterion("xmh in", values, "xmh");
            return (Criteria) this;
        }

        public Criteria andXmhNotIn(List<String> values) {
            addCriterion("xmh not in", values, "xmh");
            return (Criteria) this;
        }

        public Criteria andXmhBetween(String value1, String value2) {
            addCriterion("xmh between", value1, value2, "xmh");
            return (Criteria) this;
        }

        public Criteria andXmhNotBetween(String value1, String value2) {
            addCriterion("xmh not between", value1, value2, "xmh");
            return (Criteria) this;
        }

        public Criteria andCwqrhjjeIsNull() {
            addCriterion("cwqrhjje is null");
            return (Criteria) this;
        }

        public Criteria andCwqrhjjeIsNotNull() {
            addCriterion("cwqrhjje is not null");
            return (Criteria) this;
        }

        public Criteria andCwqrhjjeEqualTo(String value) {
            addCriterion("cwqrhjje =", value, "cwqrhjje");
            return (Criteria) this;
        }

        public Criteria andCwqrhjjeNotEqualTo(String value) {
            addCriterion("cwqrhjje <>", value, "cwqrhjje");
            return (Criteria) this;
        }

        public Criteria andCwqrhjjeGreaterThan(String value) {
            addCriterion("cwqrhjje >", value, "cwqrhjje");
            return (Criteria) this;
        }

        public Criteria andCwqrhjjeGreaterThanOrEqualTo(String value) {
            addCriterion("cwqrhjje >=", value, "cwqrhjje");
            return (Criteria) this;
        }

        public Criteria andCwqrhjjeLessThan(String value) {
            addCriterion("cwqrhjje <", value, "cwqrhjje");
            return (Criteria) this;
        }

        public Criteria andCwqrhjjeLessThanOrEqualTo(String value) {
            addCriterion("cwqrhjje <=", value, "cwqrhjje");
            return (Criteria) this;
        }

        public Criteria andCwqrhjjeLike(String value) {
            addCriterion("cwqrhjje like", value, "cwqrhjje");
            return (Criteria) this;
        }

        public Criteria andCwqrhjjeNotLike(String value) {
            addCriterion("cwqrhjje not like", value, "cwqrhjje");
            return (Criteria) this;
        }

        public Criteria andCwqrhjjeIn(List<String> values) {
            addCriterion("cwqrhjje in", values, "cwqrhjje");
            return (Criteria) this;
        }

        public Criteria andCwqrhjjeNotIn(List<String> values) {
            addCriterion("cwqrhjje not in", values, "cwqrhjje");
            return (Criteria) this;
        }

        public Criteria andCwqrhjjeBetween(String value1, String value2) {
            addCriterion("cwqrhjje between", value1, value2, "cwqrhjje");
            return (Criteria) this;
        }

        public Criteria andCwqrhjjeNotBetween(String value1, String value2) {
            addCriterion("cwqrhjje not between", value1, value2, "cwqrhjje");
            return (Criteria) this;
        }

        public Criteria andDqhjIsNull() {
            addCriterion("dqhj is null");
            return (Criteria) this;
        }

        public Criteria andDqhjIsNotNull() {
            addCriterion("dqhj is not null");
            return (Criteria) this;
        }

        public Criteria andDqhjEqualTo(String value) {
            addCriterion("dqhj =", value, "dqhj");
            return (Criteria) this;
        }

        public Criteria andDqhjNotEqualTo(String value) {
            addCriterion("dqhj <>", value, "dqhj");
            return (Criteria) this;
        }

        public Criteria andDqhjGreaterThan(String value) {
            addCriterion("dqhj >", value, "dqhj");
            return (Criteria) this;
        }

        public Criteria andDqhjGreaterThanOrEqualTo(String value) {
            addCriterion("dqhj >=", value, "dqhj");
            return (Criteria) this;
        }

        public Criteria andDqhjLessThan(String value) {
            addCriterion("dqhj <", value, "dqhj");
            return (Criteria) this;
        }

        public Criteria andDqhjLessThanOrEqualTo(String value) {
            addCriterion("dqhj <=", value, "dqhj");
            return (Criteria) this;
        }

        public Criteria andDqhjLike(String value) {
            addCriterion("dqhj like", value, "dqhj");
            return (Criteria) this;
        }

        public Criteria andDqhjNotLike(String value) {
            addCriterion("dqhj not like", value, "dqhj");
            return (Criteria) this;
        }

        public Criteria andDqhjIn(List<String> values) {
            addCriterion("dqhj in", values, "dqhj");
            return (Criteria) this;
        }

        public Criteria andDqhjNotIn(List<String> values) {
            addCriterion("dqhj not in", values, "dqhj");
            return (Criteria) this;
        }

        public Criteria andDqhjBetween(String value1, String value2) {
            addCriterion("dqhj between", value1, value2, "dqhj");
            return (Criteria) this;
        }

        public Criteria andDqhjNotBetween(String value1, String value2) {
            addCriterion("dqhj not between", value1, value2, "dqhj");
            return (Criteria) this;
        }

        public Criteria andWdztIsNull() {
            addCriterion("wdzt is null");
            return (Criteria) this;
        }

        public Criteria andWdztIsNotNull() {
            addCriterion("wdzt is not null");
            return (Criteria) this;
        }

        public Criteria andWdztEqualTo(String value) {
            addCriterion("wdzt =", value, "wdzt");
            return (Criteria) this;
        }

        public Criteria andWdztNotEqualTo(String value) {
            addCriterion("wdzt <>", value, "wdzt");
            return (Criteria) this;
        }

        public Criteria andWdztGreaterThan(String value) {
            addCriterion("wdzt >", value, "wdzt");
            return (Criteria) this;
        }

        public Criteria andWdztGreaterThanOrEqualTo(String value) {
            addCriterion("wdzt >=", value, "wdzt");
            return (Criteria) this;
        }

        public Criteria andWdztLessThan(String value) {
            addCriterion("wdzt <", value, "wdzt");
            return (Criteria) this;
        }

        public Criteria andWdztLessThanOrEqualTo(String value) {
            addCriterion("wdzt <=", value, "wdzt");
            return (Criteria) this;
        }

        public Criteria andWdztLike(String value) {
            addCriterion("wdzt like", value, "wdzt");
            return (Criteria) this;
        }

        public Criteria andWdztNotLike(String value) {
            addCriterion("wdzt not like", value, "wdzt");
            return (Criteria) this;
        }

        public Criteria andWdztIn(List<String> values) {
            addCriterion("wdzt in", values, "wdzt");
            return (Criteria) this;
        }

        public Criteria andWdztNotIn(List<String> values) {
            addCriterion("wdzt not in", values, "wdzt");
            return (Criteria) this;
        }

        public Criteria andWdztBetween(String value1, String value2) {
            addCriterion("wdzt between", value1, value2, "wdzt");
            return (Criteria) this;
        }

        public Criteria andWdztNotBetween(String value1, String value2) {
            addCriterion("wdzt not between", value1, value2, "wdzt");
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