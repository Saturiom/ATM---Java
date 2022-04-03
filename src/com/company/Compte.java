package com.company;

public class Compte {
    private String mCodeUser;
    private String mUser;
    private String mDateUser;
    private int mArgentUser;

    public Compte(String mCodeUser, String mUser, String mDateUser, int mArgentUser) {
        this.mCodeUser = mCodeUser;
        this.mUser = mUser;
        this.mDateUser = mDateUser;
        this.mArgentUser = mArgentUser;
    }

    public String getmCodeUser() {
        return mCodeUser;
    }

    public void setmCodeUser(String mCodeUser) {
        this.mCodeUser = mCodeUser;
    }

    public String getmUser() {
        return mUser;
    }

    public void setmUser(String mUser) {
        this.mUser = mUser;
    }

    public String getmDateUser() {
        return mDateUser;
    }

    public void setmDateUser(String mDateUser) {
        this.mDateUser = mDateUser;
    }

    public int getmArgentUser() {
        return mArgentUser;
    }

    public void setmArgentUser(int mArgentUser) {
        this.mArgentUser = mArgentUser;
    }
}
