package zadaniaOOP2;

class MultifunctionalDevice implements Printable, Scannable {
    @Override
    public void print() {
        System.out.println("Printing...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning...");
    }
}

