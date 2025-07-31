package org.example.day3t3;

public abstract class  ArithmeticTwo implements ArithmeticI {
    int num1;
    int num2;
    int result;

    @Override
    public void setData(int x, int y) {
        this.num1=x;
        this.num2=y;
    }

    @Override
    public void display() {
        System.out.println("Num1:"+num1+" Num2:"+num2+" Result:"+result);
    }


}
