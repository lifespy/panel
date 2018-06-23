package com.not404.panel.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ss_password_reset", schema = "sspanel", catalog = "")
public class SsPasswordResetDto {
    private int id;
    private String email;
    private String token;
    private int initTime;
    private int expireTime;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
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
    @Column(name = "token")
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Basic
    @Column(name = "init_time")
    public int getInitTime() {
        return initTime;
    }

    public void setInitTime(int initTime) {
        this.initTime = initTime;
    }

    @Basic
    @Column(name = "expire_time")
    public int getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(int expireTime) {
        this.expireTime = expireTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SsPasswordResetDto that = (SsPasswordResetDto) o;
        return id == that.id &&
                initTime == that.initTime &&
                expireTime == that.expireTime &&
                Objects.equals(email, that.email) &&
                Objects.equals(token, that.token);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, email, token, initTime, expireTime);
    }
}
