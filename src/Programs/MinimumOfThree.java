package Programs;

import java.util.Scanner;

public class MinimumOfThree {
    private int  one;
    private int two;
    private int three;


    public MinimumOfThree(){
        one=0;
        two=0;
        three=0;
    }
    public void printMinimum(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number");
        one=sc.nextInt();
        System.out.println("Enter Second Number");
        two=sc.nextInt();
        System.out.println("Enter Third Number");
        three=sc.nextInt();
        System.out.println("The Smallest Number is "+((one<two)?(one<three?one:(two<three)?two:three):(two<three)?two:(one<three)?one:three));

    }
}
