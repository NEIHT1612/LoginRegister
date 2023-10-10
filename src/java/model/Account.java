/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author PC
 */
public class Account {

    private String userid;
    private String password;
    private String displayname;

    public Account() {
    }

    public Account(String userid, String password, String displayname) {
        this.userid = userid;
        this.password = password;
        this.displayname = displayname;
    }

    public Account(String string, String string0) {
        this.userid = string;
        this.password = string0;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDisplayname() {
        return displayname;
    }

    public void setDisplayname(String displayname) {
        this.displayname = displayname;
    }

    @Override
    public String toString() {
        return "Account{" + "userid=" + userid + ", password=" + password + ", displayname=" + displayname + '}';
    }

}
