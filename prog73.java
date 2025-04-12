import java.util.*;
class prog73{
    public static int sum(int n){
        int sum=0;
        while(n!=0){
            int d=n%10;
            sum+=d*d;
            n/=10;
        }
        return sum;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result=n;
        if(result!=1 && result!=4 ){
            result=sum(n);
        }
        if(result==1){
            System.out.println("Happy number");
        }
        else{
            System.out.println("Unhappy number");
        }
    }
}