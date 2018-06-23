package com.not404.panel.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "payback", schema = "sspanel", catalog = "")
public class PaybackDto {
    private long id;
    private BigDecimal total;
    private long userid;
    private long refBy;
    private BigDecimal refGet;
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
    @Column(name = "total")
    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
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
    @Column(name = "ref_by")
    public long getRefBy() {
        return refBy;
    }

    public void setRefBy(long refBy) {
        this.refBy = refBy;
    }

    @Basic
    @Column(name = "ref_get")
    public BigDecimal getRefGet() {
        return refGet;
    }

    public void setRefGet(BigDecimal refGet) {
        this.refGet = refGet;
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
        PaybackDto that = (PaybackDto) o;
        return id == that.id &&
                userid == that.userid &&
                refBy == that.refBy &&
                datetime == that.datetime &&
                Objects.equals(total, that.total) &&
                Objects.equals(refGet, that.refGet);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, total, userid, refBy, refGet, datetime);
    }
}
