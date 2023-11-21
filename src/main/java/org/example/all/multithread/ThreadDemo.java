package org.example.all.multithread;

public class ThreadDemo extends  Thread{

    @Override
    public synchronized void start() {
         System.out.println("Inside the start method!!!");
    }

     @Override
     public void run() {
          System.out.println("Inside the run method!!!");
     }
}

