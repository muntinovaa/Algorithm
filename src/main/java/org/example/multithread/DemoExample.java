package org.example.multithread;

public class DemoExample {
    public static void main(String[] args) {
        ThreadDemo threadDemo=new ThreadDemo();
        threadDemo.start();
        for(int i=0; i<10; i++){
            System.out.println("Value of i is : "+i);
        }

    }
}
