package com.aks.yxReport.pojo;

import java.util.ArrayList;
import java.util.List;

public class DgfkReportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DgfkReportExample() {
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

        public Criteria andFygsgsIsNull() {
            addCriterion("fygsgs is null");
            return (Criteria) this;
        }

        public Criteria andFygsgsIsNotNull() {
            addCriterion("fygsgs is not null");
            return (Criteria) this;
        }

        public Criteria andFygsgsEqualTo(String value) {
            addCriterion("fygsgs =", value, "fygsgs");
            return (Criteria) this;
        }

        public Criteria andFygsgsNotEqualTo(String value) {
            addCriterion("fygsgs <>", value, "fygsgs");
            return (Criteria) this;
        }

        public Criteria andFygsgsGreaterThan(String value) {
            addCriterion("fygsgs >", value, "fygsgs");
            return (Criteria) this;
        }

        public Criteria andFygsgsGreaterThanOrEqualTo(String value) {
            addCriterion("fygsgs >=", value, "fygsgs");
            return (Criteria) this;
        }

        public Criteria andFygsgsLessThan(String value) {
            addCriterion("fygsgs <", value, "fygsgs");
            return (Criteria) this;
        }

        public Criteria andFygsgsLessThanOrEqualTo(String value) {
            addCriterion("fygsgs <=", value, "fygsgs");
            return (Criteria) this;
        }

        public Criteria andFygsgsLike(String value) {
            addCriterion("fygsgs like", value, "fygsgs");
            return (Criteria) this;
        }

        public Criteria andFygsgsNotLike(String value) {
            addCriterion("fygsgs not like", value, "fygsgs");
            return (Criteria) this;
        }

        public Criteria andFygsgsIn(List<String> values) {
            addCriterion("fygsgs in", values, "fygsgs");
            return (Criteria) this;
        }

        public Criteria andFygsgsNotIn(List<String> values) {
            addCriterion("fygsgs not in", values, "fygsgs");
            return (Criteria) this;
        }

        public Criteria andFygsgsBetween(String value1, String value2) {
            addCriterion("fygsgs between", value1, value2, "fygsgs");
            return (Criteria) this;
        }

