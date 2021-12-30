package com.shsnk.recyclerview;

public class Names {
    private String names;

    public Names(String names) {
        this.names = names;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    @Override
    public String toString() {
        return "Names{" +
                "names='" + names + '\'' +
                '}';
    }
}
