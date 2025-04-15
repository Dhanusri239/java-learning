import java.util.*;
public class prog84 {
    public static boolean iskaprekar(int n){
            int s=n*n;
            int t=s;
            int d=0;
            if(n==1){
            return true;
            }
            if(n==10){
                return true;
            }
            while(t!=0){
                d++;
                t/=10;
            }
            for(int i=1;i<d;i++){
                    int di=(int)Math.pow(10,i);
                    int l=s/di;
                    int r=s%di;
                    if(r>0 && r+l==n){
                        return true;
                }
            }
            return false;


    }
    public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      if(iskaprekar(n)){
        System.out.println("Yes it's kaprekar number");
      }
      else{
        System.out.println("Not a kaprekar number");
      }
    }
}
