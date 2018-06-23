package com.not404.panel.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "blockip", schema = "sspanel", catalog = "")
public class BlockipDto {
    private long id;
    private int nodeid;
    private String ip;
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
    @Column(name = "nodeid")
    public int getNodeid() {
        return nodeid;
    }

    public void setNodeid(int nodeid) {
        this.nodeid = nodeid;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BlockipDto that = (BlockipDto) o;
        return id == that.id &&
                nodeid == that.nodeid &&
                datetime == that.datetime &&
                Objects.equals(ip, that.ip);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, nodeid, ip, datetime);
    }
}
