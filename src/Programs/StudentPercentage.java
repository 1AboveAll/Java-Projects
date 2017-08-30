package Programs;

import java.util.Scanner;

public class StudentPercentage {
    private int english;
    private int maths;
    private int physics;
    private int chemistry;
    private int computerScience;

    public StudentPercentage(){
        english=0;
        maths=0;
        physics=0;
        chemistry=0;
        computerScience=0;
    }
    public void calcPercentage(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Marks to Calculate Percentage ");
        System.out.println("Enter your marks in English");
        english=sc.nextInt();
        System.out.println("Enter your marks in Maths");
        maths=sc.nextInt();
        System.out.println("Enter your marks in Physics");
        physics=sc.nextInt();
        System.out.println("Enter your marks in Chemistry");
        chemistry=sc.nextInt();
        System.out.println("Enter your marks in Computer Science");
        computerScience=sc.nextInt();
        System.out.println("Your Percentage is "+(float)((english+maths+physics+computerScience+chemistry)/5)+"%");
    }
}
