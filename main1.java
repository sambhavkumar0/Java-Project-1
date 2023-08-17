import java.util.*;
public class main1{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter a number between 0 and 9");
        n=sc.nextInt();
        switch(n) {
            case 0:
                addTwoNumbers();
                break;
            case 1:
                mulTwoNumbers();
                break;
            case 2:break;
            case 3:break;
            case 4:break;
            case 5:break;
            case 6:break;
            case 7:break;
            case 8:break;
            case 9:break;
            case 10:break;
            default: System.out.println("Invalid option choosen .Try again!"); break;

    }

}
    public static void addTwoNumbers(){
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter two numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("The sum is "+ (a+b));
    }
    public static void mulTwoNumbers(){
        int x,y;
        Scanner sc = new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        int mul = x*y;
        System.out.println("The multiplication of two integers is "+mul);
    }

}

