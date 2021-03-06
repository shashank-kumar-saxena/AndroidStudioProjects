package com.shsnk.recviewwithimg;

public class Content {
    private String name;
    private String email;
    private String imgURL;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }

    public Content(String name, String email, String imgURL) {
        this.name = name;
        this.email = email;
        this.imgURL = imgURL;
    }
}
