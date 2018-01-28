package vip.ipav.shiro.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserRoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     *  构造查询条件,user_roles
     */
    public UserRoleExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *  设置排序字段,user_roles
     *
     * @param orderByClause 排序字段
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *  获取排序字段,user_roles
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *  设置过滤重复数据,user_roles
     *
     * @param distinct 是否过滤重复数据
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *  是否过滤重复数据,user_roles
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *  获取当前的查询条件实例,user_roles
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * ,user_roles
     *
     * @param criteria 过滤条件实例
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * ,user_roles
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *  创建一个查询条件,user_roles
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *  内部构建查询条件对象,user_roles
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *  清除查询条件,user_roles
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 
     * GeneratedCriteria
     * 数据库表：user_roles
     */
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andRolesIdIsNull() {
            addCriterion("roles_id is null");
            return (Criteria) this;
        }

        public Criteria andRolesIdIsNotNull() {
            addCriterion("roles_id is not null");
            return (Criteria) this;
        }

        public Criteria andRolesIdEqualTo(Long value) {
            addCriterion("roles_id =", value, "rolesId");
            return (Criteria) this;
        }

        public Criteria andRolesIdNotEqualTo(Long value) {
            addCriterion("roles_id <>", value, "rolesId");
            return (Criteria) this;
        }

        public Criteria andRolesIdGreaterThan(Long value) {
            addCriterion("roles_id >", value, "rolesId");
            return (Criteria) this;
        }

        public Criteria andRolesIdGreaterThanOrEqualTo(Long value) {
            addCriterion("roles_id >=", value, "rolesId");
            return (Criteria) this;
        }

        public Criteria andRolesIdLessThan(Long value) {
            addCriterion("roles_id <", value, "rolesId");
            return (Criteria) this;
        }

        public Criteria andRolesIdLessThanOrEqualTo(Long value) {
            addCriterion("roles_id <=", value, "rolesId");
            return (Criteria) this;
        }

        public Criteria andRolesIdIn(List<Long> values) {
            addCriterion("roles_id in", values, "rolesId");
            return (Criteria) this;
        }

        public Criteria andRolesIdNotIn(List<Long> values) {
            addCriterion("roles_id not in", values, "rolesId");
            return (Criteria) this;
        }

        public Criteria andRolesIdBetween(Long value1, Long value2) {
            addCriterion("roles_id between", value1, value2, "rolesId");
            return (Criteria) this;
        }

        public Criteria andRolesIdNotBetween(Long value1, Long value2) {
            addCriterion("roles_id not between", value1, value2, "rolesId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andNextIsNull() {
            addCriterion("next is null");
            return (Criteria) this;
        }

        public Criteria andNextIsNotNull() {
            addCriterion("next is not null");
            return (Criteria) this;
        }

        public Criteria andNextEqualTo(String value) {
            addCriterion("next =", value, "next");
            return (Criteria) this;
        }

        public Criteria andNextNotEqualTo(String value) {
            addCriterion("next <>", value, "next");
            return (Criteria) this;
        }

        public Criteria andNextGreaterThan(String value) {
            addCriterion("next >", value, "next");
            return (Criteria) this;
        }

        public Criteria andNextGreaterThanOrEqualTo(String value) {
            addCriterion("next >=", value, "next");
            return (Criteria) this;
        }

        public Criteria andNextLessThan(String value) {
            addCriterion("next <", value, "next");
            return (Criteria) this;
        }

        public Criteria andNextLessThanOrEqualTo(String value) {
            addCriterion("next <=", value, "next");
            return (Criteria) this;
        }

        public Criteria andNextLike(String value) {
            addCriterion("next like", value, "next");
            return (Criteria) this;
        }

        public Criteria andNextNotLike(String value) {
            addCriterion("next not like", value, "next");
            return (Criteria) this;
        }

        public Criteria andNextIn(List<String> values) {
            addCriterion("next in", values, "next");
            return (Criteria) this;
        }

        public Criteria andNextNotIn(List<String> values) {
            addCriterion("next not in", values, "next");
            return (Criteria) this;
        }

        public Criteria andNextBetween(String value1, String value2) {
            addCriterion("next between", value1, value2, "next");
            return (Criteria) this;
        }

        public Criteria andNextNotBetween(String value1, String value2) {
            addCriterion("next not between", value1, value2, "next");
            return (Criteria) this;
        }
    }

    /**
     * 类注释
     * Criteria
     * 数据库表：user_roles
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 
     * Criterion
     * 数据库表：user_roles
     */
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