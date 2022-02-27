public class Person implements Comparable<Person> {
    String firstName;
    String lastName;

    Person (String fName, String lName) {
        this.firstName = fName;
        this.lastName = lName;
    }
    
    @Override
    public int compareTo(Person person) {
        return this.lastName.compareTo(person.lastName);
    }
    
    public String toString() {
        return this.firstName+" "+this.lastName;
    }

}