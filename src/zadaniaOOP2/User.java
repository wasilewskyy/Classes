package zadaniaOOP2;

abstract class User extends Person {
    public User(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public abstract void showPrivileges();
}