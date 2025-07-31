package org.example.day2;

import org.example.day1.Read;

public class Matrix {
    int m1[][];// all arrays are object
    public  Matrix(){
        m1=new int[3][3];
    }

    public  Matrix(int x,int y){
        m1=new int[x][y];
    }
    public  Matrix(Matrix obj){
        m1=obj.m1;
    }
    public  void readMatrix(){
        for(int i=0;i<m1.length;i++){//m1.lenght is going to take the row size
            for(int j=0;j<m1[i].length;j++){
                m1[i][j]= Read.sc.nextInt();
            }
        }
    }

    public  void printMatrix(){
        for(int i=0;i<m1.length;i++){//m1.length is going to take the row size
            for(int x:m1[i]){
                System.out.print(x+" ");
            }
            System.out.println();
        }

    }

    public Matrix addMatrix(Matrix ob){
//        int m2[][]=new int[this.m1.length][this.m1[0].length];
        Matrix m2=new Matrix(this.m1.length,this.m1[0].length);
//        this()
        for(int i=0;i<m1.length;i++){
            for(int j=0;j<m1[i].length;j++){
                m2.m1[i][j]=this.m1[i][j]+ob.m1[i][j];
            }
        }
        return m2;
    }
    public void finalize(){
        System.out.println("I m in destructor");
        m1=null;
    }

}
