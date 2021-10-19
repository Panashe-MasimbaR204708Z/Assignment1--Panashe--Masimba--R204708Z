package com.company;

public class Main {

    //Creating method calculatePay that accepts 2 arguments for the basePay and hours worked for calculating the pay
    public static double calculatePay(double basePay, int hoursWorked)
    {
        //Declaring variable for the final pay and for the overtime hours worked
        double pay = 0.0;
        int overtimeHours = hoursWorked - 40;
        //A person must work a maximum of 60 hours a week
        if (hoursWorked > 60 || hoursWorked < 0)
        {
            System.out.println("A person can work for a maximum of 60 hours a week or hours cannot be negative.");
        }
        //The minimum wage is $8.00/hour
        else if (basePay<8)
        {
            System.out.println("Base pay cannot be less than $8.00");
        }
        else
        {
            //if the person  has not worked overtime hours the pay is calculated here
            if (overtimeHours<=0)
            {
                pay = hoursWorked*basePay;
            }
            // if the person has worked overtime hours the pay is calculated here
            else 
            {
                pay = (40*basePay)+ (overtimeHours*1.5*basePay);
            }

        }
        return  pay;

    }

    public static void main(String[] args) {
	// write your code here
        System.out.println(calculatePay(8.00, 40));

    }
}
