package com.not404.panel.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "coupon", schema = "sspanel", catalog = "")
public class CouponDto {
    private long id;
    private String code;
    private int onetime;
    private long expire;
    private String shop;
    private int credit;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "onetime")
    public int getOnetime() {
        return onetime;
    }

    public void setOnetime(int onetime) {
        this.onetime = onetime;
    }

    @Basic
    @Column(name = "expire")
    public long getExpire() {
        return expire;
    }

    public void setExpire(long expire) {
        this.expire = expire;
    }

    @Basic
    @Column(name = "shop")
    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    @Basic
    @Column(name = "credit")
    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CouponDto couponDto = (CouponDto) o;
        return id == couponDto.id &&
                onetime == couponDto.onetime &&
                expire == couponDto.expire &&
                credit == couponDto.credit &&
                Objects.equals(code, couponDto.code) &&
                Objects.equals(shop, couponDto.shop);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, code, onetime, expire, shop, credit);
    }
}
