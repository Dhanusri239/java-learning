public class prog124 {
    String name;
    double salary;
    prog124(String name,double salary){
         this.name=name;
         this.salary=salary;
    }
    void display(){
        System.out.println("Name:"+name);
        System.out.println("Salary:"+salary);
    }
}
class manager extends prog124{
    String department="cse";
    manager(){
        super("dhanu",1234779);
        super.display();
        System.out.println("Department:"+department);
    }
}
class prog2{
    public static void main(String[]args){
        manager ob=new manager();
    }
}
