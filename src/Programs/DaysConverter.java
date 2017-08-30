package Programs;

import java.util.Scanner;

public class DaysConverter {
    private int days;
    public DaysConverter(){
        days=0;
    }
    public void convertDays(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of Days");
        days=sc.nextInt();
        if(days/365<2) {
            System.out.println(days + " Days = " + (days / 365) + " Year");
        }
        else{
            System.out.println(days + " Days = " + (days / 365) + " Years");
        }
        if(days/30<2) {
            System.out.println(days + " Days = " + (days / 30) + " Month");
        }
        else{
            System.out.println(days + " Days = " + (days / 30) + " Months");
        }
        if(days/7<2){
            System.out.println(days+" Days = "+(days/7)+" Week");
        }
        else {
            System.out.println(days + " Days = " + (days / 7) + " Weeks");
        }

    }
}
