package zadaniaOOP2;


public class Main {
    public static void main(String[] args) {
        // Zadanie 4:
        Publication[] publications = new Publication[]{
                new Book("Pan Tadeusz", "Adam Mickiewicz", 300),
                new Magazine("Vogue", "Anna Wintour", 5),
                new Audiobook("Slepnac od swiatel", "Jakub Żulczyk")
        };

        System.out.println("Displaying information about publications:");
        for (Publication pub : publications) {
            pub.displayInfo();
            if (pub instanceof Book) {
                System.out.println("This is a book.");
            } else if (pub instanceof Magazine) {
                System.out.println("This is a magazine.");
            } else if (pub instanceof Ebook) {
                System.out.println("This is an ebook.");
            } else if (pub instanceof Audiobook) {
                System.out.println("This is an audiobook.");
            }
            System.out.println();
        }

        // Zadanie 5:
        Book sampleBook = new Book("Sample Book", "Author Example", 150);
        System.out.println("Using toString method: " + sampleBook);

        // Zadanie 6:
        Book shortTitleBook = new Book("Ab", "Short Title Author", 200);
        System.out.println("Book with short title validation: " + shortTitleBook);

        // Zadanie 7:
        System.out.println("\nDescriptions of publications:");
        for (Publication pub : publications) {
            System.out.println(pub.description());
        }

        // Zadanie 8:
        // sampleBook.title = "Nowy Tytuł"; // Nie można, ponieważ title jest finalne

        // Zadanie 9:
        // class Test extends Publication {} // Nie można dziedziczyć po klasie finalnej Publication

        // Zadanie 10:
        // class ExtendedBook extends Book {
        //     @Override
        //     public String description() { return "Nadpisana"; } // Nie można nadpisać metody finalnej

        // Zadanie 11–12:
        User[] users = new User[]{
                new Librarian("John", "Smith"),
                new Reader("Anna", "Taylor")
        };
        for (User user : users) {
            user.introduceYourself();
            user.showPrivileges();
            if (user instanceof Librarian) {
                System.out.println("Special message: Librarians manage the library.");
            }
        }

        // Zadanie 13–14:
        LibraryResource book = new Book("Thinking in Java", "Bruce Eckel", 250);
        book.borrow();
        book.returnResource();
        book.reserve();

        // Zadanie 15–16:
        Ebook ebook = new Ebook("Java Programming", "James Gosling", 3, true, true);
        ebook.download();

        Ebook ebookWithoutPermission = new Ebook("Advanced Java", "Jane Smith", 3, true, false);
        ebookWithoutPermission.download();

        Ebook ebookNotLoggedIn = new Ebook("C++ Basics", "James Brown", 2, false, true);
        ebookNotLoggedIn.download();

        Ebook ebookNoCopies = new Ebook("Python for Beginners", "Emily White", 0, true, true);
        ebookNoCopies.download();

        // Zadanie 17:
        System.out.println("\nAbstract class vs Interface:");
        Electronic[] electronics = new Electronic[]{ebook};
        for (Electronic electronic : electronics) {
            electronic.download();
        }

        LibraryResource[] resources = new LibraryResource[]{ebook, sampleBook};
        for (LibraryResource resource : resources) {
            resource.borrow();
        }

        // Zadanie 18:
        Reader reader = new Reader("John", "Nowak");
        reader.introduceYourself();

        // Zadanie 19:
        Publication book1 = new Book("Book Title", "Author", 100);
        Publication book2 = new Book("Book Title", "Author", 100);
        System.out.println("Books are equal: " + book1.equals(book2));
        System.out.println("Hash codes: " + book1.hashCode() + " & " + book2.hashCode());

        // Zadanie 20:
        System.out.println("\nFiltered publications:");
        PublicationFilter filter = (Publication p) -> p.description().contains("Adam Mickiewicz");
        for (Publication pub : publications) {
            if (filter.filter(pub)) {
                System.out.println(pub.description());
            }
        }

        // Task 21–22: Storable functionality
        sampleBook.reserve();
        sampleBook.returnResource();

        // Zadanie 23:
        Audiobook audiobook = new Audiobook("Learning Java", "Author");
        audiobook.play();

        // Zadanie 24:
        MultifunctionalDevice device = new MultifunctionalDevice();
        device.print();
        device.scan();
    }
}