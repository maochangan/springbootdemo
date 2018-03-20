package net.zgysrc.zb.bean;

public class GoodsInfo {
    private Integer id;

    private String goodsName;

    private String goodsPrice;

    private String goodsOldPrice;

    private String goodsSeller;

    private String goodsSellerId;

    private String goodsIndexImgPath;

    private String goodsSize;

    private String goodsSellNum;

    private String goodsType;

    private Integer goodsTypeId;

    private Integer goodsCommentId;

    private Integer goodsClickNum;

    private Integer goodsCollectNum;

    private String goodsDetailImgPath;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(String goodsPrice) {
        this.goodsPrice = goodsPrice == null ? null : goodsPrice.trim();
    }

    public String getGoodsOldPrice() {
        return goodsOldPrice;
    }

    public void setGoodsOldPrice(String goodsOldPrice) {
        this.goodsOldPrice = goodsOldPrice == null ? null : goodsOldPrice.trim();
    }

    public String getGoodsSeller() {
        return goodsSeller;
    }

    public void setGoodsSeller(String goodsSeller) {
        this.goodsSeller = goodsSeller == null ? null : goodsSeller.trim();
    }

    public String getGoodsSellerId() {
        return goodsSellerId;
    }

    public void setGoodsSellerId(String goodsSellerId) {
        this.goodsSellerId = goodsSellerId == null ? null : goodsSellerId.trim();
    }

    public String getGoodsIndexImgPath() {
        return goodsIndexImgPath;
    }

    public void setGoodsIndexImgPath(String goodsIndexImgPath) {
        this.goodsIndexImgPath = goodsIndexImgPath == null ? null : goodsIndexImgPath.trim();
    }

    public String getGoodsSize() {
        return goodsSize;
    }

    public void setGoodsSize(String goodsSize) {
        this.goodsSize = goodsSize == null ? null : goodsSize.trim();
    }

    public String getGoodsSellNum() {
        return goodsSellNum;
    }

    public void setGoodsSellNum(String goodsSellNum) {
        this.goodsSellNum = goodsSellNum == null ? null : goodsSellNum.trim();
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType == null ? null : goodsType.trim();
    }

    public Integer getGoodsTypeId() {
        return goodsTypeId;
    }

    public void setGoodsTypeId(Integer goodsTypeId) {
        this.goodsTypeId = goodsTypeId;
    }

    public Integer getGoodsCommentId() {
        return goodsCommentId;
    }

    public void setGoodsCommentId(Integer goodsCommentId) {
        this.goodsCommentId = goodsCommentId;
    }

    public Integer getGoodsClickNum() {
        return goodsClickNum;
    }

    public void setGoodsClickNum(Integer goodsClickNum) {
        this.goodsClickNum = goodsClickNum;
    }

    public Integer getGoodsCollectNum() {
        return goodsCollectNum;
    }

    public void setGoodsCollectNum(Integer goodsCollectNum) {
        this.goodsCollectNum = goodsCollectNum;
    }

    public String getGoodsDetailImgPath() {
        return goodsDetailImgPath;
    }

    public void setGoodsDetailImgPath(String goodsDetailImgPath) {
        this.goodsDetailImgPath = goodsDetailImgPath == null ? null : goodsDetailImgPath.trim();
    }
}