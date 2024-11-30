package zadaniaMetody;

//Napisz metodę userInfo(String name, int age, char gender), która przyjmuje imię, wiek i płeć użytkownika,
// a następnie wyświetla komunikat w formacie: "Imię: [name], Wiek: [age], Płeć: [gender]".

public class Zadanie11 {
    public static void userInfo(String name, int age, char gender) {
        System.out.println("Imię: " + name + ", Wiek: " + age + ", Płeć: " + gender);
    }

    public static void main(String[] args) {
        userInfo("Jakub", 21, 'M');
    }
}