package zadaniaOOP2;

class Audiobook extends ElectronicMedia {
    public Audiobook(String title, String author) {
        super(title, author);
    }

    @Override
    public void play() {
        System.out.println("The audiobook is being played on an audio player.");
    }
}
