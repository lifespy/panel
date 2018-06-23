package com.not404.panel.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "detect_list", schema = "sspanel", catalog = "")
public class DetectListDto {
    private long id;
    private String name;
    private String text;
    private String regex;
    private int type;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
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
    @Column(name = "text")
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Basic
    @Column(name = "regex")
    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }

    @Basic
    @Column(name = "type")
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DetectListDto that = (DetectListDto) o;
        return id == that.id &&
                type == that.type &&
                Objects.equals(name, that.name) &&
                Objects.equals(text, that.text) &&
                Objects.equals(regex, that.regex);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, text, regex, type);
    }
}
