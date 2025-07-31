package org.example.day3t3;

public interface ReadI {
    public void read();
}
interface SetI {
    public void setData(int x, int y);
}

interface DisplayI {
    public void display();
}
interface ComputeI {
    public void compute();
}
interface ArithmeticI extends SetI,DisplayI,ComputeI {

}

