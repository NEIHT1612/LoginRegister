/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author PC
 */
public class Thread {
    private int tid;
    private String thread;

    public Thread() {
    }

    public Thread(int tid, String thread) {
        this.tid = tid;
        this.thread = thread;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getThread() {
        return thread;
    }

    public void setThread(String thread) {
        this.thread = thread;
    }

    @Override
    public String toString() {
        return "Thread{" + "tid=" + tid + ", thread=" + thread + '}';
    }
    
}
