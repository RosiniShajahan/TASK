//UPPERCASE//
/**import java.util.stream.Stream;
public class remma{
    public static void main(String[]args){
        Stream<String>names=Stream.of("aBc","d","ef");
        names.map(String::toUpperCase).forEach(System.out::println);
    }
}**/
//PRINT THE UNEMPTY STRING
/**import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class reema{
    public static void main(String[]args){
        List<String>strings=Arrays.asList("abcd","","bc","efg","abcd","","jkl");
        List<String>nonEmptyStrings=strings.stream().filter(s->!s.isEmpty()).collect(Collectors.toList());
        System.out.println("Original List:"+strings);
        System.out.println("List of Non-Empty Strings:"+nonEmptyStrings);
    }
}**/
//GIFTS//
/**import java.util.ArrayList;
import  java.util.List;
import java.util.stream.Collectors;
public class remma{
    public static void main(String[]args){
        List<String>students=new ArrayList<>();
        students.add("Amit");
        students.add("Rahul");
        students.add("Hari");
        students.add("Varun");
        students.add("Aranav");
        students.add("Anand");
        students.add("Arjun");
        students.add("Nancy");
        students.add("Rosini");
        students.add("Priyanka"); 
    List<String>studentsWithAGift=students.stream().filter(name->name.startsWith("A")).collect(Collectors.toList());
System.out.println("Students who will receive a special gift:");
System.out.println(studentsWithAGift);   }
}**/
//APP//
/**import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class remma{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your date of birth:");
        String dobInput=scanner.nextLine();
        LocalDate dob=LocalDate.parse(dobInput);
        LocalDate today=LocalDate.now();
        Period age=Period.between(dob,today);
        System.out.println("Your age is:"+age.getYears()+"years"+age.getMonths()+"months,and"+age.getDays()+"days");
    }
}**/


