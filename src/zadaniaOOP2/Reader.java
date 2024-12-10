package zadaniaOOP2;

class Reader extends User {
    public Reader(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public void showPrivileges() {
        System.out.println("The reader can borrow books.");
    }
}

