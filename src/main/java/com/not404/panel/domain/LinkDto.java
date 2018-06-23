package com.not404.panel.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "link", schema = "sspanel", catalog = "")
public class LinkDto {
    private long id;
    private int type;
    private String address;
    private int port;
    private String token;
    private int ios;
    private long userid;
    private String isp;
    private Integer geo;
    private String method;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "type")
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "port")
    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    @Basic
    @Column(name = "token")
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Basic
    @Column(name = "ios")
    public int getIos() {
        return ios;
    }

    public void setIos(int ios) {
        this.ios = ios;
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
    @Column(name = "isp")
    public String getIsp() {
        return isp;
    }

    public void setIsp(String isp) {
        this.isp = isp;
    }

    @Basic
    @Column(name = "geo")
    public Integer getGeo() {
        return geo;
    }

    public void setGeo(Integer geo) {
        this.geo = geo;
    }

    @Basic
    @Column(name = "method")
    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinkDto linkDto = (LinkDto) o;
        return id == linkDto.id &&
                type == linkDto.type &&
                port == linkDto.port &&
                ios == linkDto.ios &&
                userid == linkDto.userid &&
                Objects.equals(address, linkDto.address) &&
                Objects.equals(token, linkDto.token) &&
                Objects.equals(isp, linkDto.isp) &&
                Objects.equals(geo, linkDto.geo) &&
                Objects.equals(method, linkDto.method);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, type, address, port, token, ios, userid, isp, geo, method);
    }
}
