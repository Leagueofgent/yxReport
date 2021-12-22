package com.aks.yxReport.pojo;

import java.util.ArrayList;
import java.util.List;

public class JjfReportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JjfReportExample() {
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

        public Criteria andMbzdIsNull() {
            addCriterion("mbzd is null");
            return (Criteria) this;
        }

        public Criteria andMbzdIsNotNull() {
            addCriterion("mbzd is not null");
            return (Criteria) this;
        }

        public Criteria andMbzdEqualTo(String value) {
            addCriterion("mbzd =", value, "mbzd");
            return (Criteria) this;
        }

        public Criteria andMbzdNotEqualTo(String value) {
            addCriterion("mbzd <>", value, "mbzd");
            return (Criteria) this;
        }

        public Criteria andMbzdGreaterThan(String value) {
            addCriterion("mbzd >", value, "mbzd");
            return (Criteria) this;
        }

        public Criteria andMbzdGreaterThanOrEqualTo(String value) {
            addCriterion("mbzd >=", value, "mbzd");
            return (Criteria) this;
        }

        public Criteria andMbzdLessThan(String value) {
            addCriterion("mbzd <", value, "mbzd");
            return (Criteria) this;
        }

        public Criteria andMbzdLessThanOrEqualTo(String value) {
            addCriterion("mbzd <=", value, "mbzd");
            return (Criteria) this;
        }

        public Criteria andMbzdLike(String value) {
            addCriterion("mbzd like", value, "mbzd");
            return (Criteria) this;
        }

        public Criteria andMbzdNotLike(String value) {
            addCriterion("mbzd not like", value, "mbzd");
            return (Criteria) this;
        }

        public Criteria andMbzdIn(List<String> values) {
            addCriterion("mbzd in", values, "mbzd");
            return (Criteria) this;
        }

        public Criteria andMbzdNotIn(List<String> values) {
            addCriterion("mbzd not in", values, "mbzd");
            return (Criteria) this;
        }

        public Criteria andMbzdBetween(String value1, String value2) {
            addCriterion("mbzd between", value1, value2, "mbzd");
            return (Criteria) this;
        }

        public Criteria andMbzdNotBetween(String value1, String value2) {
            addCriterion("mbzd not between", value1, value2, "mbzd");
            return (Criteria) this;
        }

        public Criteria andJeIsNull() {
            addCriterion("je is null");
            return (Criteria) this;
        }

        public Criteria andJeIsNotNull() {
            addCriterion("je is not null");
            return (Criteria) this;
        }

        public Criteria andJeEqualTo(String value) {
            addCriterion("je =", value, "je");
            return (Criteria) this;
        }

        public Criteria andJeNotEqualTo(String value) {
            addCriterion("je <>", value, "je");
            return (Criteria) this;
        }

        public Criteria andJeGreaterThan(String value) {
            addCriterion("je >", value, "je");
            return (Criteria) this;
        }

        public Criteria andJeGreaterThanOrEqualTo(String value) {
            addCriterion("je >=", value, "je");
            return (Criteria) this;
        }

        public Criteria andJeLessThan(String value) {
            addCriterion("je <", value, "je");
            return (Criteria) this;
        }

        public Criteria andJeLessThanOrEqualTo(String value) {
            addCriterion("je <=", value, "je");
            return (Criteria) this;
        }

        public Criteria andJeLike(String value) {
            addCriterion("je like", value, "je");
            return (Criteria) this;
        }

        public Criteria andJeNotLike(String value) {
            addCriterion("je not like", value, "je");
            return (Criteria) this;
        }

        public Criteria andJeIn(List<String> values) {
            addCriterion("je in", values, "je");
            return (Criteria) this;
        }

        public Criteria andJeNotIn(List<String> values) {
            addCriterion("je not in", values, "je");
            return (Criteria) this;
        }

        public Criteria andJeBetween(String value1, String value2) {
            addCriterion("je between", value1, value2, "je");
            return (Criteria) this;
        }

        public Criteria andJeNotBetween(String value1, String value2) {
            addCriterion("je not between", value1, value2, "je");
            return (Criteria) this;
        }

        public Criteria andCwqrjeIsNull() {
            addCriterion("cwqrje is null");
            return (Criteria) this;
        }

        public Criteria andCwqrjeIsNotNull() {
            addCriterion("cwqrje is not null");
            return (Criteria) this;
        }

        public Criteria andCwqrjeEqualTo(String value) {
            addCriterion("cwqrje =", value, "cwqrje");
            return (Criteria) this;
        }

        public Criteria andCwqrjeNotEqualTo(String value) {
            addCriterion("cwqrje <>", value, "cwqrje");
            return (Criteria) this;
        }

        public Criteria andCwqrjeGreaterThan(String value) {
            addCriterion("cwqrje >", value, "cwqrje");
            return (Criteria) this;
        }

        public Criteria andCwqrjeGreaterThanOrEqualTo(String value) {
            addCriterion("cwqrje >=", value, "cwqrje");
            return (Criteria) this;
        }

        public Criteria andCwqrjeLessThan(String value) {
            addCriterion("cwqrje <", value, "cwqrje");
            return (Criteria) this;
        }

