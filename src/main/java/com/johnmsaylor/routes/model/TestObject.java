package com.johnmsaylor.routes.model;

public class TestObject {
    private String first;
    private String middle;
    private String last;

    public TestObject(String first, String middle, String last) {
        this.first = first;
        this.middle = middle;
        this.last = last;
    }

    public String getFirst() {
        return first;
    }

    public String getMiddle() {
        return middle;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }
}
