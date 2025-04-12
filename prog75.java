import java.util.*;
class prog75{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if(n<2){
            System.out.println(-1);
            return;
        }
        int l=Integer.MIN_VALUE;
        int sl=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>l){
                sl=l;
                l=arr[i];
            }
            else if(arr[i]>sl && arr[i]!=l){
                sl=arr[i];
            }

        }
        if(sl==Integer.MAX_VALUE){
            System.out.println(-1);
        }
        else{
            System.out.println(sl);
        }
    }
}