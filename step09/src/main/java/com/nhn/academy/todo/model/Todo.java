package com.nhn.academy.todo.model;

public class Todo {
    private static int counter = 1;
    private int id;
    private String title;
    private int hours;
    private boolean done;

    public Todo() {
        this.title = "제목 없음";
        this.hours = 0;
        this.done = false;
        this.id = counter++;
    }

    public Todo(String title, int hours, boolean done) {
        this.title = title;
        this.hours = hours;
        this.done = done;
        this.id = counter++;
    }

    public String getTitle() {
        return title;
    }

    public int getHours() {
        return hours;
    }

    public boolean getDone() {
        return done;
    }

    public int getId() {
        return id;
    }

    public static int getCounter() {
        return counter;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return "[ 고유번호 : " + getId() + " | 제목 : " + getTitle() + " | 소요 시간 : " + getHours() + " | 완료 여부 : " + getDone()
                + " ]";
    }
}
