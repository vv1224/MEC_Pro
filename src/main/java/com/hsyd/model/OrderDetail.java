package com.hsyd.model;

import java.util.Date;

/**
 *  订单详情
 */
public class OrderDetail {

    private Integer id;

    private String orderId;

    private String orderChildId;

    private String productId;

    private Integer personId;

    private Integer reportId;

    private Integer status;

    private Date physicalTime;

    private Date closeTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getOrderChildId() {
        return orderChildId;
    }

    public void setOrderChildId(String orderChildId) {
        this.orderChildId = orderChildId == null ? null : orderChildId.trim();
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public Integer getReportId() {
        return reportId;
    }

    public void setReportId(Integer reportId) {
        this.reportId = reportId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getPhysicalTime() {
        return physicalTime;
    }

    public void setPhysicalTime(Date physicalTime) {
        this.physicalTime = physicalTime;
    }

    public Date getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }
}