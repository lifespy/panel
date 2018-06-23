package com.not404.panel.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ss_node_online_log", schema = "sspanel", catalog = "")
public class SsNodeOnlineLogDto {
    private int id;
    private int nodeId;
    private int onlineUser;
    private int logTime;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "node_id")
    public int getNodeId() {
        return nodeId;
    }

    public void setNodeId(int nodeId) {
        this.nodeId = nodeId;
    }

    @Basic
    @Column(name = "online_user")
    public int getOnlineUser() {
        return onlineUser;
    }

    public void setOnlineUser(int onlineUser) {
        this.onlineUser = onlineUser;
    }

    @Basic
    @Column(name = "log_time")
    public int getLogTime() {
        return logTime;
    }

    public void setLogTime(int logTime) {
        this.logTime = logTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SsNodeOnlineLogDto that = (SsNodeOnlineLogDto) o;
        return id == that.id &&
                nodeId == that.nodeId &&
                onlineUser == that.onlineUser &&
                logTime == that.logTime;
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, nodeId, onlineUser, logTime);
    }
}
