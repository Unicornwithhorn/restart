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

    public Note(){

    }
    public String getLastName(){
        return this.lastName;
    }

    @Override
    public String toString() {
        return lastName + " " + name + " " + patronymic + " " + birthdate + " " + phoneNumber + " " + gender + "\n";
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.birthdate = birthdate;
    }

}
