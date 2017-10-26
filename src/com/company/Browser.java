package com.company;

import java.util.ArrayList;

public class Browser {
    private  String name;
    ArrayList<Tab> tabs;

    public Browser() {

        tabs= new ArrayList<Tab>();

    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Tab> getTabs() {
        return tabs;
    }

    public void setTabs(ArrayList<Tab> tabs) {
        this.tabs = tabs;
    }

    public void addTab(Tab tabName){
        tabs.add(tabName);

    }

    public String toString(){
        String str=" ";
        str+= "----------------------------------------------\n";
        str+="browserName:"+ name+"\n";
        str+= "----------------------------------------------\n";

        for(Tab t:tabs){
            str+=t.toString();
        }
        return str;
    }
}
