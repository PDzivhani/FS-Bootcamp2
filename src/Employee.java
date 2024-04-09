public class Employee {

    //declare variables
    private String name;
    String surname;
    int empNum;
    double salary;


    //constructor with parameters, initializes class
    //overloaded constructor
    //used when you want to display known input user information
    // you are giving the info
    Employee(int empNumber, String firstName, String lastName, double salary){
        //initialize declared variable as the new variable from the parameters
        this.name = firstName;
        this.surname = lastName;
        this.empNum = empNumber;
        this.salary = salary;
    }

    //empty constructor
     Employee() {

    }

    // getters and setters
    public void setEmpNum(int empNum) {
        this.empNum = empNum;
    }
    public int getEmpNum() {
        return empNum;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getSurname(){
        return surname;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }

}
