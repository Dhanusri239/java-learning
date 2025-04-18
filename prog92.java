import java.util.*;
public class prog92 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Printing element at even index");
        for(int i=0;i<n;i++){
            if(i%2==0){
                System.out.println(arr[i]);
            }
        }
        System.out.println("Printing even number followed by odd number"); 
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                System.out.print(arr[i]);
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]%2!=0){
                System.out.print(arr[i]);
            }
        }
        System.out.println();
        System.out.println("Using some more condition");
        for(int i=0;i<n;i++){
            if(arr[i]%5==0){
                System.out.println(arr[i]);
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]%10==7){
                System.out.println(arr[i]);
            }
        }
        System.out.println("Finding square and power of each element of array");
        for(int i=0;i<n;i++){
          
                System.out.println(Math.sqrt(arr[i]));
        }
        for(int i=0;i<n;i++){
          
            System.out.println(Math.pow(arr[i],4));
    }
    int b=sc.nextInt();
    char a[]=new char[b];
    for(int i=0;i<b;i++){
        a[i]=sc.next().charAt(i);
    }
    for(int i=0;i<b;i++){
       System.out.println(a[i]+" "+(int)a[i]);
    }

    }
}
