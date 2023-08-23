package Lab24;

public class User {
    public int id;
    public String firstName;
    public String lastName;
    public int age;
    public String country;

    public User(int id, String firstName, String lastName, int age, String country) {
        this.id = id;
        this.age = age;
        this.country = new String();
        this.country = country;
        this.firstName = new String();
        this.firstName = firstName;
        this.lastName = new String();
        this.lastName = lastName;
    }

    public int get_id() {
        return this.id;
    }

    public String get_firstName() {
        return this.firstName;
    }

    public String get_lastName() {
        return this.lastName;
    }

    public int get_age() {
        return this.age;
    }

    public String get_country(){
        return this.country;
    }

}
