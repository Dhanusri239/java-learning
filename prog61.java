import java.util.Scanner;
class prog61{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number:");
    int num=sc.nextInt();
    int temp=num;
     System.out.println("The factors of given numbers are:");
     int sum=0;
    for(int i=1;i<num;i++){
        if(num%i==0){
            System.out.print(i+" ");
            sum=sum+i;
        }
    }
      System.out.println();
       if(temp==sum){
          System.out.println("Its a perfect number");
    }
    else{
        System.out.println("Not a Perfect number");
    }
}
}