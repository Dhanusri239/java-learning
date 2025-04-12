import java.util.*;
class prog74{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int in=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[in++]=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            while(in<n){
                arr[in++]=0;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}