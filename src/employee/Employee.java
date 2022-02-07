package employee;
//  id, name, department, age, gender
public class Employee {
    int id;
    String name;
    String department;
    int age;
    String gender;

    Employee(){

    }
    Employee(int id, String name, String department, int age, String gender){
        this.id = id;
        this.name = name;
        this.department = department;
        this.age = age;
        this.gender = gender;
    }

    public void EmployeeInfo() {
        System.out.println(id + " " + name + " " + department + " " + age + " " + gender);
    }
}
