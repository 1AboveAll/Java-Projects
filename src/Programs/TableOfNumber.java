package Programs;

import java.util.Scanner;

public class TableOfNumber {
    private int number;

    public TableOfNumber(){
        number=0;
    }

    public void table(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        number=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(number+" x "+i+" = "+(number*i));
        }
    }
}
