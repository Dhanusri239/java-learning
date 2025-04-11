import java.util.*;
public class prog71 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
       System.out.println("Printing Mirror image of array");
       int a=sc.nextInt();
       int b=sc.nextInt();
       int arr[][]=new int[a][b];
       for(int i=0;i<a;i++){
        for(int j=0;j<b;j++){
            arr[i][j]=sc.nextInt();
        }
       }
       System.out.println("Horizontal flip");
       for(int i=0;i<a;i++){
        for(int j=0;j<b/2;j++){
            int temp=arr[i][j];
            arr[i][j]=arr[i][b-j-1];
            arr[i][b-j-1]=temp;
        }
       }
       for(int i=0;i<a;i++){
        for(int j=0;j<b;j++){
            System.out.print(arr[i][j]+ " ");
        }
        System.out.println();
    }
    System.out.println("Vertical flip");
    for(int i=0;i<a/2;i++){
        for(int j=0;j<b;j++){
            int temp=arr[i][j];
            arr[i][j]=arr[a-i-1][j];
            arr[a-i-1][j]=temp;
        }
    }
    for(int i=0;i<a;i++){
        for(int j=0;j<b;j++){
            System.out.print(arr[i][j]+ " ");
        }
        System.out.println();
    }
    System.out.println("Digonal flip");
    for(int i=0;i<a;i++){
        for(int j=i+1;j<b;j++){
            int temp=arr[i][j];
            arr[i][j]=arr[j][i];
            arr[j][i]=temp;
        }
    }
    for(int i=0;i<a;i++){
        for(int j=0;j<b;j++){
            System.out.print(arr[i][j]+ " ");
        }
        System.out.println();
    }
    System.out.println("Anti diagonal flip");
    for(int i=0;i<a;i++){
        for(int j=0;j<b;j++){
            int temp=arr[i][j];
            arr[i][j]=arr[a-j-1][b-i-1];
            arr[a-j-1][b-i-1]=temp;
        }
    }
    for(int i=0;i<a;i++){
        for(int j=0;j<b;j++){
            System.out.print(arr[i][j]+ " ");
        }
        System.out.println();
    }
    }
    
}
