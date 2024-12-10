package zadaniaOOP2;

class Librarian extends User {
    public Librarian(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public void showPrivileges() {
        System.out.println("The librarian has full access to manage resources.");
    }
}