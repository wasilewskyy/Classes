package zadaniaOOP2;

class Ebook extends Publication implements LibraryResource, Electronic {
    private int copyCount;
    private boolean isUserLoggedIn;
    private boolean hasDownloadPermission;

    public Ebook(String title, String author, int copyCount, boolean isUserLoggedIn, boolean hasDownloadPermission) {
        super(title, author);
        this.copyCount = copyCount;
        this.isUserLoggedIn = isUserLoggedIn;
        this.hasDownloadPermission = hasDownloadPermission;
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
        if (!isUserLoggedIn) {
            System.out.println("You must be logged in to download the ebook.");
        } else if (!hasDownloadPermission) {
            System.out.println("You do not have permission to download this ebook.");
        } else if (copyCount <= 0) {
            System.out.println("No copies available for download.");
        } else {
            System.out.println("The ebook has been downloaded.");
        }
    }

    @Override
    public String description() {
        return super.description() + ", Copy count: " + copyCount;
    }
}
