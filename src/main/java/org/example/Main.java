package org.example;

import java.util.*;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) {
        Logger ouput=Logger.getLogger("com.api.jar");
        Scanner in= new Scanner(System.in);
        ouput.info("\nHi welcome to TringappsBank .\nEnter Your Name : ");


        String accHoldername=in.nextLine();
        ouput.info("Enter your BankAccount Number ");
        int accnumber=in.nextInt();

        TringappsBankAcc ob= new TringappsBankAcc(accHoldername,accnumber,0.0);
        ob.text();
        int a;
        int b;
        int c;

        a=in.nextInt();
        while(a!=4){
            if(a==1) {
                ouput.info("Enter the Amount And add the Cash that you want to Deposit .");
                b=in.nextInt();
                ob.depositCash(b);
                ob.text();
                ouput.info("Enter your Request Number \n");

                a=0;
                a=in.nextInt();
            }
            if(a==2){
                ouput.info("Enter the amount that you want to take out.\n");
                c=in.nextInt();
                ob.withdrawCash(c);

                ob.text();
                ouput.info("\nEnter your Request Number\n ");
                a=0;
                a=in.nextInt();

            }
            if(a==3)
            {
                ouput.info("your current Balnce=>");
                String sss=""+ob.blncEnquiry();
                ouput.info( sss);
                ob.text();
                ouput.info("Enter your Request Number ");
                a=0;
                a=in.nextInt();

            }
            if(a==4)  ouput.info("Thanks for choosing our Bank.\nBye Bye...");

        }

    }
}