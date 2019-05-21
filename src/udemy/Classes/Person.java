package udemy.Classes;

public class Person {

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("");   // firstName is set to empty string
        person.setLastName("");    // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");    // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");    // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());
    }
    private String firstName;
    private String lastName;
    private int age;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if(age<0 || age>100){
            this.age = 0;
        }else {
            this.age = age;
        }
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public boolean isTeen(){
        int age = getAge();
        if(age>12 && age<20){
            return true;
        }else{
            return false;
        }
    }

    public String getFullName() {
        if (getFirstName().isEmpty()) {
            return getLastName();
        } else if (getLastName().isEmpty()) {
            return getFirstName();
        } else {
            return getFirstName() + " " + getLastName();
        }
    }
}