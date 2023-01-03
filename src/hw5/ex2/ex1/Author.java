package hw5.ex2.ex1;

public class Author {

    private String email;
    private String name;
    private char gender;

    public Author() {

    }

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        if (gender == 'm' || gender == 'f') {
            this.gender = gender;
        }

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String toString() {
        return "Author[name= " + name + ",email= " + email + ",gender= " + gender + "]";
    }

}
