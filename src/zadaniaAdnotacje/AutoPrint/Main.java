package zadaniaAdnotacje.AutoPrint;

public class Main {
    public static void main(String[] args) {
        UserProfileImpl realUserProfile = new UserProfileImpl();

        UserProfile proxy = AutoPrintProxyFactory.createProxy(UserProfile.class, realUserProfile);

        proxy.setUsername("Alice");
        proxy.getUsername();
        proxy.setEmail("alice@example.com");
        proxy.getEmail();
        proxy.setAge(25);
        proxy.getAge();
    }
}
