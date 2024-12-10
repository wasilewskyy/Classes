package zadaniaOOP2;

class Person {
    private final String firstName;
    private final String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void introduceYourself() {
        System.out.println("I am " + firstName + " " + lastName);
    }
}