package com.company;

public class Tab {
    private String title;
    private String url;

    public Tab() {
    }

    public Tab(String title, String url) {
        this.title = title;
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String toString(){
        String str=" ";
        str+= "   TabTitle: "+ title+ " tabURL: "+ url+".\n";
        return str;
    }
}
