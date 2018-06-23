package com.not404.panel.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "announcement", schema = "sspanel", catalog = "")
public class AnnouncementDto {
    private int id;
    private Timestamp date;
    private String content;
    private String markdown;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "date")
    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    @Basic
    @Column(name = "content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "markdown")
    public String getMarkdown() {
        return markdown;
    }

    public void setMarkdown(String markdown) {
        this.markdown = markdown;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnnouncementDto that = (AnnouncementDto) o;
        return id == that.id &&
                Objects.equals(date, that.date) &&
                Objects.equals(content, that.content) &&
                Objects.equals(markdown, that.markdown);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, date, content, markdown);
    }
}
