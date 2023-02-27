package org.example;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("\nHi welcome to TringappsBank .\nEnter Your Name : ");


        String accHoldername=in.nextLine();
        System.out.println("Enter your BankAccount Number ");
        int accnumber=in.nextInt();

        TringappsBankAcc ob= new TringappsBankAcc(accHoldername,accnumber,0.0);
        ob.text();
        int a;
        int b;
        int c;

        a=in.nextInt();
        while(a!=4){
            if(a==1) {
                System.out.println("Enter the Amount And add the Cash that you want to Deposit .");
                b=in.nextInt();
                ob.depositCash(b);
                ob.text();
                System.out.println("Enter your Request Number \n");

                a=0;
                a=in.nextInt();
            }
            if(a==2){
                System.out.println("Enter the amount that you want to take out.\n");
                c=in.nextInt();
                ob.withdrawCash(c);

                ob.text();
                System.out.println("\nEnter your Request Number\n ");
                a=0;
                a=in.nextInt();

            }
            if(a==3)
            {
                System.out.print("your current Balnce=>");
                System.out.println(ob.blncEnquiry());
                ob.text();
                System.out.println("Enter your Request Number ");
                a=0;
                a=in.nextInt();

            }
            if(a==4)  System.out.println("Thanks for choosing our Bank.\nBye Bye...");

        }

    }
}