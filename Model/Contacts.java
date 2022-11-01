package CodeGame.Model;

public class Contacts {
    String name;
    String surname;
    String email;
    String message;

    public static String position;


    public Contacts(String name, String surname, String email, String message) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.message = message;
    }
    public Contacts() {

    }

    public static String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
