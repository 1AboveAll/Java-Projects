package Programs;

import java.util.Scanner;

public class LargestOfThree {
    private int one;
    private int two;
    private int three;

    public LargestOfThree(){
        one=0;
        two=0;
        three=0;
    }

    public void printLargest(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number");
        one=sc.nextInt();
        System.out.println("Enter Second Number");
        two=sc.nextInt();
        System.out.println("Enter Third Number");
        three=sc.nextInt();
        if(one>two){
            if(one>three){
                System.out.println("The Largest is "+one);
            }else
                System.out.println("The Largest is "+three);
        }else{
            if(two>three){
                System.out.println("The Largest is "+two);
            }
            else
                System.out.println("The Largest is "+three);
        }
    }

}
