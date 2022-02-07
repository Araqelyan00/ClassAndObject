package person;

public class PersonInfo {
    public static void main(String[] args) {
        Person person1 = new Person("Aram", 21, "Yerevan");
        Person person2 = new Person("Jon", 23, "London");
        person1.personInfo();
        person2.personInfo();

    }
}