        public Criteria andFygsgsNotBetween(String value1, String value2) {
            addCriterion("fygsgs not between", value1, value2, "fygsgs");
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

        public Criteria andSkdwIsNull() {
            addCriterion("skdw is null");
            return (Criteria) this;
        }

        public Criteria andSkdwIsNotNull() {
            addCriterion("skdw is not null");
            return (Criteria) this;
        }

        public Criteria andSkdwEqualTo(String value) {
            addCriterion("skdw =", value, "skdw");
            return (Criteria) this;
        }

        public Criteria andSkdwNotEqualTo(String value) {
            addCriterion("skdw <>", value, "skdw");
            return (Criteria) this;
        }

        public Criteria andSkdwGreaterThan(String value) {
            addCriterion("skdw >", value, "skdw");
            return (Criteria) this;
        }

        public Criteria andSkdwGreaterThanOrEqualTo(String value) {
            addCriterion("skdw >=", value, "skdw");
            return (Criteria) this;
        }

        public Criteria andSkdwLessThan(String value) {
            addCriterion("skdw <", value, "skdw");
            return (Criteria) this;
        }

        public Criteria andSkdwLessThanOrEqualTo(String value) {
            addCriterion("skdw <=", value, "skdw");
            return (Criteria) this;
        }

        public Criteria andSkdwLike(String value) {
            addCriterion("skdw like", value, "skdw");
            return (Criteria) this;
        }

        public Criteria andSkdwNotLike(String value) {
            addCriterion("skdw not like", value, "skdw");
            return (Criteria) this;
        }

        public Criteria andSkdwIn(List<String> values) {
            addCriterion("skdw in", values, "skdw");
            return (Criteria) this;
        }

        public Criteria andSkdwNotIn(List<String> values) {
            addCriterion("skdw not in", values, "skdw");
            return (Criteria) this;
        }

        public Criteria andSkdwBetween(String value1, String value2) {
            addCriterion("skdw between", value1, value2, "skdw");
            return (Criteria) this;
        }

        public Criteria andSkdwNotBetween(String value1, String value2) {
            addCriterion("skdw not between", value1, value2, "skdw");
            return (Criteria) this;
        }

        public Criteria andSqsjIsNull() {
            addCriterion("sqsj is null");
            return (Criteria) this;
        }

        public Criteria andSqsjIsNotNull() {
            addCriterion("sqsj is not null");
            return (Criteria) this;
        }

        public Criteria andSqsjEqualTo(String value) {
            addCriterion("sqsj =", value, "sqsj");
            return (Criteria) this;
        }

        public Criteria andSqsjNotEqualTo(String value) {
            addCriterion("sqsj <>", value, "sqsj");
            return (Criteria) this;
        }

        public Criteria andSqsjGreaterThan(String value) {
            addCriterion("sqsj >", value, "sqsj");
            return (Criteria) this;
        }

        public Criteria andSqsjGreaterThanOrEqualTo(String value) {
            addCriterion("sqsj >=", value, "sqsj");
            return (Criteria) this;
        }

        public Criteria andSqsjLessThan(String value) {
            addCriterion("sqsj <", value, "sqsj");
            return (Criteria) this;
        }

        public Criteria andSqsjLessThanOrEqualTo(String value) {
            addCriterion("sqsj <=", value, "sqsj");
            return (Criteria) this;
        }

        public Criteria andSqsjLike(String value) {
            addCriterion("sqsj like", value, "sqsj");
            return (Criteria) this;
        }

        public Criteria andSqsjNotLike(String value) {
            addCriterion("sqsj not like", value, "sqsj");
            return (Criteria) this;
        }

        public Criteria andSqsjIn(List<String> values) {
            addCriterion("sqsj in", values, "sqsj");
            return (Criteria) this;
        }

        public Criteria andSqsjNotIn(List<String> values) {
            addCriterion("sqsj not in", values, "sqsj");
            return (Criteria) this;
        }

        public Criteria andSqsjBetween(String value1, String value2) {
            addCriterion("sqsj between", value1, value2, "sqsj");
            return (Criteria) this;
        }

        public Criteria andSqsjNotBetween(String value1, String value2) {
            addCriterion("sqsj not between", value1, value2, "sqsj");
            return (Criteria) this;
        }

        public Criteria andFylbIsNull() {
            addCriterion("fylb is null");
            return (Criteria) this;
        }

        public Criteria andFylbIsNotNull() {
            addCriterion("fylb is not null");
            return (Criteria) this;
        }

        public Criteria andFylbEqualTo(String value) {
            addCriterion("fylb =", value, "fylb");
            return (Criteria) this;
        }

        public Criteria andFylbNotEqualTo(String value) {
            addCriterion("fylb <>", value, "fylb");
            return (Criteria) this;
        }

        public Criteria andFylbGreaterThan(String value) {
            addCriterion("fylb >", value, "fylb");
            return (Criteria) this;
        }

        public Criteria andFylbGreaterThanOrEqualTo(String value) {
            addCriterion("fylb >=", value, "fylb");
            return (Criteria) this;
        }

        public Criteria andFylbLessThan(String value) {
            addCriterion("fylb <", value, "fylb");
            return (Criteria) this;
        }

        public Criteria andFylbLessThanOrEqualTo(String value) {
            addCriterion("fylb <=", value, "fylb");
            return (Criteria) this;
        }

        public Criteria andFylbLike(String value) {
            addCriterion("fylb like", value, "fylb");
            return (Criteria) this;
        }

        public Criteria andFylbNotLike(String value) {
            addCriterion("fylb not like", value, "fylb");
            return (Criteria) this;
        }

        public Criteria andFylbIn(List<String> values) {
            addCriterion("fylb in", values, "fylb");
            return (Criteria) this;
        }

        public Criteria andFylbNotIn(List<String> values) {
            addCriterion("fylb not in", values, "fylb");
            return (Criteria) this;
        }

        public Criteria andFylbBetween(String value1, String value2) {
            addCriterion("fylb between", value1, value2, "fylb");
            return (Criteria) this;
        }

        public Criteria andFylbNotBetween(String value1, String value2) {
            addCriterion("fylb not between", value1, value2, "fylb");
            return (Criteria) this;
        }

        public Criteria andGlhtIsNull() {
            addCriterion("glht is null");
            return (Criteria) this;
        }

        public Criteria andGlhtIsNotNull() {
            addCriterion("glht is not null");
            return (Criteria) this;
        }

        public Criteria andGlhtEqualTo(String value) {
            addCriterion("glht =", value, "glht");
            return (Criteria) this;
        }

        public Criteria andGlhtNotEqualTo(String value) {
            addCriterion("glht <>", value, "glht");
            return (Criteria) this;
        }

        public Criteria andGlhtGreaterThan(String value) {
            addCriterion("glht >", value, "glht");
            return (Criteria) this;
        }

        public Criteria andGlhtGreaterThanOrEqualTo(String value) {
            addCriterion("glht >=", value, "glht");
            return (Criteria) this;
        }

        public Criteria andGlhtLessThan(String value) {
            addCriterion("glht <", value, "glht");
            return (Criteria) this;
        }

        public Criteria andGlhtLessThanOrEqualTo(String value) {
            addCriterion("glht <=", value, "glht");
            return (Criteria) this;
        }

        public Criteria andGlhtLike(String value) {
            addCriterion("glht like", value, "glht");
            return (Criteria) this;
        }

        public Criteria andGlhtNotLike(String value) {
            addCriterion("glht not like", value, "glht");
            return (Criteria) this;
        }

        public Criteria andGlhtIn(List<String> values) {
            addCriterion("glht in", values, "glht");
            return (Criteria) this;
        }

        public Criteria andGlhtNotIn(List<String> values) {
            addCriterion("glht not in", values, "glht");
            return (Criteria) this;
        }

        public Criteria andGlhtBetween(String value1, String value2) {
            addCriterion("glht between", value1, value2, "glht");
            return (Criteria) this;
        }

        public Criteria andGlhtNotBetween(String value1, String value2) {
            addCriterion("glht not between", value1, value2, "glht");
            return (Criteria) this;
        }

        public Criteria andHtzeIsNull() {
            addCriterion("htze is null");
            return (Criteria) this;
        }

        public Criteria andHtzeIsNotNull() {
            addCriterion("htze is not null");
            return (Criteria) this;
        }

        public Criteria andHtzeEqualTo(String value) {
            addCriterion("htze =", value, "htze");
            return (Criteria) this;
        }

        public Criteria andHtzeNotEqualTo(String value) {
            addCriterion("htze <>", value, "htze");
            return (Criteria) this;
        }

        public Criteria andHtzeGreaterThan(String value) {
            addCriterion("htze >", value, "htze");
            return (Criteria) this;
        }

        public Criteria andHtzeGreaterThanOrEqualTo(String value) {
            addCriterion("htze >=", value, "htze");
            return (Criteria) this;
        }

        public Criteria andHtzeLessThan(String value) {
            addCriterion("htze <", value, "htze");
            return (Criteria) this;
        }

        public Criteria andHtzeLessThanOrEqualTo(String value) {
            addCriterion("htze <=", value, "htze");
            return (Criteria) this;
        }

        public Criteria andHtzeLike(String value) {
            addCriterion("htze like", value, "htze");
            return (Criteria) this;
        }

        public Criteria andHtzeNotLike(String value) {
            addCriterion("htze not like", value, "htze");
            return (Criteria) this;
        }

        public Criteria andHtzeIn(List<String> values) {
            addCriterion("htze in", values, "htze");
            return (Criteria) this;
        }

        public Criteria andHtzeNotIn(List<String> values) {
            addCriterion("htze not in", values, "htze");
            return (Criteria) this;
        }

        public Criteria andHtzeBetween(String value1, String value2) {
            addCriterion("htze between", value1, value2, "htze");
            return (Criteria) this;
        }

        public Criteria andHtzeNotBetween(String value1, String value2) {
            addCriterion("htze not between", value1, value2, "htze");
            return (Criteria) this;
        }

        public Criteria andBcfkjeIsNull() {
            addCriterion("bcfkje is null");
            return (Criteria) this;
        }

        public Criteria andBcfkjeIsNotNull() {
            addCriterion("bcfkje is not null");
            return (Criteria) this;
        }

        public Criteria andBcfkjeEqualTo(String value) {
            addCriterion("bcfkje =", value, "bcfkje");
            return (Criteria) this;
        }

        public Criteria andBcfkjeNotEqualTo(String value) {
            addCriterion("bcfkje <>", value, "bcfkje");
            return (Criteria) this;
        }

        public Criteria andBcfkjeGreaterThan(String value) {
            addCriterion("bcfkje >", value, "bcfkje");
            return (Criteria) this;
        }

        public Criteria andBcfkjeGreaterThanOrEqualTo(String value) {
            addCriterion("bcfkje >=", value, "bcfkje");
            return (Criteria) this;
        }

        public Criteria andBcfkjeLessThan(String value) {
            addCriterion("bcfkje <", value, "bcfkje");
            return (Criteria) this;
        }

        public Criteria andBcfkjeLessThanOrEqualTo(String value) {
            addCriterion("bcfkje <=", value, "bcfkje");
            return (Criteria) this;
        }

        public Criteria andBcfkjeLike(String value) {
            addCriterion("bcfkje like", value, "bcfkje");
            return (Criteria) this;
        }

        public Criteria andBcfkjeNotLike(String value) {
            addCriterion("bcfkje not like", value, "bcfkje");
            return (Criteria) this;
        }

        public Criteria andBcfkjeIn(List<String> values) {
            addCriterion("bcfkje in", values, "bcfkje");
            return (Criteria) this;
        }

        public Criteria andBcfkjeNotIn(List<String> values) {
            addCriterion("bcfkje not in", values, "bcfkje");
            return (Criteria) this;
        }

        public Criteria andBcfkjeBetween(String value1, String value2) {
            addCriterion("bcfkje between", value1, value2, "bcfkje");
            return (Criteria) this;
        }

        public Criteria andBcfkjeNotBetween(String value1, String value2) {
            addCriterion("bcfkje not between", value1, value2, "bcfkje");
            return (Criteria) this;
        }

        public Criteria andYfkjeIsNull() {
            addCriterion("yfkje is null");
            return (Criteria) this;
        }

        public Criteria andYfkjeIsNotNull() {
            addCriterion("yfkje is not null");
            return (Criteria) this;
        }

        public Criteria andYfkjeEqualTo(String value) {
            addCriterion("yfkje =", value, "yfkje");
            return (Criteria) this;
        }

        public Criteria andYfkjeNotEqualTo(String value) {
            addCriterion("yfkje <>", value, "yfkje");
            return (Criteria) this;
        }

        public Criteria andYfkjeGreaterThan(String value) {
            addCriterion("yfkje >", value, "yfkje");
            return (Criteria) this;
        }

        public Criteria andYfkjeGreaterThanOrEqualTo(String value) {
            addCriterion("yfkje >=", value, "yfkje");
            return (Criteria) this;
        }

        public Criteria andYfkjeLessThan(String value) {
            addCriterion("yfkje <", value, "yfkje");
            return (Criteria) this;
        }

        public Criteria andYfkjeLessThanOrEqualTo(String value) {
            addCriterion("yfkje <=", value, "yfkje");
            return (Criteria) this;
        }

        public Criteria andYfkjeLike(String value) {
            addCriterion("yfkje like", value, "yfkje");
            return (Criteria) this;
        }

        public Criteria andYfkjeNotLike(String value) {
            addCriterion("yfkje not like", value, "yfkje");
            return (Criteria) this;
        }

        public Criteria andYfkjeIn(List<String> values) {
            addCriterion("yfkje in", values, "yfkje");
            return (Criteria) this;
        }

        public Criteria andYfkjeNotIn(List<String> values) {
            addCriterion("yfkje not in", values, "yfkje");
            return (Criteria) this;
        }

        public Criteria andYfkjeBetween(String value1, String value2) {
            addCriterion("yfkje between", value1, value2, "yfkje");
            return (Criteria) this;
        }

        public Criteria andYfkjeNotBetween(String value1, String value2) {
            addCriterion("yfkje not between", value1, value2, "yfkje");
            return (Criteria) this;
        }

        public Criteria andDfkjeIsNull() {
            addCriterion("dfkje is null");
            return (Criteria) this;
        }

        public Criteria andDfkjeIsNotNull() {
            addCriterion("dfkje is not null");
            return (Criteria) this;
        }

        public Criteria andDfkjeEqualTo(String value) {
            addCriterion("dfkje =", value, "dfkje");
            return (Criteria) this;
        }

        public Criteria andDfkjeNotEqualTo(String value) {
            addCriterion("dfkje <>", value, "dfkje");
            return (Criteria) this;
        }

        public Criteria andDfkjeGreaterThan(String value) {
            addCriterion("dfkje >", value, "dfkje");
            return (Criteria) this;
        }

        public Criteria andDfkjeGreaterThanOrEqualTo(String value) {
            addCriterion("dfkje >=", value, "dfkje");
            return (Criteria) this;
        }

        public Criteria andDfkjeLessThan(String value) {
            addCriterion("dfkje <", value, "dfkje");
            return (Criteria) this;
        }

        public Criteria andDfkjeLessThanOrEqualTo(String value) {
            addCriterion("dfkje <=", value, "dfkje");
            return (Criteria) this;
        }

        public Criteria andDfkjeLike(String value) {
            addCriterion("dfkje like", value, "dfkje");
            return (Criteria) this;
        }

        public Criteria andDfkjeNotLike(String value) {
            addCriterion("dfkje not like", value, "dfkje");
            return (Criteria) this;
        }

        public Criteria andDfkjeIn(List<String> values) {
            addCriterion("dfkje in", values, "dfkje");
            return (Criteria) this;
        }

        public Criteria andDfkjeNotIn(List<String> values) {
            addCriterion("dfkje not in", values, "dfkje");
            return (Criteria) this;
        }

        public Criteria andDfkjeBetween(String value1, String value2) {
            addCriterion("dfkje between", value1, value2, "dfkje");
            return (Criteria) this;
        }

        public Criteria andDfkjeNotBetween(String value1, String value2) {
            addCriterion("dfkje not between", value1, value2, "dfkje");
            return (Criteria) this;
        }

        public Criteria andSfscfpIsNull() {
            addCriterion("sfscfp is null");
            return (Criteria) this;
        }

        public Criteria andSfscfpIsNotNull() {
            addCriterion("sfscfp is not null");
            return (Criteria) this;
        }

        public Criteria andSfscfpEqualTo(String value) {
            addCriterion("sfscfp =", value, "sfscfp");
            return (Criteria) this;
        }

        public Criteria andSfscfpNotEqualTo(String value) {
            addCriterion("sfscfp <>", value, "sfscfp");
            return (Criteria) this;
        }

        public Criteria andSfscfpGreaterThan(String value) {
            addCriterion("sfscfp >", value, "sfscfp");
            return (Criteria) this;
        }

        public Criteria andSfscfpGreaterThanOrEqualTo(String value) {
            addCriterion("sfscfp >=", value, "sfscfp");
            return (Criteria) this;
        }

        public Criteria andSfscfpLessThan(String value) {
            addCriterion("sfscfp <", value, "sfscfp");
            return (Criteria) this;
        }

        public Criteria andSfscfpLessThanOrEqualTo(String value) {
            addCriterion("sfscfp <=", value, "sfscfp");
            return (Criteria) this;
        }

        public Criteria andSfscfpLike(String value) {
            addCriterion("sfscfp like", value, "sfscfp");
            return (Criteria) this;
        }

        public Criteria andSfscfpNotLike(String value) {
            addCriterion("sfscfp not like", value, "sfscfp");
            return (Criteria) this;
        }

        public Criteria andSfscfpIn(List<String> values) {
            addCriterion("sfscfp in", values, "sfscfp");
            return (Criteria) this;
        }

        public Criteria andSfscfpNotIn(List<String> values) {
            addCriterion("sfscfp not in", values, "sfscfp");
            return (Criteria) this;
        }

        public Criteria andSfscfpBetween(String value1, String value2) {
            addCriterion("sfscfp between", value1, value2, "sfscfp");
            return (Criteria) this;
        }

        public Criteria andSfscfpNotBetween(String value1, String value2) {
            addCriterion("sfscfp not between", value1, value2, "sfscfp");
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