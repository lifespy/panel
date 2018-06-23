package com.not404.panel.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "bought", schema = "sspanel", catalog = "")
public class BoughtDto {
    private long id;
    private long userid;
    private long shopid;
    private long datetime;
    private long renew;
    private String coupon;
    private BigDecimal price;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "userid")
    public long getUserid() {
        return userid;
    }

    public void setUserid(long userid) {
        this.userid = userid;
    }

    @Basic
    @Column(name = "shopid")
    public long getShopid() {
        return shopid;
    }

    public void setShopid(long shopid) {
        this.shopid = shopid;
    }

    @Basic
    @Column(name = "datetime")
    public long getDatetime() {
        return datetime;
    }

    public void setDatetime(long datetime) {
        this.datetime = datetime;
    }

    @Basic
    @Column(name = "renew")
    public long getRenew() {
        return renew;
    }

    public void setRenew(long renew) {
        this.renew = renew;
    }

    @Basic
    @Column(name = "coupon")
    public String getCoupon() {
        return coupon;
    }

    public void setCoupon(String coupon) {
        this.coupon = coupon;
    }

    @Basic
    @Column(name = "price")
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BoughtDto boughtDto = (BoughtDto) o;
        return id == boughtDto.id &&
                userid == boughtDto.userid &&
                shopid == boughtDto.shopid &&
                datetime == boughtDto.datetime &&
                renew == boughtDto.renew &&
                Objects.equals(coupon, boughtDto.coupon) &&
                Objects.equals(price, boughtDto.price);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, userid, shopid, datetime, renew, coupon, price);
    }
}
