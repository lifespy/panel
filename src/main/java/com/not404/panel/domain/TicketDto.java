package com.not404.panel.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ticket", schema = "sspanel", catalog = "")
public class TicketDto {
    private long id;
    private String title;
    private String content;
    private long rootid;
    private long userid;
    private long datetime;
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
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
    @Column(name = "rootid")
    public long getRootid() {
        return rootid;
    }

    public void setRootid(long rootid) {
        this.rootid = rootid;
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
    @Column(name = "datetime")
    public long getDatetime() {
        return datetime;
    }

    public void setDatetime(long datetime) {
        this.datetime = datetime;
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
        TicketDto ticketDto = (TicketDto) o;
        return id == ticketDto.id &&
                rootid == ticketDto.rootid &&
                userid == ticketDto.userid &&
                datetime == ticketDto.datetime &&
                status == ticketDto.status &&
                Objects.equals(title, ticketDto.title) &&
                Objects.equals(content, ticketDto.content);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, title, content, rootid, userid, datetime, status);
    }
}
