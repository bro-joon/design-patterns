package com.boksil2.iterator;

import javax.xml.crypto.Data;
import java.util.Date;

public class Post {

    private String title;

    public String getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(String createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    private String createdDateTime;

    public Post(String title) {
        this.title = title;
        this.createdDateTime = String.valueOf((new Date()).getTime());
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
