package com.library;

/**
 * Created with IntelliJ IDEA.
 * User: marsha
 * Date: 6/12/13
 * Time: 4:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class Meter {
    private int i;


    public Meter(int i) {
        this.i=i;

    }

    @Override

    public String toString(){

      return i + "m";

    }

}
