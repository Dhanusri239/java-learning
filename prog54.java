import java.util.Scanner;
public class prog54 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                //System.out.println("Get an array elements:");
                arr[i][j]=sc.nextInt();
                //System.out.println("Printing array elements");
                System.out.println(arr[i][j]+" ");
            }
            
        }
        System.out.println("Printing 1st and last elements of rows in arrays");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i==0 || i==arr.length-1){
                    System.out.print(arr[i][j]+ " ");
                }
            }
            System.out.println();
        }
        System.out.println("Printing 1st and last elements of coloumns in arrays");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(j==0 || j==arr.length-1){
                    System.out.print(arr[i][j]+ " ");
                }
            }
            System.out.println();
        }
         System.out.println("Printing border in arrays");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i==0 || i==arr.length-1 ||j==0 || j==arr.length-1){
                   
                    System.out.print(arr[i][j]+ " ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        System.out.print("Printing major diagonal elements in the array");
    
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i==j){
                    
                    System.out.print(arr[i][j]+ " ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("Printing minor diagonal elements in array");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i+j==arr.length-1){
                    
                    System.out.print(arr[i][j]+ " ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("Printing lower diagonal elements in array");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i>=j){
                    
                    System.out.print(arr[i][j]+ " ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("Printing upper diagonal elements in array");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(j>=i){
                    
                    System.out.print(arr[i][j]+ " ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("Printing even elements in array");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(arr[i][j]%2==0){
                    
                    System.out.print(arr[i][j]+ " ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
