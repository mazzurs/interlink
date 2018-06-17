package institution.interlink;

import person.Student;

import java.util.ArrayList;
import java.util.List;

public class Internship {
    private String name;
    private List<Student> students = new ArrayList<>();

    public Internship(String name) {
        this.name = name;
    }

    public void selectStudents(List<Student> students) {
        for(Student student : students){
            if((student.getKnowledge().getLanguageLevel() + student.getKnowledge().getProgrammingLevel()) / 2 > 3){
                this.students.add(student);
            }
        }
    }

    public List<Student> getStudents() {
        return students;
    }
}
