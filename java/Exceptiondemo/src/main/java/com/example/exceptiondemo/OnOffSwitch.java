package com.example.exceptiondemo;

/**
 * @Description TO DO
 * @Classname Switch
 * @Date 2022/4/27 16:57
 * @Created by richheart
 * Copyright (c) All Rights Reserved, 2022.
 */
class Switch {
    private boolean state = false;
    public boolean read() {
        return state;
    }
    public void on() {
        state = true;
        System.out.println(this);
    }

    public void off() {
        state = false;
        System.out.println(this);
    }

    @Override
    public String toString() {
        return state ? "on" : "off";
    }


}

class OnOffException1 extends Exception {}
class OnOffException2 extends Exception {}
public class OnOffSwitch {
    private static Switch sw = new Switch();

}

