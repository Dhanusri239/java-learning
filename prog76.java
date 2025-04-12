import java.util.*;
public class prog76 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int re[]=new int[n];
        for(int i=0;i<n;i++){
            if(i==0){
                re[i]=arr[i]*arr[i+1];
            }
            else if(i==n-1){
                re[i]=arr[i]*arr[i-1];
            }
            else{
                re[i]=arr[i-1]*arr[i+1];
            }
        }
        for(int val:re){
            System.out.print(val+" ");
        }
    }
}
