package zadaniaOOP2;

interface LibraryResource {
    void borrow();
    void returnResource();

    default void reserve() {
        System.out.println("The resource has been reserved.");
    }
}
