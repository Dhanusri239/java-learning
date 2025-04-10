import java.util.*;
public class prog63 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        int sum=0;
        int pr=1;
        while(n!=0){
             int d=n%10;
             sum+=d;
             pr*=d;
             n/=10;
        }
        if(sum==pr){
            System.out.println(" Yes it's spy number");
        }
        else{
            System.out.println("No it's not a spy number");
        }
        sc.close();

    }
    
}
