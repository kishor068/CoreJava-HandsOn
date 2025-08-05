package org.example.day6;
public class TickTockGame{

    public synchronized void f1(){
        try {
            notify(); // release lock of another thread, wait until this thread finishes
            System.out.print("Tick ");
            wait();// this thread goes to wait
        }catch (Exception e){

        }
    }
    public synchronized void f2(){
        try {

            notify(); // release lock of another thread, wait until this thread finishes
            System.out.println("- Tock");
            wait();// this thread goes to wait
        }catch (Exception e){

        }
    }



}

class  PlayerOne extends Thread{
    TickTockGame obj1;
    public PlayerOne(TickTockGame obj1){
        this.obj1=obj1;
    }

    @Override
    public void run() {
        try {
            for (int i=0;i<10;i++){
                obj1.f1();
            }
        }catch (Exception e){}
    }
}




class  PlayerTwo extends Thread{
    TickTockGame obj1;
    public PlayerTwo(TickTockGame obj1){
        this.obj1=obj1;
    }

    @Override
    public void run() {
        try {
            for (int i=0;i<10;i++){
                if(i==0) sleep(20);
                obj1.f2();
            }
        }catch (Exception e){}
    }
}