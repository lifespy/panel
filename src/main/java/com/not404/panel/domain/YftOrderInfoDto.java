package com.not404.panel.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "yft_order_info", schema = "sspanel", catalog = "")
public class YftOrderInfoDto {
    private int id;
    private Integer userId;
    private String ssOrder;
    private String yftOrder;
    private String price;
    private Byte state;
    private Timestamp createTime;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "user_id")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "ss_order")
    public String getSsOrder() {
        return ssOrder;
    }

    public void setSsOrder(String ssOrder) {
        this.ssOrder = ssOrder;
    }

    @Basic
    @Column(name = "yft_order")
    public String getYftOrder() {
        return yftOrder;
    }

    public void setYftOrder(String yftOrder) {
        this.yftOrder = yftOrder;
    }

    @Basic
    @Column(name = "price")
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Basic
    @Column(name = "state")
    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    @Basic
    @Column(name = "create_time")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        YftOrderInfoDto that = (YftOrderInfoDto) o;
        return id == that.id &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(ssOrder, that.ssOrder) &&
                Objects.equals(yftOrder, that.yftOrder) &&
                Objects.equals(price, that.price) &&
                Objects.equals(state, that.state) &&
                Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, userId, ssOrder, yftOrder, price, state, createTime);
    }
}
