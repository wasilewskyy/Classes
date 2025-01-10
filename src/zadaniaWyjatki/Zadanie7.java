package zadaniaWyjatki;

//Zdefiniuj własny wyjątek InvalidIndexException, który dziedziczy po Exception.
// Napisz metodę getElement(int[] array, int index), która zwraca element tablicy o podanym indeksie.
// Jeśli indeks jest poza zakresem tablicy, metoda powinna rzucić InvalidIndexException z odpowiednim komunikatem.
// W metodzie main wywołaj tę metodę i obsłuż wyjątek.


public class Zadanie7 {
    public static int getElement(int[] array, int index) throws InvalidIndexException {
        if (index < 0 || index >= array.length) {
            throw new InvalidIndexException("Invalid index: " + index);
        }
        return array[index];
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        try {
            System.out.println(getElement(array, 10));
        } catch (InvalidIndexException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
