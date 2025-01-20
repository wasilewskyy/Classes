package zadaniaAdnotacje.AutoPrint;

import zadaniaAdnotacje.AutoPrint.UserProfile;

class UserProfileImpl implements zadaniaAdnotacje.AutoPrint.UserProfile {
    private String username;

    private String email;

    private int age;

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }
}
