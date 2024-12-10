package zadaniaOOP2;

class Book extends Publication implements LibraryResource {
    private int pageCount;

    public Book(String title, String author, int pageCount) {
        super(title, author);
        this.pageCount = pageCount > 0 ? pageCount : 100;
    }

    @Override
    public void borrow() {
        System.out.println("The book has been borrowed.");
    }

    @Override
    public void returnResource() {
        System.out.println("The book has been returned.");
    }

    @Override
    public void reserve() {
        System.out.println("The book has been reserved.");
    }

    @Override
    public String description() {
        return super.description() + ", Page count: " + pageCount;
    }
}
