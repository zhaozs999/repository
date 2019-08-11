package com.zhaozs.entity;

/**
 * @ 创建人 zhaozs
 * @ 创建时间 2019/3/27
 * @ 描述
 */
public class BaseEntity {
    public Integer pageNo = 1;
    public Integer pageSize = 10;
    public String orderBy = "is desc";

    public BaseEntity() {
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }
}
