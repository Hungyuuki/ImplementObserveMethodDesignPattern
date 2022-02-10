package com.company;

abstract class Observer {
    protected Subject subject;
    public abstract void update();
}