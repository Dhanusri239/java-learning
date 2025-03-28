import java.util.ArrayList;
import java.util.Scanner;
class prog42
{
    public static void main(String[]args){
        ArrayList<String>tasks=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("-------To Do List-------");
            System.out.println("choose the option");
            System.out.println("1.Add task..");
            System.out.println("2.Remove task..");
            System.out.println("3.View task..");
            System.out.println("4.Exit..");
            int choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.println("Enter tasks to add");
                    String task=sc.nextLine();
                    tasks.add(task);
                    System.out.println("Task added successfully" + tasks);
                    break;
                case 2:
                    if(tasks.isEmpty()){
                        System.out.println("There is no task to remove because it's empty task");
                    }    
                    else{
                        for(int i=0;i<tasks.size();i++){
                            System.out.println((i+1)+" "+tasks.get(i));
                        }
                            int removeindex=sc.nextInt();
                            if(removeindex >=1 && removeindex<= tasks.size()){
                                tasks.remove(removeindex);
                                System.out.println("Tasks removed successfully ");

                            }
                            else{
                                System.out.println("Invalid task number");

                            }

                        }
                        break;
                       
                case 3:
                    if(tasks.isEmpty()){
                    System.out.println("The tasks is empty");
                    }
                    else{
                        System.out.println("your tasks");
                        for(int i=0;i<tasks.size();i++){
                            System.out.println((i+1)+" "+tasks.get(i));

                        }
                    }
                    break;
                    case 4:
                        System.out.println("Goodbyee have a nice and productive moments");
                    default:
                        System.out.println("Invalid task choice");  
                   
                    }



            }
        }
    }


