package com.neu.MyListView;

public class Bean {
    private String username;
    private String image;
    private String context;

    public Bean() {
    }

    public Bean(String username, String image, String context) {
        this.username = username;
        this.image = image;
        this.context = context;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}
