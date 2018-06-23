package com.not404.panel.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "unblockip", schema = "sspanel", catalog = "")
public class UnblockipDto {
    private long id;
    private String ip;
    private long datetime;
    private long userid;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ip")
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
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
    @Column(name = "userid")
    public long getUserid() {
        return userid;
    }

    public void setUserid(long userid) {
        this.userid = userid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UnblockipDto that = (UnblockipDto) o;
        return id == that.id &&
                datetime == that.datetime &&
                userid == that.userid &&
                Objects.equals(ip, that.ip);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, ip, datetime, userid);
    }
}
