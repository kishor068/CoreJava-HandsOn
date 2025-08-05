package org.example.day6;
//Design a thread so that one thread prints- tick and another prints tock
public class Demo6 {
    //main is also a thread
    public static void main(String[] args) throws  Exception {
        ThreadDemo t1=new ThreadDemo();
        ThreadDemo t2=new ThreadDemo("Infosys",10);
        ThreadDemo t3=new ThreadDemo("Swiggy",13);

        t1.start();
        t2.start();
        t3.start();
// Untill the execution of join is not finished, the thread calling it is not executed
        t1.join();
        t2.join();
        t3.join();

        System.out.println("I m in Main");

    }
}