        public Criteria andCwqrjeLessThanOrEqualTo(String value) {
            addCriterion("cwqrje <=", value, "cwqrje");
            return (Criteria) this;
        }

        public Criteria andCwqrjeLike(String value) {
            addCriterion("cwqrje like", value, "cwqrje");
            return (Criteria) this;
        }

        public Criteria andCwqrjeNotLike(String value) {
            addCriterion("cwqrje not like", value, "cwqrje");
            return (Criteria) this;
        }

        public Criteria andCwqrjeIn(List<String> values) {
            addCriterion("cwqrje in", values, "cwqrje");
            return (Criteria) this;
        }

        public Criteria andCwqrjeNotIn(List<String> values) {
            addCriterion("cwqrje not in", values, "cwqrje");
            return (Criteria) this;
        }

        public Criteria andCwqrjeBetween(String value1, String value2) {
            addCriterion("cwqrje between", value1, value2, "cwqrje");
            return (Criteria) this;
        }

        public Criteria andCwqrjeNotBetween(String value1, String value2) {
            addCriterion("cwqrje not between", value1, value2, "cwqrje");
            return (Criteria) this;
        }

        public Criteria andFylxIsNull() {
            addCriterion("fylx is null");
            return (Criteria) this;
        }

        public Criteria andFylxIsNotNull() {
            addCriterion("fylx is not null");
            return (Criteria) this;
        }

        public Criteria andFylxEqualTo(String value) {
            addCriterion("fylx =", value, "fylx");
            return (Criteria) this;
        }

        public Criteria andFylxNotEqualTo(String value) {
            addCriterion("fylx <>", value, "fylx");
            return (Criteria) this;
        }

        public Criteria andFylxGreaterThan(String value) {
            addCriterion("fylx >", value, "fylx");
            return (Criteria) this;
        }

        public Criteria andFylxGreaterThanOrEqualTo(String value) {
            addCriterion("fylx >=", value, "fylx");
            return (Criteria) this;
        }

        public Criteria andFylxLessThan(String value) {
            addCriterion("fylx <", value, "fylx");
            return (Criteria) this;
        }

        public Criteria andFylxLessThanOrEqualTo(String value) {
            addCriterion("fylx <=", value, "fylx");
            return (Criteria) this;
        }

        public Criteria andFylxLike(String value) {
            addCriterion("fylx like", value, "fylx");
            return (Criteria) this;
        }

        public Criteria andFylxNotLike(String value) {
            addCriterion("fylx not like", value, "fylx");
            return (Criteria) this;
        }

        public Criteria andFylxIn(List<String> values) {
            addCriterion("fylx in", values, "fylx");
            return (Criteria) this;
        }

        public Criteria andFylxNotIn(List<String> values) {
            addCriterion("fylx not in", values, "fylx");
            return (Criteria) this;
        }

        public Criteria andFylxBetween(String value1, String value2) {
            addCriterion("fylx between", value1, value2, "fylx");
            return (Criteria) this;
        }

        public Criteria andFylxNotBetween(String value1, String value2) {
            addCriterion("fylx not between", value1, value2, "fylx");
            return (Criteria) this;
        }

        public Criteria andFysmIsNull() {
            addCriterion("fysm is null");
            return (Criteria) this;
        }

        public Criteria andFysmIsNotNull() {
            addCriterion("fysm is not null");
            return (Criteria) this;
        }

        public Criteria andFysmEqualTo(String value) {
            addCriterion("fysm =", value, "fysm");
            return (Criteria) this;
        }

        public Criteria andFysmNotEqualTo(String value) {
            addCriterion("fysm <>", value, "fysm");
            return (Criteria) this;
        }

        public Criteria andFysmGreaterThan(String value) {
            addCriterion("fysm >", value, "fysm");
            return (Criteria) this;
        }

        public Criteria andFysmGreaterThanOrEqualTo(String value) {
            addCriterion("fysm >=", value, "fysm");
            return (Criteria) this;
        }

        public Criteria andFysmLessThan(String value) {
            addCriterion("fysm <", value, "fysm");
            return (Criteria) this;
        }

        public Criteria andFysmLessThanOrEqualTo(String value) {
            addCriterion("fysm <=", value, "fysm");
            return (Criteria) this;
        }

        public Criteria andFysmLike(String value) {
            addCriterion("fysm like", value, "fysm");
            return (Criteria) this;
        }

        public Criteria andFysmNotLike(String value) {
            addCriterion("fysm not like", value, "fysm");
            return (Criteria) this;
        }

        public Criteria andFysmIn(List<String> values) {
            addCriterion("fysm in", values, "fysm");
            return (Criteria) this;
        }

        public Criteria andFysmNotIn(List<String> values) {
            addCriterion("fysm not in", values, "fysm");
            return (Criteria) this;
        }

        public Criteria andFysmBetween(String value1, String value2) {
            addCriterion("fysm between", value1, value2, "fysm");
            return (Criteria) this;
        }

        public Criteria andFysmNotBetween(String value1, String value2) {
            addCriterion("fysm not between", value1, value2, "fysm");
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