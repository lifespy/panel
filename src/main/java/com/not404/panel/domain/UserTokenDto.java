package com.not404.panel.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "user_token", schema = "sspanel", catalog = "")
public class UserTokenDto {
    private int id;
    private String token;
    private int userId;
    private int createTime;
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
    @Column(name = "token")
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Basic
    @Column(name = "user_id")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "create_time")
    public int getCreateTime() {
        return createTime;
    }

    public void setCreateTime(int createTime) {
        this.createTime = createTime;
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
        UserTokenDto that = (UserTokenDto) o;
        return id == that.id &&
                userId == that.userId &&
                createTime == that.createTime &&
                expireTime == that.expireTime &&
                Objects.equals(token, that.token);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, token, userId, createTime, expireTime);
    }
}
