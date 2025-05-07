 class prog123 {
   String name;
   prog123(String name){
     this.name=name;
   }
}
class employee extends prog123{
   int emplid=2468283;
   employee(){
    super("Dhanu");
   }
   void display(){
    System.out.println("Name:"+name);
    System.out.println("Employee Id:"+emplid);
   }
}
class prog1{
    public static void main(String[]args){
        employee ob=new employee();
        ob.display();
    }
}
