package com.not404.panel.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ss_node_info", schema = "sspanel", catalog = "")
public class SsNodeInfoDto {
    private int id;
    private int nodeId;
    private double uptime;
    private String load;
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
    @Column(name = "uptime")
    public double getUptime() {
        return uptime;
    }

    public void setUptime(double uptime) {
        this.uptime = uptime;
    }

    @Basic
    @Column(name = "load")
    public String getLoad() {
        return load;
    }

    public void setLoad(String load) {
        this.load = load;
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
        SsNodeInfoDto that = (SsNodeInfoDto) o;
        return id == that.id &&
                nodeId == that.nodeId &&
                Double.compare(that.uptime, uptime) == 0 &&
                logTime == that.logTime &&
                Objects.equals(load, that.load);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, nodeId, uptime, load, logTime);
    }
}
