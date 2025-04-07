import java.util.Scanner;
public class prog55 {
         public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        prog55 obj=new prog55();
        int arr[][]=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Multiplying array values by 10");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=arr[i][j]*10;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        

        System.out.println("Replacing -ve values by 0");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(arr[i][j]<0){
                arr[i][j]=0;
                System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
        System.out.println("Swapping 1st and last elements of rows");
            for(int j=0;j<3;j++){
                int temp=arr[0][j];
                arr[0][j]=arr[2][j];
                arr[2][j]=temp; 
            }
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    System.out.print(arr[i][j]);
                }  
                System.out.println();
            }
           
        



    }
    
}
