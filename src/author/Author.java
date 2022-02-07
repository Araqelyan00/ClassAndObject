package author;

public class Author {
    String name;
    String email;
    String gender;

    Author(){

    }
    Author(String name, String email, String gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public void authorInfo(){
        System.out.println(name + " " + email + " " + gender);
    }
}
