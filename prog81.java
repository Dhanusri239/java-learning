import java.util.*;
public class prog81 {
    public static void columnsort(int arr[][]){
        int r=arr.length;
        int c=arr[0].length;
        System.out.println("Acending order");
        for(int j=0;j<c;j++){
            for(int i=0;i<r-1;i++){
                for(int k=0;k<r-i-1;k++){
                    if(arr[k][j]>arr[k+1][j]){
                        int temp=arr[k][j];
                        arr[k][j]=arr[k+1][j];
                        arr[k+1][j]=temp;
                    }
                }
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
        public static void Ds(int arr[][])
        {
         int r=arr.length;
         int c=arr[0].length;
         System.out.println("Decending order");
        for(int j=0;j<c;j++){
            for(int i=0;i<r-1;i++){
                for(int k=0;k<r-i-1;k++){
                    if(arr[k][j]<arr[k+1][j]){
                        int temp=arr[k][j];
                        arr[k][j]=arr[k+1][j];
                        arr[k+1][j]=temp;
                    }
                }
            }
        }
    
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();


    }
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
        columnsort(arr);
        Ds(arr);
    }
    
}

