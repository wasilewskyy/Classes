package zadaniaOOP2;

class Publication {
    private final String title;
    private final String author;

    public Publication(String title, String author) {
        this.title = (title != null && title.length() > 0) ? title : "Brak danych o publikacji.";
        this.author = (author != null && author.length() > 0) ? author : "Brak danych o publikacji.";
    }

    public final void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author);
    }

    public String description() {
        return "Title: " + title + ", Author: " + author;
    }

    @Override
    public String toString() {
        return description();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Publication)) return false;
        Publication other = (Publication) obj;
        return this.title.equals(other.title) && this.author.equals(other.author);
    }

    @Override
    public int hashCode() {
        return title.hashCode() + author.hashCode();
    }
}