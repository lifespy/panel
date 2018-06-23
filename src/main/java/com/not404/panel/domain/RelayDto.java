package com.not404.panel.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "relay", schema = "sspanel", catalog = "")
public class RelayDto {
    private long id;
    private long userId;
    private long sourceNodeId;
    private long distNodeId;
    private String distIp;
    private int port;
    private int priority;

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
    @Column(name = "source_node_id")
    public long getSourceNodeId() {
        return sourceNodeId;
    }

    public void setSourceNodeId(long sourceNodeId) {
        this.sourceNodeId = sourceNodeId;
    }

    @Basic
    @Column(name = "dist_node_id")
    public long getDistNodeId() {
        return distNodeId;
    }

    public void setDistNodeId(long distNodeId) {
        this.distNodeId = distNodeId;
    }

    @Basic
    @Column(name = "dist_ip")
    public String getDistIp() {
        return distIp;
    }

    public void setDistIp(String distIp) {
        this.distIp = distIp;
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
    @Column(name = "priority")
    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RelayDto relayDto = (RelayDto) o;
        return id == relayDto.id &&
                userId == relayDto.userId &&
                sourceNodeId == relayDto.sourceNodeId &&
                distNodeId == relayDto.distNodeId &&
                port == relayDto.port &&
                priority == relayDto.priority &&
                Objects.equals(distIp, relayDto.distIp);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, userId, sourceNodeId, distNodeId, distIp, port, priority);
    }
}
