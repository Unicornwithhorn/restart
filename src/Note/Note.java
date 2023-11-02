package Note;

import java.util.Date;

public class Note {
    String name;
    String lastName;
    String patronymic;
    String birthdate;
    String phoneNumber;
    String gender;
    public Note(String name, String lastName, String patronymic, String birthdate, String phoneNumber, String gender) {
        this.name = name;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.birthdate = birthdate;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }
    public String getLastName(){
        return this.lastName;
    }

    @Override
    public String toString() {
        return lastName + " " + name + " " + patronymic + " " + birthdate + " " + phoneNumber + " " + gender + "\n";
    }
}
