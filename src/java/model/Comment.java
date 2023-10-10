/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author PC
 */
public class Comment {
    private int cid;
    private String title;
    private String userid;
    private int tid;

    public Comment() {
    }

    public Comment(int cid, String title, String userid, int tid) {
        this.cid = cid;
        this.title = title;
        this.userid = userid;
        this.tid = tid;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    @Override
    public String toString() {
        return "Comment{" + "cid=" + cid + ", title=" + title + ", userid=" + userid + ", tid=" + tid + '}';
    }
    
}
