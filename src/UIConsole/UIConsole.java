package UIConsole;

import java.time.Year;
import java.util.Arrays;
import java.util.Scanner;
import Note.Note;
import FileWork.FileWork;

public class UIConsole {
    public UIConsole() {
    }
    public boolean input(){
        Scanner scanner = new Scanner(System.in);
        String[] text = scanner.nextLine().split(" ");
        try(){
            for (int i = 0; i < 6 ; i++) {
                if (text[0] == )
            }

        }
        String name = inputString("Введите имя", 1, 30, scanner);
        String patronymic = inputString("Введите отчество", 1, 30, scanner);
        String surname = inputString("Введите фамилию", 1, 40, scanner);
        String date = inputDate("Введите дату в формате dd.mm.yyyy", scanner);
        String phone = inputPhone("Введите телефон", scanner);
        String gender = inputGender("Укажите ваш пол (м/ж)",scanner);
        Note note = new Note(name,surname,patronymic,date,phone,gender);
        FileWork.writeNote(note);
    }

    private String inputGender(String string, Scanner scanner) {
        String[] okAnswersMale = {"m", "мужской", "м", "муж", "муж.", "male", "m.", "м."};
        String[] okAnswersFemale = {"f", "женский", "ж", "жен", "жен.", "female", "f.", "ж."};
        while (true) {
            System.out.println(string);
            String gender = scanner.nextLine().toLowerCase();
            if (Arrays.asList(okAnswersFemale).contains(gender)) {
                return "f";
            } else if (Arrays.asList(okAnswersMale).contains(gender)) {
                return "m";
            } else {
                System.out.println("Введите пол корректно");
            }
        }
    }

    private String inputPhone(String string, Scanner scanner){
        while (true){
            String userString = inputString(string, 9, 14, scanner);
            int i = 0;
            boolean flag = true;
            StringBuilder stringBuilder = new StringBuilder();
            while (flag){
                if (i == userString.length()) {
                    return stringBuilder.toString();
                }
                char element = userString.charAt(i);
                if (Character.isDigit(element)){
                    stringBuilder.append(element);
                } else if(element != ' ' && element != '-' && element != '*' && element != '+' && element != '.'){
                    System.out.println("номер введён некорректно. Повторите ввод.");
                    flag = false;
                }
                i++;
            }
        }
    }



    private String inputDate(String string, Scanner scanner) {
        System.out.println(string);
        int year = checkNumber("Введите год: ", 1920, Year.now().getValue(), scanner);
        int month = checkNumber("Введите месяц: ", 1, 12, scanner);
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int day = checkNumber("Введите день: ", 1, days[month-1], scanner);
        String monthLeftZero;
        String dayLeftZero;
        if (month < 10){
            monthLeftZero = "0";
        } else {
            monthLeftZero = "";
        }
        if (day < 10){
            dayLeftZero = "0";
        } else {
            dayLeftZero = "";
        }
        return (dayLeftZero + day + "." + monthLeftZero + month + "." + year);
        }

    private int checkNumber(String question, int min, int max, Scanner scanner) {
        while (true) {
            System.out.println(question);
            String res = scanner.nextLine();
            try {
                int resint = Integer.parseInt(res);
                if (resint >= min && resint <= max) {
                    return resint;
                } else {
                    System.out.println("Данные введены некорректно. Введите число от " + min + " до " + max);
                }
            } catch (NumberFormatException e){
                System.out.println("Данные введены некорректно. Введите число");
            }

        }
    }

    private String inputString(String string, int minLength, int maxLength, Scanner scanner) {
        while (true){
            System.out.println(string);
            String res = scanner.nextLine();
            if (res.length() >= minLength && res.length() <= maxLength) {
                return res;
            } else{
                System.out.println("Данные введены некорректно. Введите от " + minLength + " до " + maxLength + " символов");
            }

        }
    }
}