package zadaniaOOP2;

interface Storable {
    void save();
    void load();
    default void archive() {
        System.out.println("Publikacja została zarchiwizowana.");
    }
}