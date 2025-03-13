import java.io.*;
class prog10{
    public static void main(String[]args)throws IOException{
        BufferedReader buff=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the value:");
        int n=Integer.parseInt(buff.readLine().trim());
        for(int i=1;i<=10;i=i+1){
            System.out.println(n+ "x"+ i + "=" +(n*i));
        }
        buff.close();
    }
}