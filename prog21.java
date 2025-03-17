import java.util.Scanner;
class prog21{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter the value 1:");
        int a=sc.nextInt();
         System.out.println("Enter the value 2:");
        int b=sc.nextInt();
        int oddcount=0;
        int evencount=0;
        for(int i=a;i<=b;i=i+1){
            if(i%2!=0){
                oddcount=oddcount+1;
            System.out.println("The number"+i);
            }
        }
        System.out.println("The count of odd number is:"+oddcount);
        for(int i=0;i<=10;i=i+1){
            if(i%2==0){
                evencount=evencount+1;
                System.out.println("The even number is"+i);
            }
        }
        System.out.println("The count of even number is:"+evencount);
        for(int i=1;i<=100;i=i+1){
            if(i%3==0 && i%5==0){
                System.out.println("The number divisible by 3&5 are:"+i);
            }
        }
        
        
        }


}