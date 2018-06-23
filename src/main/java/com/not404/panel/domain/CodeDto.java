package com.not404.panel.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "code", schema = "sspanel", catalog = "")
public class CodeDto {
    private long id;
    private String code;
    private int type;
    private BigDecimal number;
    private int isused;
    private long userid;
    private Timestamp usedatetime;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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
    @Column(name = "number")
    public BigDecimal getNumber() {
        return number;
    }

    public void setNumber(BigDecimal number) {
        this.number = number;
    }

    @Basic
    @Column(name = "isused")
    public int getIsused() {
        return isused;
    }

    public void setIsused(int isused) {
        this.isused = isused;
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
    @Column(name = "usedatetime")
    public Timestamp getUsedatetime() {
        return usedatetime;
    }

    public void setUsedatetime(Timestamp usedatetime) {
        this.usedatetime = usedatetime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CodeDto codeDto = (CodeDto) o;
        return id == codeDto.id &&
                type == codeDto.type &&
                isused == codeDto.isused &&
                userid == codeDto.userid &&
                Objects.equals(code, codeDto.code) &&
                Objects.equals(number, codeDto.number) &&
                Objects.equals(usedatetime, codeDto.usedatetime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, code, type, number, isused, userid, usedatetime);
    }
}
