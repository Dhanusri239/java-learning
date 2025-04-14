import java.util.*;
public class prog83 {
    public static void minr(int arr[][]){
        int r=arr.length;
        int c=arr[0].length;
        for(int i=0;i<r;i++){
            int m=arr[i][0];
            for(int j=0;j<c;j++){
                if(m>arr[i][j]){
                    m=arr[i][j];
                }
            }
            System.out.println("The minimum element of array is "+m);
    }
        }
        public static void minri(int arr[][]){
            int r=arr.length;
            int c=arr[0].length;
            int mi=0;
            for(int i=0;i<r;i++){
                int m=arr[i][0];
                for(int j=0;j<c;j++){
                    if(m>arr[i][j]){
                        m=arr[i][j];
                        mi=j;
                    }
                }
                System.out.println("The minimum element of array is "+m+" the row index is "+(i+1)+" and column index is "+mi);
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
        minr(arr);
        minri(arr);

    }
    
}
