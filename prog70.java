import java.util.*;
public class prog70 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int arr[][]=new int[a][b];
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int temp[]=new int[b];
        for(int i=0;i<a;i++){
            temp[i]=arr[i][b-1];
        }
        for(int i=0;i<a;i++){
            for(int j=b-1;j>0;j--){
             arr[i][j]=arr[i][j-1];
            }
        }
        for(int i=0;i<a;i++){
            arr[i][0]=temp[i];
        }
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

    }
    
}
