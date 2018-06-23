package com.not404.panel.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "user_traffic_log", schema = "sspanel", catalog = "")
public class UserTrafficLogDto {
    private int id;
    private int userId;
    private long u;
    private long d;
    private int nodeId;
    private double rate;
    private String traffic;
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
    @Column(name = "user_id")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "u")
    public long getU() {
        return u;
    }

    public void setU(long u) {
        this.u = u;
    }

    @Basic
    @Column(name = "d")
    public long getD() {
        return d;
    }

    public void setD(long d) {
        this.d = d;
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
    @Column(name = "rate")
    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Basic
    @Column(name = "traffic")
    public String getTraffic() {
        return traffic;
    }

    public void setTraffic(String traffic) {
        this.traffic = traffic;
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
        UserTrafficLogDto that = (UserTrafficLogDto) o;
        return id == that.id &&
                userId == that.userId &&
                u == that.u &&
                d == that.d &&
                nodeId == that.nodeId &&
                Double.compare(that.rate, rate) == 0 &&
                logTime == that.logTime &&
                Objects.equals(traffic, that.traffic);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, userId, u, d, nodeId, rate, traffic, logTime);
    }
}
