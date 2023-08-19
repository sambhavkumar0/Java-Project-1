import java.util.*;
public class main1{

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the no. of the case you want to run!");
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
            case 4:
                   Scanner sc1=new Scanner(System.in);
                   System.out.println("enter a string ");
                   String s= sc1.nextLine();
                    nonrepeating1(s);
                    break;
            case 5:
		        int[] nums={3,3,4};
			    int r=majorityElement(nums);
                System.out.println("The majority element is "+r);
			    break;
            case 6:
		        int[] numbers1={1,2,3,0,0,0};
			    int m1=3;
			    int[] numbers2 ={2,5,6};
			     int n1=3;
			     merge(numbers1,m1,numbers2,n1);
			     break;
            case 7:
			         int[] arr2={3,2,2,3};
			         int val=3;
			         int result1=removeElement(arr2,val);
                     System.out.println("the number of dups found is "+result1);
			        break;
            case 8: 
            Scanner sc5=new Scanner(System.in);    
            System.out.println("Enter the length of the array ");
			int l3=sc.nextInt();
			int arr5[]=new int[l3];
			System.out.println("Enter the array and the target to be found");
            for(int i=0;i<l3;i++){
                arr5[i]=sc5.nextInt();
            }
            System.out.println("enter target");
            int target5=sc5.nextInt();
			int r3=binarySearch(arr5, target5);
			if(r3==-1) System.out.println("The target is not present inside the binary tree");
			else{
				System.out.println("The target was present at index "+r3);
			}
			
			break;
            case 9:break;
            case 10:break;
            default: System.out.println("Invalid option chosen .Try again!"); break;

    }
        sc.close();

}
    //method 0
    public static void addTwoNumbers(){
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter two numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("The sum is "+ (a+b));
    }
   
    //method 1
    public static void mulTwoNumbers(){
        int x,y;
        Scanner sc = new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        int mul = x*y;
        System.out.println("The multiplication of two integers is "+mul);
    }

    //method 2
    public static void areaOfCircle() 
    {   
       
      Scanner s= new Scanner(System.in);
        
         System.out.println("Enter the radius:");
         double r= s.nextDouble();
         double  area=(22*r*r)/7 ;
         System.out.println("Area of Circle is: " + area); 
         s.close();     
   }    
    //method 3
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
    //method 4
    public static void nonrepeating1(String s) {
		
		HashMap<Character,Integer> hm=new HashMap<>();
		char[] ch = s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(hm.containsKey(ch[i])) {
				hm.put(ch[i], hm.get(ch[i])+1);
			}
			else {
				hm.put(ch[i],1);
			}
		}
		for(Character key:hm.keySet()) {
			if(hm.get(key)==1) {
				System.out.println(key);
			}
			
		}
		}
    //method 5
	 public static int majorityElement(int[] nums) {
          Arrays.sort(nums);
          int n = nums.length;
          return nums[n/2];
    }
    
    //method 6
	public static void merge(int[] numbers1, int m1, int[] numbers2, int n1) {
        for(int j=0,i=m1;j<n1;j++){
            numbers1[i]=numbers2[j];
            i++;
        }
        Arrays.sort(numbers1);
        System.out.println("The merged array is: ");
        for(int i=0;i<numbers1.length;i++){
        	System.out.print(numbers1[i]+",");
        }
    }

    //method 7
	public static int removeElement(int[] arr2, int val) {
        int index=0;
       for(int i=0;i<arr2.length;i++){
           if(arr2[i]!=val){
               arr2[index]=arr2[i];
               index++;
           }
       }
       return index;
    }

    //method 8
	public static int binarySearch(int arr[], int target){
        int start = 0; 
        int end =arr.length-1;

        while(start <= end){
            int mid =  start +(end - start)/2;

            if(target < arr[mid]){
                end = mid-1;
            }else if(target > arr[mid]){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }

}

