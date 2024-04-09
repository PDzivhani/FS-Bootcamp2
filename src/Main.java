import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        //Using overloaded constructor
//        Employee employee1 = new Employee(2, "Stacy", "Testy", 230000);
//        System.out.println("########Employee details########");
//        // use getter when variables are private
//        System.out.println("Employee number: " + employee.empNum + "\n" + "First Name: " + employee.getName() + "\n" + "Last Name: " + employee.surname + "\n"
//        + "Salary: R" + employee.salary);

        // Using default constructor
        // user input required
        Scanner myObj = new Scanner(System.in); // Scanner object
        Employee employee = new Employee();

        System.out.println("Enter your employee number: ");
        int empNum = myObj.nextInt();// reads user input
        System.out.println("Enter your first name: ");
        String name = myObj.next();
        System.out.println("Enter your last name: ");
        String surname = myObj.next();
        System.out.println("Enter your salary: ");
        double salary = myObj.nextDouble();

        System.out.println("########Employee details########");
        //display user input
        System.out.println("Welcome to FS Congo" + "\n" + "Your Employee number is " + empNum +
                ", your full name is " + name + " " + surname + " and you earn R" + salary + " annually.");




        // Array List
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(13);
        myList.add(35);
        myList.add(45);

        myList.remove(0);
        System.out.println(myList);
    }
}