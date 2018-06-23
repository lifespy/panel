package com.not404.panel.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "auto", schema = "sspanel", catalog = "")
public class AutoDto {
    private long id;
    private int type;
    private String value;
    private String sign;
    private long datetime;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
    @Column(name = "value")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Basic
    @Column(name = "sign")
    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    @Basic
    @Column(name = "datetime")
    public long getDatetime() {
        return datetime;
    }

    public void setDatetime(long datetime) {
        this.datetime = datetime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AutoDto autoDto = (AutoDto) o;
        return id == autoDto.id &&
                type == autoDto.type &&
                datetime == autoDto.datetime &&
                Objects.equals(value, autoDto.value) &&
                Objects.equals(sign, autoDto.sign);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, type, value, sign, datetime);
    }
}
