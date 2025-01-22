package zadaniaKlasy;

public enum Operacja {
    DODAJ {
        @Override
        public double wykonaj(double a, double b) {
            return a + b;
        }
    },
    ODEJMIJ {
        @Override
        public double wykonaj(double a, double b) {
            return a - b;
        }
    },
    POMNÓŻ {
        @Override
        public double wykonaj(double a, double b) {
            return a * b;
        }
    },
    PODZIEL {
        @Override
        public double wykonaj(double a, double b) {
            return a / b;
        }
    };

    public abstract double wykonaj(double a, double b);
}

