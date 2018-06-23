package com.not404.panel.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "radius_ban", schema = "sspanel", catalog = "")
public class RadiusBanDto {
    private int id;
    private int userid;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "userid")
    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RadiusBanDto that = (RadiusBanDto) o;
        return id == that.id &&
                userid == that.userid;
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, userid);
    }
}
