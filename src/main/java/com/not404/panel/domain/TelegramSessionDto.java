package com.not404.panel.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "telegram_session", schema = "sspanel", catalog = "")
public class TelegramSessionDto {
    private long id;
    private long userId;
    private int type;
    private String sessionContent;
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
    @Column(name = "user_id")
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
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
    @Column(name = "session_content")
    public String getSessionContent() {
        return sessionContent;
    }

    public void setSessionContent(String sessionContent) {
        this.sessionContent = sessionContent;
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
        TelegramSessionDto that = (TelegramSessionDto) o;
        return id == that.id &&
                userId == that.userId &&
                type == that.type &&
                datetime == that.datetime &&
                Objects.equals(sessionContent, that.sessionContent);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, userId, type, sessionContent, datetime);
    }
}
