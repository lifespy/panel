package com.not404.panel.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "ss_node", schema = "sspanel", catalog = "")
public class SsNodeDto {
    private int id;
    private String name;
    private int type;
    private String server;
    private String method;
    private String info;
    private String status;
    private int sort;
    private byte customMethod;
    private double trafficRate;
    private int nodeClass;
    private BigDecimal nodeSpeedlimit;
    private int nodeConnector;
    private long nodeBandwidth;
    private long nodeBandwidthLimit;
    private int bandwidthlimitResetday;
    private long nodeHeartbeat;
    private String nodeIp;
    private int nodeGroup;
    private int customRss;
    private Integer muOnly;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    @Column(name = "server")
    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    @Basic
    @Column(name = "method")
    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    @Basic
    @Column(name = "info")
    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Basic
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "sort")
    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    @Basic
    @Column(name = "custom_method")
    public byte getCustomMethod() {
        return customMethod;
    }

    public void setCustomMethod(byte customMethod) {
        this.customMethod = customMethod;
    }

    @Basic
    @Column(name = "traffic_rate")
    public double getTrafficRate() {
        return trafficRate;
    }

    public void setTrafficRate(double trafficRate) {
        this.trafficRate = trafficRate;
    }

    @Basic
    @Column(name = "node_class")
    public int getNodeClass() {
        return nodeClass;
    }

    public void setNodeClass(int nodeClass) {
        this.nodeClass = nodeClass;
    }

    @Basic
    @Column(name = "node_speedlimit")
    public BigDecimal getNodeSpeedlimit() {
        return nodeSpeedlimit;
    }

    public void setNodeSpeedlimit(BigDecimal nodeSpeedlimit) {
        this.nodeSpeedlimit = nodeSpeedlimit;
    }

    @Basic
    @Column(name = "node_connector")
    public int getNodeConnector() {
        return nodeConnector;
    }

    public void setNodeConnector(int nodeConnector) {
        this.nodeConnector = nodeConnector;
    }

    @Basic
    @Column(name = "node_bandwidth")
    public long getNodeBandwidth() {
        return nodeBandwidth;
    }

    public void setNodeBandwidth(long nodeBandwidth) {
        this.nodeBandwidth = nodeBandwidth;
    }

    @Basic
    @Column(name = "node_bandwidth_limit")
    public long getNodeBandwidthLimit() {
        return nodeBandwidthLimit;
    }

    public void setNodeBandwidthLimit(long nodeBandwidthLimit) {
        this.nodeBandwidthLimit = nodeBandwidthLimit;
    }

    @Basic
    @Column(name = "bandwidthlimit_resetday")
    public int getBandwidthlimitResetday() {
        return bandwidthlimitResetday;
    }

    public void setBandwidthlimitResetday(int bandwidthlimitResetday) {
        this.bandwidthlimitResetday = bandwidthlimitResetday;
    }

    @Basic
    @Column(name = "node_heartbeat")
    public long getNodeHeartbeat() {
        return nodeHeartbeat;
    }

    public void setNodeHeartbeat(long nodeHeartbeat) {
        this.nodeHeartbeat = nodeHeartbeat;
    }

    @Basic
    @Column(name = "node_ip")
    public String getNodeIp() {
        return nodeIp;
    }

    public void setNodeIp(String nodeIp) {
        this.nodeIp = nodeIp;
    }

    @Basic
    @Column(name = "node_group")
    public int getNodeGroup() {
        return nodeGroup;
    }

    public void setNodeGroup(int nodeGroup) {
        this.nodeGroup = nodeGroup;
    }

    @Basic
    @Column(name = "custom_rss")
    public int getCustomRss() {
        return customRss;
    }

    public void setCustomRss(int customRss) {
        this.customRss = customRss;
    }

    @Basic
    @Column(name = "mu_only")
    public Integer getMuOnly() {
        return muOnly;
    }

    public void setMuOnly(Integer muOnly) {
        this.muOnly = muOnly;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SsNodeDto ssNodeDto = (SsNodeDto) o;
        return id == ssNodeDto.id &&
                type == ssNodeDto.type &&
                sort == ssNodeDto.sort &&
                customMethod == ssNodeDto.customMethod &&
                Double.compare(ssNodeDto.trafficRate, trafficRate) == 0 &&
                nodeClass == ssNodeDto.nodeClass &&
                nodeConnector == ssNodeDto.nodeConnector &&
                nodeBandwidth == ssNodeDto.nodeBandwidth &&
                nodeBandwidthLimit == ssNodeDto.nodeBandwidthLimit &&
                bandwidthlimitResetday == ssNodeDto.bandwidthlimitResetday &&
                nodeHeartbeat == ssNodeDto.nodeHeartbeat &&
                nodeGroup == ssNodeDto.nodeGroup &&
                customRss == ssNodeDto.customRss &&
                Objects.equals(name, ssNodeDto.name) &&
                Objects.equals(server, ssNodeDto.server) &&
                Objects.equals(method, ssNodeDto.method) &&
                Objects.equals(info, ssNodeDto.info) &&
                Objects.equals(status, ssNodeDto.status) &&
                Objects.equals(nodeSpeedlimit, ssNodeDto.nodeSpeedlimit) &&
                Objects.equals(nodeIp, ssNodeDto.nodeIp) &&
                Objects.equals(muOnly, ssNodeDto.muOnly);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, type, server, method, info, status, sort, customMethod, trafficRate, nodeClass, nodeSpeedlimit, nodeConnector, nodeBandwidth, nodeBandwidthLimit, bandwidthlimitResetday, nodeHeartbeat, nodeIp, nodeGroup, customRss, muOnly);
    }
}
