import Note.Note;
import UIConsole.UIConsole;

import java.util.*;

//Напишите приложение, которое будет запрашивать у пользователя следующие данные в произвольном порядке, разделенные пробелом:
//        Фамилия Имя Отчество датарождения номертелефона пол
//
//        Форматы данных:
//        фамилия, имя, отчество - строки
//        датарождения - строка формата dd.mm.yyyy
//        номертелефона - целое беззнаковое число без форматирования
//        пол - символ латиницей f или m.
public class Main {
    public static void main(String[] args) {

                UIConsole uiConsole = new UIConsole();
        Note note = new Note();
        StringBuilder stringBuilder =new StringBuilder();
        stringBuilder.append(note.getLastName());
        stringBuilder.append("dd");
        System.out.println(stringBuilder.toString());



//                uiConsole.inputGender("dd");
//        uiConsole.input();
//        Calendar calendar = new GregorianCalendar(2017, 0 , 25);
////        Date date = calendar.getTime();
////        System.out.println(date);
//        System.out.println("Год: " + calendar.get(Calendar.YEAR));
//        System.out.println("Месяц: " + calendar.get(Calendar.MONTH));
//        System.out.println("Год: " + calendar.get(Calendar.YEAR));
//        System.out.println("Месяц: " + calendar.get(Calendar.MONTH));

    }
}
//        System.out.println(Operation.SUM.action(1,1));
//        Operation op = Operation.SUM;
//        System.out.println(op.action(10, 4));   // 14
//        op = Operation.MULTIPLY;
//        System.out.println(op.action(6, 4));    // 24
//    }
//}
//enum Operation{
//    SUM{
//        public int action(int x, int y){ return x + y;}
//    },
//    SUBTRACT{
//        public int action(int x, int y){ return x - y;}
//    },
//    MULTIPLY{
//        public int action(int x, int y){ return x * y;}
//    };
//    public abstract int action(int x, int y);
//}
