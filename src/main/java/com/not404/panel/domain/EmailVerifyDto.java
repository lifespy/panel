package com.not404.panel.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "email_verify", schema = "sspanel", catalog = "")
public class EmailVerifyDto {
    private long id;
    private String email;
    private String ip;
    private String code;
    private long expireIn;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
    @Column(name = "code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "expire_in")
    public long getExpireIn() {
        return expireIn;
    }

    public void setExpireIn(long expireIn) {
        this.expireIn = expireIn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmailVerifyDto that = (EmailVerifyDto) o;
        return id == that.id &&
                expireIn == that.expireIn &&
                Objects.equals(email, that.email) &&
                Objects.equals(ip, that.ip) &&
                Objects.equals(code, that.code);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, email, ip, code, expireIn);
    }
}
