import java.util.Scanner;
public class prog56 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int arr[][]=new int[3][3];
        int rows=arr.length;
        int cols=arr[0].length;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=sc.nextInt();
            }
        }
       
        int temp[]=new int[cols];
        for(int j=0;j<cols;j++){
            temp[j]=arr[0][j];
        }
        for(int i=0;i<rows-1;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=arr[i+1][j];
            }
        }
       
            for(int j=0;j<cols;j++){
                arr[rows-1][j]=temp[j];
            }
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }


    }
    
}
