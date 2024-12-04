// STUDENT LIST//
/**class AgeOutOfRangeException extends Exception{
    public AgeOutOfRangeException(String message){
        super(message);
    }
}
class InvalidNameException extends Exception{
    public InvalidNameException(String message){
        super(message);
    }
}
class Student{
    private int rollno;
    private String name;
    private int age;
    private String course;
    public Student(int rollno,String name,int age,String course) throws AgeOutOfRangeException{
        this.name=name;
        if(!isValidAge(age)){
            throw new AgeOutOfRangeException("Age is out of range");
        }
        this.age=age;
        this.course=course;
    }
    private boolean isValidAge(int age) {
        return age>=15 && age<=21;
    }
    private boolean isValidName(String name){
        return name.matches("[a-zA-Z]+");
    }
    public void displayDetails(){
        System.out.println("Roll No:"+rollno);
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Course:"+course);
    }
    }
public class Task2{
    /**
     * @param args
     * @throws AgeOutOfRangeException
     * @throws InvalidNameException
     */
    /**public static void main(String[]args) throws AgeOutOfRangeException, InvalidNameException{
        try{
            Student student1=new Student(1,"John Doe",18,"B.Tech");
            student1.displayDetails();
            Student student2=new Student(2,"Jane123",20,"M.Tech");
            student2.displayDetails();
            Student student3=new Student(3,"Hari",25,"B.sc");
            student3.displayDetails();
        }catch(AgeOutOfRangeException e){
            System.out.println(e.getMessage());}   
        
    }

}**/

//VoterID//
/**class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}
class Voter{
    private int VoterID;
    private String name;
    private int age;
    public Voter(int voterID,String name,int age)throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Invalid age for voter Id");
        }
        this.name=name;
        this.age=age;
    }
    public int getVoterID(){return VoterID;}
    public String getname(){return name;}
    public int getage(){return age;}
}
public  class Task2{
    public static void main(String[] args) {
        try{
            Voter voter1=new Voter(1,"John",25);
            System.out.println("Name:"+voter1.getname());
            System.out.println("Age:"+voter1.getage());
            Voter voter2=new Voter(2,"Rose",18);
            System.out.println("Name:"+voter2.getname());
            System.out.println("Age:"+voter2.getage());
        }catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
        
    }
}**/
//Weekdays//
/**import java.util.Scanner;
public class Task2{
    public static void main(String[]args){
        String[]weekdays={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Sturday"};
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a day index(0-6):");
        int dayIndex=scanner.nextInt();
        try{
            System.out.println("Day name:"+weekdays[dayIndex]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error:Day index is out of range.Please enter a value between 0 and 6");
        }
    }
}**/
//Hashmap//
/**import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Task2{
private Map<String,Integer>studentGrade;
public void StudentGradeBook(){
    this.studentGrade=new HashMap<>();
}
public void addStudent(String name,int grade){
    studentGrade.put(name,grade);
    System.out.println("Added Successfully");
}
public void removeStudent(String name){
    if(studentGrade.containsKey(name)){
        studentGrade.remove(name);
        System.out.println("Removed successfully");
    }else{
        System.out.println("Not found");
    }
}
public void displayGrade(String name){
    if(studentGrade.containsKey(name)){
        System.out.println("Grade of"+name+":"+studentGrade.get(name));
    }else{
        System.out.println("Not found");
    }
}
/**
 * @param args
 * @param studentGradeBook TODO
 */
/**public static void main(String[]args, StudentGradeBook studentGradeBook){
     StudentGradeBook gradebook=studentGradeBook;
    Scanner scanner= new Scanner(System.in);
    while(true){
        System.out.println("1. Add a new student");
        System.out.println("2.Remove a student");
        System.out.println("3.Display a sudents grade");
        System.out.println("4.Exit");
        System.out.println("Enter your choice:");
        int choice=scanner.nextInt();
        scanner.nextLine();
        switch(choice){
            case 1:
            System.out.println("Enter student name:");
            int grade=scanner.nextInt();
            gradebook name=scanner.nextLine();
            gradebook.addStudent(name,grade);
            break;
            case 2:
            System.out.println("Enter student name:");
            name=scanner.nextLine();gradebook.removeStudent(name);
            break;
            case 3:
            System.out.println("Enter a student name:");
            name=scanner.nextLine();
            gradebook displayGrade(name);
            break;
            case 4:
            System.out.println("Exist");
            return;
            default:
            System.out.println("Invalid");
        }
        
    }

}**/
//Collection classes
/**import java.util.Stack;
public class Task4{
    private Stack<Integer>stack;
public Task4(){this.stack=new Stack<>();}
public void push(int element){
    stack.push(element);
}
public int pop(){
    if(! isEmpty()){
         return stack.pop();
    }else{throw new RuntimeException("Stack is empty");}
}
public boolean isEmpty()
{return stack.isEmpty();
}
public int size(){
    return stack.size();
}
public void printstack(){
    System.out.println("Stack:"+stack);
}
public static void main(String[]args){
    Task4 integerTask4=new Task4();
    integerTask4.push(10);
    integerTask4.push(20);
    integerTask4.push(30);
    integerTask4.printstack();
    System.out.println("Is stack emptty?"+integerTask4.isEmpty());
    System.out.println("Popped element:"+integerTask4.pop());
    integerTask4.printstack();
    System.out.println("Stack size:"+integerTask4.size());
}
}**/
