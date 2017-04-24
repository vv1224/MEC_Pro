package com.hsyd.model;

import java.util.Date;

/**
 *  商品
 */
public class Product {

    private Integer id;

    private String productId;

    private String name;

    private Integer typeId;

    private Integer userId;

    private Float price;

    private Float original;

    private Integer count;

    private Integer bespeakCount;

    private Integer grounding;

    private Date createTime;

    private Date updateTime;

    private Integer targetSex;

    private Integer delStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getOriginal() {
        return original;
    }

    public void setOriginal(Float original) {
        this.original = original;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getBespeakCount() {
        return bespeakCount;
    }

    public void setBespeakCount(Integer bespeakCount) {
        this.bespeakCount = bespeakCount;
    }

    public Integer getGrounding() {
        return grounding;
    }

    public void setGrounding(Integer grounding) {
        this.grounding = grounding;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getTargetSex() {
        return targetSex;
    }

    public void setTargetSex(Integer targetSex) {
        this.targetSex = targetSex;
    }

    public Integer getDelStatus() {
        return delStatus;
    }

    public void setDelStatus(Integer delStatus) {
        this.delStatus = delStatus;
    }
}