package person;

public class Person {
    String name;
    int age;
    String address;

    Person() {

    }
    Person(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public void personInfo(){
        System.out.println(name + " " + age + " " + address);
    }
}
