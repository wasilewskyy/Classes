package zadaniaOOP2;

class Magazine extends Publication implements LibraryResource {
    private int issueNumber;

    public Magazine(String title, String author, int issueNumber) {
        super(title, author);
        this.issueNumber = issueNumber > 0 ? issueNumber : 1;
    }

    @Override
    public void borrow() {
        System.out.println("The magazine has been borrowed.");
    }

    @Override
    public void returnResource() {
        System.out.println("The magazine has been returned.");
    }

    @Override
    public String description() {
        return super.description() + ", Issue number: " + issueNumber;
    }
}