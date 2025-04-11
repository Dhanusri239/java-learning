import java.util.Scanner;
public class prog67 {
    public static void adam(int n){
        int a=n*n;
        int rev1=0;
        int rev2=0;
        while(a!=0){
            int d1=a%10;
            rev1=rev1*10+d1;
            a/=10;
        }
        while(n!=0){
            int d2=n%10;
            rev2=rev2*10+d2;
            n/=10;
        }
        int a1=rev2*rev2;
        if(a1==rev1){
            System.out.println("Yes it's adam number");
        }
        else{
            System.out.println("No it's not a adam number");
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        adam(n);
    }
}
