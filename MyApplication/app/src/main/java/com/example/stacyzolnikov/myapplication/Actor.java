package com.example.stacyzolnikov.myapplication;

/**
 * Created by joshuagoldberg on 8/10/16.
 */
public class Actor {

    private String mName, mDob;
    private int mOscarsWon;

    public Actor() {}

    public Actor(String name, String dob, int oscarsWon) {
        mName = name;
        mDob = dob;
        mOscarsWon = oscarsWon;
    }

    public String getDob() {
        return mDob;
    }

    public void setDob(String dob) {
        this.mDob = mDob;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = mName;
    }

    public int getOscarsWon() {
        return mOscarsWon;
    }

    public void setOscarsWon(int oscarsWon) {
        this.mOscarsWon = mOscarsWon;
    }
}
