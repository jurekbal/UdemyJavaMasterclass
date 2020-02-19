package sekcja6;

public class Person {
    // cw 30
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100){
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public boolean isTeen(){
        return (age > 12 && age < 20);
    }

    public String getFullName(){
        if (firstName.isEmpty()) {
            if (lastName.isEmpty()){
                return "";
            } else {
                return lastName;
            }
        }
        if (lastName.isEmpty()){
            return firstName;
        }
        return firstName + " " + lastName;
    }
}
