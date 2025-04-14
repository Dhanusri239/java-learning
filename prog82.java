import java.util.*;
public class prog82 {
    public static void add(int arr[][]){
        int r=arr.length;
        int c=arr[0].length;
         int sum=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                sum=sum+arr[i][j];
            }
        }
        System.out.println("The sum of array is "+sum);
    
    }
    public static void addc(int arr[][]){
        int r=arr.length;
        int c=arr[0].length;
         int sum=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(r==c || r+c+1==arr.length){
                sum=sum+arr[i][j];
            }
            }
        }
        System.out.println("The sum of array using some condition "+sum);

    }
    public static void addrows(int arr[][]){
        int r=arr.length;
        int c=arr[0].length;
        for(int i=0;i<r;i++){
            int sum=0;
            for(int j=0;j<c;j++){
                sum=sum+arr[i][j];
            }
            System.out.println("The sum of each row of array is "+sum);
        }
    }
    public static void min(int arr[][]){
    int r=arr.length;
    int c=arr[0].length;
    int m=arr[0][0];
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            if(arr[i][j]<m){
                m=arr[i][j];
            }
        }
}
System.out.println("The minimum element of array is "+m);
    }
    public static void max(int arr[][]){
        int r=arr.length;
        int c=arr[0].length;
         int m=arr[0][0];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[i][j]>m){
                    m=arr[i][j];
                }
            }
    }
    System.out.println("The maximum element of array is "+m);
        }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        add(arr);
        addc(arr);
        addrows(arr);
        min(arr);
        max(arr);

        
    }
    
}
