package zadaniaKolekcje;

import java.util.ArrayDeque;
import java.util.Deque;

//Utwórz Stack<Integer> przy użyciu Deque<Integer> (np. ArrayDeque).
// Dodaj kilka liczb, a następnie zdejmij (pop) kilka z nich, wyświetlając za każdym razem element usuwany ze stosu i aktualny stan stosu

public class Zadanie6 {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop: " + stack);
    }
}
