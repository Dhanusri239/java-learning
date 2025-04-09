import java.util.*;
public class prog58 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int n=num;
        int sum=0;
            while(num!=0){
            int d=num%10;
            int fact=1;
            for(int i=1;i<=d;i++){
                fact*=i;
            }
            sum=sum+fact;
            num/=10;
        }
        if(n==sum){
            System.out.println("Its strong number");

        }
        else{
            System.out.println("Not a strong number");
        }


    }
    
}
