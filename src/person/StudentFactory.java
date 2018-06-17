package person;

import person.Student;
import person.consciousness.Knowledge;

public class StudentFactory {
    public Student createStudent(String name, int languageLevel, int programmingLevel){
        return new Student(name, new Knowledge(languageLevel, programmingLevel));
    }
}
