package com.not404.panel.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "speedtest", schema = "sspanel", catalog = "")
public class SpeedtestDto {
    private long id;
    private int nodeid;
    private long datetime;
    private String telecomping;
    private String telecomeupload;
    private String telecomedownload;
    private String unicomping;
    private String unicomupload;
    private String unicomdownload;
    private String cmccping;
    private String cmccupload;
    private String cmccdownload;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "nodeid")
    public int getNodeid() {
        return nodeid;
    }

    public void setNodeid(int nodeid) {
        this.nodeid = nodeid;
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
    @Column(name = "telecomping")
    public String getTelecomping() {
        return telecomping;
    }

    public void setTelecomping(String telecomping) {
        this.telecomping = telecomping;
    }

    @Basic
    @Column(name = "telecomeupload")
    public String getTelecomeupload() {
        return telecomeupload;
    }

    public void setTelecomeupload(String telecomeupload) {
        this.telecomeupload = telecomeupload;
    }

    @Basic
    @Column(name = "telecomedownload")
    public String getTelecomedownload() {
        return telecomedownload;
    }

    public void setTelecomedownload(String telecomedownload) {
        this.telecomedownload = telecomedownload;
    }

    @Basic
    @Column(name = "unicomping")
    public String getUnicomping() {
        return unicomping;
    }

    public void setUnicomping(String unicomping) {
        this.unicomping = unicomping;
    }

    @Basic
    @Column(name = "unicomupload")
    public String getUnicomupload() {
        return unicomupload;
    }

    public void setUnicomupload(String unicomupload) {
        this.unicomupload = unicomupload;
    }

    @Basic
    @Column(name = "unicomdownload")
    public String getUnicomdownload() {
        return unicomdownload;
    }

    public void setUnicomdownload(String unicomdownload) {
        this.unicomdownload = unicomdownload;
    }

    @Basic
    @Column(name = "cmccping")
    public String getCmccping() {
        return cmccping;
    }

    public void setCmccping(String cmccping) {
        this.cmccping = cmccping;
    }

    @Basic
    @Column(name = "cmccupload")
    public String getCmccupload() {
        return cmccupload;
    }

    public void setCmccupload(String cmccupload) {
        this.cmccupload = cmccupload;
    }

    @Basic
    @Column(name = "cmccdownload")
    public String getCmccdownload() {
        return cmccdownload;
    }

    public void setCmccdownload(String cmccdownload) {
        this.cmccdownload = cmccdownload;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SpeedtestDto that = (SpeedtestDto) o;
        return id == that.id &&
                nodeid == that.nodeid &&
                datetime == that.datetime &&
                Objects.equals(telecomping, that.telecomping) &&
                Objects.equals(telecomeupload, that.telecomeupload) &&
                Objects.equals(telecomedownload, that.telecomedownload) &&
                Objects.equals(unicomping, that.unicomping) &&
                Objects.equals(unicomupload, that.unicomupload) &&
                Objects.equals(unicomdownload, that.unicomdownload) &&
                Objects.equals(cmccping, that.cmccping) &&
                Objects.equals(cmccupload, that.cmccupload) &&
                Objects.equals(cmccdownload, that.cmccdownload);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, nodeid, datetime, telecomping, telecomeupload, telecomedownload, unicomping, unicomupload, unicomdownload, cmccping, cmccupload, cmccdownload);
    }
}
