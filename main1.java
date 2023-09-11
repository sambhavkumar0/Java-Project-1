import java.util.*;
public class main1{

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("|    Enter the no. of the case you want to run         !");
        System.out.println(" -------------------------------------------------------");
        System.out.println("|0 : To find the factorial of a number                 |");
        System.out.println("|1 : To multiply two numbers                           |");
        System.out.println("|2 : To calculate the area of a circle                 |");
        System.out.println("|3 : To return index of target no. using linear search |");
        System.out.println("|4 : To find non-repeating words in string             |");
        System.out.println("|5 : To find majority element in an array              |");
        System.out.println("|6 : To merge two arrays into one                      |");
        System.out.println("|7 : To remove duplicate elements in an array          |");
        System.out.println("|8 : To find element using binary search               |");
        System.out.println("|9 : To return index no. of the target element         |");
        System.out.println(" -------------------------------------------------------");


        n=sc.nextInt();
        switch(n) {
            case 0:
                factorial();
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
                int arr10[]=new int[length];
                System.out.println("enter elements of the array");
                for(int i=0;i<=length;i++){
                    arr10[i]=sc.nextInt();
                }
                System.out.println("Enter the target element");
                int target=sc.nextInt();
                int result=linearSearchGo(arr10,target);
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
                Scanner sc6=new Scanner(System.in);
                System.out.println("Enter the length of the first array ");
                int m1=sc6.nextInt();
                int numbers1[]=new int[m1];
                System.out.println("enter the array elements ");
		        for(int i=0; i<m1; i++){
                    numbers1[i]=sc6.nextInt();
                }
                System.out.println("Enter the length of the second array ");
			    
			    int n1=sc6.nextInt();
                System.out.println("enter the array elements ");
                int numbers2[]=new int[n1];
		        for(int i=0; i<n1; i++){
                    numbers2[i]=sc6.nextInt();
                }
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
            case 9:
               Scanner sc9 = new Scanner(System.in);
                System.out.println("Enter the length of an array: ");
            int l9 = sc.nextInt();
            int arr9[] = new int[l9];
            System.out.println("Enter the array");
            for(int i =0;i<l9;i++){
                arr9[i] = sc9.nextInt();
            }
            System.out.println("Enter the target element");
            int targtetelement9 = sc9.nextInt();
            int ans = orderAgnostic(arr9, targtetelement9);
            System.out.println("The target was found at "+ans);
            break;
           

            default: System.out.println("Invalid option chosen .Try again!"); break;

    }
        sc.close();

}
    //method 0
    public static void factorial(){
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("Enter a number to get its factorial");
        a=sc.nextInt();
	    fac=1;
       for(int i=1;i<=a;i++){
	       fac=fac*i;
       }
	    System.out.println("The factorial is "+fac);
    }
   
    //method 1
    public static void mulTwoNumbers(){
        int x,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
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
    public static int linearSearchGo(int arr10[], int target){
        if(arr10.length == 0){
            return -1;
        }
        for(int i=0; i<arr10.length; i++){
            int element = arr10[i];
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
        int[] arr3=new int[m1+n1];
        System.out.println("length of merged array is " + arr3.length);
         for(int i=0;i<m1;i++){
            arr3[i]=numbers1[i];
            
        }

        for(int j=0,i=m1;j<n1;j++){
              arr3[i]=numbers2[j];
            i++;
        }
        Arrays.sort(arr3);
        System.out.println("The merged array is: ");
        for(int i=0;i<arr3.length;i++){
        	System.out.print(arr3[i]+",");
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
	public static int binarySearch(int arr10[], int target){
        int start = 0; 
        int end =arr10.length-1;

        while(start <= end){
            int mid =  start +(end - start)/2;

            if(target < arr10[mid]){
                end = mid-1;
            }else if(target > arr10[mid]){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    //method 9
    public static int orderAgnostic(int arr9[], int targtetelement9){
        int start = 0;
        int end = arr9.length-1;
        //Finding wheather Ascending or Descending
        
        boolean isAsc;
        if(arr9[start]<arr9[end]){
            isAsc = true;
        }else{
            isAsc = false;
        }

        while(start<=end){
            int mid = start +(end-start)/2;
            
            if(arr9[mid] == targtetelement9){
                return mid;
            }
            if(isAsc){
                if(targtetelement9 < arr9[mid]){
                    end = mid-1;
                }
                else if(targtetelement9 > arr9[mid]){
                    start = start+1;
                }
            } else{
                if(targtetelement9 > arr9[mid]){
                    end = mid-1;
                }else if(targtetelement9 < arr9[mid]){
                    start = mid+1;
                }
            }
         }
         return -1;
    } 
}

