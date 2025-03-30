public class prog44{
    void iphone(){
        System.out.println("This is iphone");
        samsung();
        oppo();
        Realme();
    }
     void samsung(){
        System.out.println("This is samsung");
    }
     void oppo(){
        System.out.println("This is oppo");
    }
     void Realme(){
        System.out.println("This is realme");
    }
    int addition(int a,int b)
    {
        return a+b;
    }
    String getname(String name){
        return name;
    }
    void total_money(int a,int b){
        System.out.println(a*b);
    }
    public static void main(String[]args){
        prog44 obj=new prog44();
        obj.iphone();
        prog44 obj1=new prog44();
        int sum=obj1.addition(1,3);
        System.out.println(sum);
        obj.total_money(6,7);
        String name= obj.getname("kaatuvasi");
        System.out.println(name);

    }
}