import java.util.*;
public class prog79 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int arr[][]=new int[a][b];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<a;i++){
            for(int j=0;j<b-1;j++){
                for(int k=0;k<b-j-1;k++){
                    if(arr[i][k]>arr[i][k+1]){
                        int temp=arr[i][k];
                        arr[i][k]=arr[i][k+1];
                        arr[i][k+1]=temp;
                    }
                }
            }
        
            for(int j=0;j<b;j++){
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();
        }
    }
}
    

