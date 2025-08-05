package org.example.day6;
public class ThreadDemo extends Thread {
    String name="Sony Pvt Ltd";
    int n=15;
    public ThreadDemo(){}

    public ThreadDemo(String name, int n){
        this.name=name;
        this.n=n;
    }

    @Override
    public void run() {
        for (int i=0;i<n;i++){
            System.out.println(i+" "+name);
            try {
                sleep(10);//checked exception
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
