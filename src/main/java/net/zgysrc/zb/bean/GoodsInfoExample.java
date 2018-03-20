package net.zgysrc.zb.bean;

import java.util.ArrayList;
import java.util.List;

public class GoodsInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsInfoExample() {
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

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNull() {
            addCriterion("goods_price is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNotNull() {
            addCriterion("goods_price is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceEqualTo(String value) {
            addCriterion("goods_price =", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotEqualTo(String value) {
            addCriterion("goods_price <>", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThan(String value) {
            addCriterion("goods_price >", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThanOrEqualTo(String value) {
            addCriterion("goods_price >=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThan(String value) {
            addCriterion("goods_price <", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThanOrEqualTo(String value) {
            addCriterion("goods_price <=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLike(String value) {
            addCriterion("goods_price like", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotLike(String value) {
            addCriterion("goods_price not like", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIn(List<String> values) {
            addCriterion("goods_price in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotIn(List<String> values) {
            addCriterion("goods_price not in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceBetween(String value1, String value2) {
            addCriterion("goods_price between", value1, value2, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotBetween(String value1, String value2) {
            addCriterion("goods_price not between", value1, value2, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsOldPriceIsNull() {
            addCriterion("goods_old_price is null");
            return (Criteria) this;
        }

        public Criteria andGoodsOldPriceIsNotNull() {
            addCriterion("goods_old_price is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsOldPriceEqualTo(String value) {
            addCriterion("goods_old_price =", value, "goodsOldPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsOldPriceNotEqualTo(String value) {
            addCriterion("goods_old_price <>", value, "goodsOldPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsOldPriceGreaterThan(String value) {
            addCriterion("goods_old_price >", value, "goodsOldPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsOldPriceGreaterThanOrEqualTo(String value) {
            addCriterion("goods_old_price >=", value, "goodsOldPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsOldPriceLessThan(String value) {
            addCriterion("goods_old_price <", value, "goodsOldPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsOldPriceLessThanOrEqualTo(String value) {
            addCriterion("goods_old_price <=", value, "goodsOldPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsOldPriceLike(String value) {
            addCriterion("goods_old_price like", value, "goodsOldPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsOldPriceNotLike(String value) {
            addCriterion("goods_old_price not like", value, "goodsOldPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsOldPriceIn(List<String> values) {
            addCriterion("goods_old_price in", values, "goodsOldPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsOldPriceNotIn(List<String> values) {
            addCriterion("goods_old_price not in", values, "goodsOldPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsOldPriceBetween(String value1, String value2) {
            addCriterion("goods_old_price between", value1, value2, "goodsOldPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsOldPriceNotBetween(String value1, String value2) {
            addCriterion("goods_old_price not between", value1, value2, "goodsOldPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsSellerIsNull() {
            addCriterion("goods_seller is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSellerIsNotNull() {
            addCriterion("goods_seller is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSellerEqualTo(String value) {
            addCriterion("goods_seller =", value, "goodsSeller");
            return (Criteria) this;
        }

        public Criteria andGoodsSellerNotEqualTo(String value) {
            addCriterion("goods_seller <>", value, "goodsSeller");
            return (Criteria) this;
        }

        public Criteria andGoodsSellerGreaterThan(String value) {
            addCriterion("goods_seller >", value, "goodsSeller");
            return (Criteria) this;
        }

        public Criteria andGoodsSellerGreaterThanOrEqualTo(String value) {
            addCriterion("goods_seller >=", value, "goodsSeller");
            return (Criteria) this;
        }

        public Criteria andGoodsSellerLessThan(String value) {
            addCriterion("goods_seller <", value, "goodsSeller");
            return (Criteria) this;
        }

        public Criteria andGoodsSellerLessThanOrEqualTo(String value) {
            addCriterion("goods_seller <=", value, "goodsSeller");
            return (Criteria) this;
        }

        public Criteria andGoodsSellerLike(String value) {
            addCriterion("goods_seller like", value, "goodsSeller");
            return (Criteria) this;
        }

        public Criteria andGoodsSellerNotLike(String value) {
            addCriterion("goods_seller not like", value, "goodsSeller");
            return (Criteria) this;
        }

        public Criteria andGoodsSellerIn(List<String> values) {
            addCriterion("goods_seller in", values, "goodsSeller");
            return (Criteria) this;
        }

        public Criteria andGoodsSellerNotIn(List<String> values) {
            addCriterion("goods_seller not in", values, "goodsSeller");
            return (Criteria) this;
        }

        public Criteria andGoodsSellerBetween(String value1, String value2) {
            addCriterion("goods_seller between", value1, value2, "goodsSeller");
            return (Criteria) this;
        }

        public Criteria andGoodsSellerNotBetween(String value1, String value2) {
            addCriterion("goods_seller not between", value1, value2, "goodsSeller");
            return (Criteria) this;
        }

        public Criteria andGoodsSellerIdIsNull() {
            addCriterion("goods_seller_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSellerIdIsNotNull() {
            addCriterion("goods_seller_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSellerIdEqualTo(String value) {
            addCriterion("goods_seller_id =", value, "goodsSellerId");
            return (Criteria) this;
        }

        public Criteria andGoodsSellerIdNotEqualTo(String value) {
            addCriterion("goods_seller_id <>", value, "goodsSellerId");
            return (Criteria) this;
        }

        public Criteria andGoodsSellerIdGreaterThan(String value) {
            addCriterion("goods_seller_id >", value, "goodsSellerId");
            return (Criteria) this;
        }

        public Criteria andGoodsSellerIdGreaterThanOrEqualTo(String value) {
            addCriterion("goods_seller_id >=", value, "goodsSellerId");
            return (Criteria) this;
        }

        public Criteria andGoodsSellerIdLessThan(String value) {
            addCriterion("goods_seller_id <", value, "goodsSellerId");
            return (Criteria) this;
        }

        public Criteria andGoodsSellerIdLessThanOrEqualTo(String value) {
            addCriterion("goods_seller_id <=", value, "goodsSellerId");
            return (Criteria) this;
        }

        public Criteria andGoodsSellerIdLike(String value) {
            addCriterion("goods_seller_id like", value, "goodsSellerId");
            return (Criteria) this;
        }

        public Criteria andGoodsSellerIdNotLike(String value) {
            addCriterion("goods_seller_id not like", value, "goodsSellerId");
            return (Criteria) this;
        }

        public Criteria andGoodsSellerIdIn(List<String> values) {
            addCriterion("goods_seller_id in", values, "goodsSellerId");
            return (Criteria) this;
        }

        public Criteria andGoodsSellerIdNotIn(List<String> values) {
            addCriterion("goods_seller_id not in", values, "goodsSellerId");
            return (Criteria) this;
        }

        public Criteria andGoodsSellerIdBetween(String value1, String value2) {
            addCriterion("goods_seller_id between", value1, value2, "goodsSellerId");
            return (Criteria) this;
        }

        public Criteria andGoodsSellerIdNotBetween(String value1, String value2) {
            addCriterion("goods_seller_id not between", value1, value2, "goodsSellerId");
            return (Criteria) this;
        }

        public Criteria andGoodsIndexImgPathIsNull() {
            addCriterion("goods_index_img_path is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIndexImgPathIsNotNull() {
            addCriterion("goods_index_img_path is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIndexImgPathEqualTo(String value) {
            addCriterion("goods_index_img_path =", value, "goodsIndexImgPath");
            return (Criteria) this;
        }

        public Criteria andGoodsIndexImgPathNotEqualTo(String value) {
            addCriterion("goods_index_img_path <>", value, "goodsIndexImgPath");
            return (Criteria) this;
        }

        public Criteria andGoodsIndexImgPathGreaterThan(String value) {
            addCriterion("goods_index_img_path >", value, "goodsIndexImgPath");
            return (Criteria) this;
        }

        public Criteria andGoodsIndexImgPathGreaterThanOrEqualTo(String value) {
            addCriterion("goods_index_img_path >=", value, "goodsIndexImgPath");
            return (Criteria) this;
        }

        public Criteria andGoodsIndexImgPathLessThan(String value) {
            addCriterion("goods_index_img_path <", value, "goodsIndexImgPath");
            return (Criteria) this;
        }

        public Criteria andGoodsIndexImgPathLessThanOrEqualTo(String value) {
            addCriterion("goods_index_img_path <=", value, "goodsIndexImgPath");
            return (Criteria) this;
        }

        public Criteria andGoodsIndexImgPathLike(String value) {
            addCriterion("goods_index_img_path like", value, "goodsIndexImgPath");
            return (Criteria) this;
        }

        public Criteria andGoodsIndexImgPathNotLike(String value) {
            addCriterion("goods_index_img_path not like", value, "goodsIndexImgPath");
            return (Criteria) this;
        }

        public Criteria andGoodsIndexImgPathIn(List<String> values) {
            addCriterion("goods_index_img_path in", values, "goodsIndexImgPath");
            return (Criteria) this;
        }

        public Criteria andGoodsIndexImgPathNotIn(List<String> values) {
            addCriterion("goods_index_img_path not in", values, "goodsIndexImgPath");
            return (Criteria) this;
        }

        public Criteria andGoodsIndexImgPathBetween(String value1, String value2) {
            addCriterion("goods_index_img_path between", value1, value2, "goodsIndexImgPath");
            return (Criteria) this;
        }

        public Criteria andGoodsIndexImgPathNotBetween(String value1, String value2) {
            addCriterion("goods_index_img_path not between", value1, value2, "goodsIndexImgPath");
            return (Criteria) this;
        }

        public Criteria andGoodsSizeIsNull() {
            addCriterion("goods_size is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSizeIsNotNull() {
            addCriterion("goods_size is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSizeEqualTo(String value) {
            addCriterion("goods_size =", value, "goodsSize");
            return (Criteria) this;
        }

        public Criteria andGoodsSizeNotEqualTo(String value) {
            addCriterion("goods_size <>", value, "goodsSize");
            return (Criteria) this;
        }

        public Criteria andGoodsSizeGreaterThan(String value) {
            addCriterion("goods_size >", value, "goodsSize");
            return (Criteria) this;
        }

        public Criteria andGoodsSizeGreaterThanOrEqualTo(String value) {
            addCriterion("goods_size >=", value, "goodsSize");
            return (Criteria) this;
        }

        public Criteria andGoodsSizeLessThan(String value) {
            addCriterion("goods_size <", value, "goodsSize");
            return (Criteria) this;
        }

        public Criteria andGoodsSizeLessThanOrEqualTo(String value) {
            addCriterion("goods_size <=", value, "goodsSize");
            return (Criteria) this;
        }

        public Criteria andGoodsSizeLike(String value) {
            addCriterion("goods_size like", value, "goodsSize");
            return (Criteria) this;
        }

        public Criteria andGoodsSizeNotLike(String value) {
            addCriterion("goods_size not like", value, "goodsSize");
            return (Criteria) this;
        }

        public Criteria andGoodsSizeIn(List<String> values) {
            addCriterion("goods_size in", values, "goodsSize");
            return (Criteria) this;
        }

        public Criteria andGoodsSizeNotIn(List<String> values) {
            addCriterion("goods_size not in", values, "goodsSize");
            return (Criteria) this;
        }

        public Criteria andGoodsSizeBetween(String value1, String value2) {
            addCriterion("goods_size between", value1, value2, "goodsSize");
            return (Criteria) this;
        }

        public Criteria andGoodsSizeNotBetween(String value1, String value2) {
            addCriterion("goods_size not between", value1, value2, "goodsSize");
            return (Criteria) this;
        }

        public Criteria andGoodsSellNumIsNull() {
            addCriterion("goods_sell_num is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSellNumIsNotNull() {
            addCriterion("goods_sell_num is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSellNumEqualTo(String value) {
            addCriterion("goods_sell_num =", value, "goodsSellNum");
            return (Criteria) this;
        }

        public Criteria andGoodsSellNumNotEqualTo(String value) {
            addCriterion("goods_sell_num <>", value, "goodsSellNum");
            return (Criteria) this;
        }

        public Criteria andGoodsSellNumGreaterThan(String value) {
            addCriterion("goods_sell_num >", value, "goodsSellNum");
            return (Criteria) this;
        }

        public Criteria andGoodsSellNumGreaterThanOrEqualTo(String value) {
            addCriterion("goods_sell_num >=", value, "goodsSellNum");
            return (Criteria) this;
        }

        public Criteria andGoodsSellNumLessThan(String value) {
            addCriterion("goods_sell_num <", value, "goodsSellNum");
            return (Criteria) this;
        }

        public Criteria andGoodsSellNumLessThanOrEqualTo(String value) {
            addCriterion("goods_sell_num <=", value, "goodsSellNum");
            return (Criteria) this;
        }

        public Criteria andGoodsSellNumLike(String value) {
            addCriterion("goods_sell_num like", value, "goodsSellNum");
            return (Criteria) this;
        }

        public Criteria andGoodsSellNumNotLike(String value) {
            addCriterion("goods_sell_num not like", value, "goodsSellNum");
            return (Criteria) this;
        }

        public Criteria andGoodsSellNumIn(List<String> values) {
            addCriterion("goods_sell_num in", values, "goodsSellNum");
            return (Criteria) this;
        }

        public Criteria andGoodsSellNumNotIn(List<String> values) {
            addCriterion("goods_sell_num not in", values, "goodsSellNum");
            return (Criteria) this;
        }

        public Criteria andGoodsSellNumBetween(String value1, String value2) {
            addCriterion("goods_sell_num between", value1, value2, "goodsSellNum");
            return (Criteria) this;
        }

        public Criteria andGoodsSellNumNotBetween(String value1, String value2) {
            addCriterion("goods_sell_num not between", value1, value2, "goodsSellNum");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIsNull() {
            addCriterion("goods_type is null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIsNotNull() {
            addCriterion("goods_type is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeEqualTo(String value) {
            addCriterion("goods_type =", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotEqualTo(String value) {
            addCriterion("goods_type <>", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeGreaterThan(String value) {
            addCriterion("goods_type >", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("goods_type >=", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLessThan(String value) {
            addCriterion("goods_type <", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLessThanOrEqualTo(String value) {
            addCriterion("goods_type <=", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLike(String value) {
            addCriterion("goods_type like", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotLike(String value) {
            addCriterion("goods_type not like", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIn(List<String> values) {
            addCriterion("goods_type in", values, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotIn(List<String> values) {
            addCriterion("goods_type not in", values, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeBetween(String value1, String value2) {
            addCriterion("goods_type between", value1, value2, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotBetween(String value1, String value2) {
            addCriterion("goods_type not between", value1, value2, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdIsNull() {
            addCriterion("goods_type_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdIsNotNull() {
            addCriterion("goods_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdEqualTo(Integer value) {
            addCriterion("goods_type_id =", value, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdNotEqualTo(Integer value) {
            addCriterion("goods_type_id <>", value, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdGreaterThan(Integer value) {
            addCriterion("goods_type_id >", value, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_type_id >=", value, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdLessThan(Integer value) {
            addCriterion("goods_type_id <", value, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_type_id <=", value, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdIn(List<Integer> values) {
            addCriterion("goods_type_id in", values, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdNotIn(List<Integer> values) {
            addCriterion("goods_type_id not in", values, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_type_id between", value1, value2, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_type_id not between", value1, value2, "goodsTypeId");
            return (Criteria) this;
        }

        public Criteria andGoodsCommentIdIsNull() {
            addCriterion("goods_comment_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCommentIdIsNotNull() {
            addCriterion("goods_comment_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCommentIdEqualTo(Integer value) {
            addCriterion("goods_comment_id =", value, "goodsCommentId");
            return (Criteria) this;
        }

        public Criteria andGoodsCommentIdNotEqualTo(Integer value) {
            addCriterion("goods_comment_id <>", value, "goodsCommentId");
            return (Criteria) this;
        }

        public Criteria andGoodsCommentIdGreaterThan(Integer value) {
            addCriterion("goods_comment_id >", value, "goodsCommentId");
            return (Criteria) this;
        }

        public Criteria andGoodsCommentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_comment_id >=", value, "goodsCommentId");
            return (Criteria) this;
        }

        public Criteria andGoodsCommentIdLessThan(Integer value) {
            addCriterion("goods_comment_id <", value, "goodsCommentId");
            return (Criteria) this;
        }

        public Criteria andGoodsCommentIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_comment_id <=", value, "goodsCommentId");
            return (Criteria) this;
        }

        public Criteria andGoodsCommentIdIn(List<Integer> values) {
            addCriterion("goods_comment_id in", values, "goodsCommentId");
            return (Criteria) this;
        }

        public Criteria andGoodsCommentIdNotIn(List<Integer> values) {
            addCriterion("goods_comment_id not in", values, "goodsCommentId");
            return (Criteria) this;
        }

        public Criteria andGoodsCommentIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_comment_id between", value1, value2, "goodsCommentId");
            return (Criteria) this;
        }

        public Criteria andGoodsCommentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_comment_id not between", value1, value2, "goodsCommentId");
            return (Criteria) this;
        }

        public Criteria andGoodsClickNumIsNull() {
            addCriterion("goods_click_num is null");
            return (Criteria) this;
        }

        public Criteria andGoodsClickNumIsNotNull() {
            addCriterion("goods_click_num is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsClickNumEqualTo(Integer value) {
            addCriterion("goods_click_num =", value, "goodsClickNum");
            return (Criteria) this;
        }

        public Criteria andGoodsClickNumNotEqualTo(Integer value) {
            addCriterion("goods_click_num <>", value, "goodsClickNum");
            return (Criteria) this;
        }

        public Criteria andGoodsClickNumGreaterThan(Integer value) {
            addCriterion("goods_click_num >", value, "goodsClickNum");
            return (Criteria) this;
        }

        public Criteria andGoodsClickNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_click_num >=", value, "goodsClickNum");
            return (Criteria) this;
        }

        public Criteria andGoodsClickNumLessThan(Integer value) {
            addCriterion("goods_click_num <", value, "goodsClickNum");
            return (Criteria) this;
        }

        public Criteria andGoodsClickNumLessThanOrEqualTo(Integer value) {
            addCriterion("goods_click_num <=", value, "goodsClickNum");
            return (Criteria) this;
        }

        public Criteria andGoodsClickNumIn(List<Integer> values) {
            addCriterion("goods_click_num in", values, "goodsClickNum");
            return (Criteria) this;
        }

        public Criteria andGoodsClickNumNotIn(List<Integer> values) {
            addCriterion("goods_click_num not in", values, "goodsClickNum");
            return (Criteria) this;
        }

        public Criteria andGoodsClickNumBetween(Integer value1, Integer value2) {
            addCriterion("goods_click_num between", value1, value2, "goodsClickNum");
            return (Criteria) this;
        }

        public Criteria andGoodsClickNumNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_click_num not between", value1, value2, "goodsClickNum");
            return (Criteria) this;
        }

        public Criteria andGoodsCollectNumIsNull() {
            addCriterion("goods_collect_num is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCollectNumIsNotNull() {
            addCriterion("goods_collect_num is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCollectNumEqualTo(Integer value) {
            addCriterion("goods_collect_num =", value, "goodsCollectNum");
            return (Criteria) this;
        }

        public Criteria andGoodsCollectNumNotEqualTo(Integer value) {
            addCriterion("goods_collect_num <>", value, "goodsCollectNum");
            return (Criteria) this;
        }

        public Criteria andGoodsCollectNumGreaterThan(Integer value) {
            addCriterion("goods_collect_num >", value, "goodsCollectNum");
            return (Criteria) this;
        }

        public Criteria andGoodsCollectNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_collect_num >=", value, "goodsCollectNum");
            return (Criteria) this;
        }

        public Criteria andGoodsCollectNumLessThan(Integer value) {
            addCriterion("goods_collect_num <", value, "goodsCollectNum");
            return (Criteria) this;
        }

        public Criteria andGoodsCollectNumLessThanOrEqualTo(Integer value) {
            addCriterion("goods_collect_num <=", value, "goodsCollectNum");
            return (Criteria) this;
        }

        public Criteria andGoodsCollectNumIn(List<Integer> values) {
            addCriterion("goods_collect_num in", values, "goodsCollectNum");
            return (Criteria) this;
        }

        public Criteria andGoodsCollectNumNotIn(List<Integer> values) {
            addCriterion("goods_collect_num not in", values, "goodsCollectNum");
            return (Criteria) this;
        }

        public Criteria andGoodsCollectNumBetween(Integer value1, Integer value2) {
            addCriterion("goods_collect_num between", value1, value2, "goodsCollectNum");
            return (Criteria) this;
        }

        public Criteria andGoodsCollectNumNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_collect_num not between", value1, value2, "goodsCollectNum");
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