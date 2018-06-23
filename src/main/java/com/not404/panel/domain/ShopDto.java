package com.not404.panel.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "shop", schema = "sspanel", catalog = "")
public class ShopDto {
    private long id;
    private String name;
    private BigDecimal price;
    private String content;
    private int autoRenew;
    private int autoResetBandwidth;
    private int status;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "price")
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Basic
    @Column(name = "content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "auto_renew")
    public int getAutoRenew() {
        return autoRenew;
    }

    public void setAutoRenew(int autoRenew) {
        this.autoRenew = autoRenew;
    }

    @Basic
    @Column(name = "auto_reset_bandwidth")
    public int getAutoResetBandwidth() {
        return autoResetBandwidth;
    }

    public void setAutoResetBandwidth(int autoResetBandwidth) {
        this.autoResetBandwidth = autoResetBandwidth;
    }

    @Basic
    @Column(name = "status")
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShopDto shopDto = (ShopDto) o;
        return id == shopDto.id &&
                autoRenew == shopDto.autoRenew &&
                autoResetBandwidth == shopDto.autoResetBandwidth &&
                status == shopDto.status &&
                Objects.equals(name, shopDto.name) &&
                Objects.equals(price, shopDto.price) &&
                Objects.equals(content, shopDto.content);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, price, content, autoRenew, autoResetBandwidth, status);
    }
}
