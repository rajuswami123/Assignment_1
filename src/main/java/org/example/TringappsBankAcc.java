package org.example;

import java.util.logging.Logger;

class TringappsBankAcc {
    Logger ouput=Logger.getLogger("com.api.jar");
    private String accHolderName;
    private int accNumber;
    private double accBlnc;

    TringappsBankAcc(String name, int num, double blc) {
        this.accHolderName = name;
        this.accNumber = num;
        this.accBlnc = blc;
    }

    void text() {
        ouput.info("1)Deposit Cash\n2)Withdraw Cash\n3)Balance Enquiry\n4)Exit");
    }

    void depositCash(int x) {
        accBlnc += x;
        ouput.info("Cash is Deposited in your Account ..\n");

    }

    void withdrawCash(int x) {
        if (accBlnc >= x) {
            accBlnc -= x;
            ouput.info("You Have successfully withdrwan Cash");
        } else {
            ouput.info("You Dont Have Sufficient Balance.");


        }

    }

    double blncEnquiry() {
        return accBlnc;
    }

}
