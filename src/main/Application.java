package main;

import institution.University;
import data.Data;
import data.HardcodedDataImplementation;
import institution.interlink.Internship;
import person.Student;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        University university = new University("CH.U.I.");

        Data dataAccess = new HardcodedDataImplementation();
        List<Student> students = dataAccess.getStudents();

        if(students.size() == 0){
            dataAccess = new HardcodedDataImplementation();
            students = dataAccess.getStudents();
        }

        for(Student student : students){
            university.addStudent(student);
        }

        Internship internship = new Internship("Interlink");
        System.out.println("List of internship's students:");

        internship.selectStudents(university.getStudents());

        for(Student student : internship.getStudents()){
            System.out.println(student.getName());
        }
    }
}
