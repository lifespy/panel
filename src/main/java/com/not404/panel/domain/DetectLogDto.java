package com.not404.panel.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "detect_log", schema = "sspanel", catalog = "")
public class DetectLogDto {
    private long id;
    private long userId;
    private long listId;
    private long datetime;
    private int nodeId;

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
    @Column(name = "list_id")
    public long getListId() {
        return listId;
    }

    public void setListId(long listId) {
        this.listId = listId;
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
    @Column(name = "node_id")
    public int getNodeId() {
        return nodeId;
    }

    public void setNodeId(int nodeId) {
        this.nodeId = nodeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DetectLogDto that = (DetectLogDto) o;
        return id == that.id &&
                userId == that.userId &&
                listId == that.listId &&
                datetime == that.datetime &&
                nodeId == that.nodeId;
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, userId, listId, datetime, nodeId);
    }
}
