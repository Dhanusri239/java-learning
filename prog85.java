import java.util.*;
public class prog85 {
    public static void minc(int arr[][]){
        int r=arr.length;
        int c=arr[0].length;
        int mi=0;
        for(int j=0;j<c;j++){
           int m=arr[0][j]; 
           for(int i=0;i<r;i++){
            if(arr[i][j]<m){
                m=arr[i][j];
                mi=i;
            }
           }
           System.out.println("The minimum element in a row "+m+" with row index "+mi+" and column index "+(j+1));
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
    minc(arr);

  }
}
