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
            case 2: 
                 areaOfCircle();
            break;
            case 3:
                Scanner sc=new Scanner(System.in);
                System.out.println("enter length of array");
                int length=sc.nextInt();
                int arr[]=new int[length];
                System.out.println("enter elements of the array");
                for(int i=0;i<=length;i++){
                    arr[i]=sc.nextInt();
                }
                System.out.println("Enter the target element");
                int target=sc.nextInt();
                int result=linearSearchGo(arr,target);
                if(result==-1) System.out.println("NOt found");
                else{
                    System.out.println("Target found at "+ result);
                }
                break;
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

    public static void areaOfCircle() 
    {   
       
      Scanner s= new Scanner(System.in);
        
         System.out.println("Enter the radius:");
         double r= s.nextDouble();
         double  area=(22*r*r)/7 ;
         System.out.println("Area of Circle is: " + area);      
   }    
    public static int linearSearchGo(int arr[], int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i=0; i<arr.length; i++){
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;
    }

}

