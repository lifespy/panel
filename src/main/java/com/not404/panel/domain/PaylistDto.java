package com.not404.panel.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "paylist", schema = "sspanel", catalog = "")
public class PaylistDto {
    private long id;
    private long userid;
    private BigDecimal total;
    private int status;
    private String tradeno;
    private long datetime;

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
    @Column(name = "total")
    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    @Basic
    @Column(name = "status")
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Basic
    @Column(name = "tradeno")
    public String getTradeno() {
        return tradeno;
    }

    public void setTradeno(String tradeno) {
        this.tradeno = tradeno;
    }

    @Basic
    @Column(name = "datetime")
    public long getDatetime() {
        return datetime;
    }

    public void setDatetime(long datetime) {
        this.datetime = datetime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PaylistDto that = (PaylistDto) o;
        return id == that.id &&
                userid == that.userid &&
                status == that.status &&
                datetime == that.datetime &&
                Objects.equals(total, that.total) &&
                Objects.equals(tradeno, that.tradeno);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, userid, total, status, tradeno, datetime);
    }
}
