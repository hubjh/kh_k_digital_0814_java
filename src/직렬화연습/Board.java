package 직렬화연습;

import java.io.Serializable;
import java.util.Date;

/*
Date : 2023-09-05
Author : J.H.Hwang
Purpose :  직렬화를 설명하는 프로그램입니다.
 */
public class Board implements Serializable {
    private int bno;
    private String title;
    private String content;
    private String writer;
    private Date date;

    public int getBno() {
        return bno;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Board(int bno, String title, String content, String writer, Date date) {
        this.bno = bno;
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.date = date;
    }
}