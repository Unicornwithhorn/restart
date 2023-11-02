package FileWork;

import Note.Note;
import java.io.FileWriter;
import java.io.IOException;

public class FileWork {
    public static void writeNote(Note note) {
        try {
            FileWriter fileWriter = new FileWriter(note.getLastName() + ".txt", true);
            fileWriter.write(note.toString());
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
