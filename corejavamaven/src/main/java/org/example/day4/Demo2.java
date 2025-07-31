package org.example.day4;

import org.example.day1.Read;

public class Demo2 {
    public static void main(String[] args) {
        int accoutBalance=200000;
        int amountToWithdraw;
        try {
            System.out.println("Amount to withdraw:");
            amountToWithdraw= Read.sc.nextInt();
            if(amountToWithdraw>=accoutBalance) throw new InsufficientBalance();
            System.out.println("Please wait your transaction is under process");
        }catch (InsufficientBalance e){
            System.out.println(e.getMessage());
        }
    }
}
