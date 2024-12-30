package zadaniaKolekcje;

import java.util.LinkedList;
import java.util.Queue;

//Utwórz Queue<String> (np. LinkedList jako implementację),
// dodaj kilka elementów i symuluj działanie kolejki: pobierz (poll) element z kolejki i wyświetl go,
// a następnie pokaż stan kolejki po usunięciu elementu.

public class Zadanie5 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("First");
        queue.add("Second");
        queue.add("Third");
        System.out.println("Polled element: " + queue.poll());
        System.out.println("Queue after poll: " + queue);
    }
}
