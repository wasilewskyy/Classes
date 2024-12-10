package zadaniaOOP2;

class Ebook extends Publication implements LibraryResource, Electronic {
    private int copyCount;

    public Ebook(String title, String author, int copyCount) {
        super(title, author);
        this.copyCount = copyCount;
    }

    @Override
    public void borrow() {
        if (copyCount > 0) {
            copyCount--;
            System.out.println("The ebook has been borrowed electronically.");
        } else {
            System.out.println("No copies available.");
        }
    }

    @Override
    public void returnResource() {
        copyCount++;
        System.out.println("The ebook has been returned.");
    }

    @Override
    public void download() {
        System.out.println("The ebook has been downloaded.");
    }

    @Override
    public String description() {
        return super.description() + ", Copy count: " + copyCount;
    }
}
