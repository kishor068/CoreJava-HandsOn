package org.example.day2;

public class Demo3 {
    public static void main(String[] args) {
        Matrix obj=new Matrix(3,3);
        obj.readMatrix();
        Matrix obj1=new Matrix(obj);
        Matrix obj3=obj1.addMatrix(obj);
        obj.printMatrix();
        System.out.println(".........................");

        obj1.printMatrix();
        System.out.println("........................");
        obj3.printMatrix();

        obj=null;
        obj1=null;
        obj3=null;
        System.gc();// explicitly calling Garbage collector to remove the object that is dereffered

    }
}
