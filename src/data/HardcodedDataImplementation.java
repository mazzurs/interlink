package data;

import person.Student;
import person.StudentFactory;

import java.util.ArrayList;
import java.util.List;

public class HardcodedDataImplementation implements Data {
    @Override
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();

        StudentFactory studentFactory = new StudentFactory();

        students.add(studentFactory.createStudent("Serhii Mazur", 4, 3));
        students.add(studentFactory.createStudent("Anton Smaglii", 5, 4));
        students.add(studentFactory.createStudent("Vadim Sokolov", 5, 5));
        students.add(studentFactory.createStudent("Vitaliy Yarovii", 2, 4));
        students.add(studentFactory.createStudent("Ruslan Bilmakovsky", 3, 2));

        return students;
    }
}
