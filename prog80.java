import java.util.*;
public class prog80 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        //int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        /*for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        //System.out.print(sum);*/
       /* int l=arr[0];
        for(int val:arr){
            if(val>l){
                l=val;
            }
        }
        System.out.print(l);*/
        /*int s=arr[0];
        for(int val:arr){
            if(val<s){
                s=val;
            }
        }
        System.out.print(s);*/
        /*int n1=arr.length;
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        for(int val:arr){
            System.out.print(val+" ");
        }*/
        /*System.out.println("Enter the key");
        int key=sc.nextInt();
        boolean f=false;
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                System.out.print("found");
                f=true;
                break;
            }
        }
        if(!f){
            System.out.print(" not found");

        }*/
        System.out.println("Enter the key");
        int key=sc.nextInt();
        boolean f=false;
        int l=0;
        int h=n-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid]==key){
                System.out.print("found");
                f=true;
                break;
            }
            else if(arr[mid]<key){
                h=mid-1;
            }
            else if(arr[mid]>key){
                l=mid+1;
            }
        }
        if(!f){
            System.out.print("Not found");
        }

        }
    }

