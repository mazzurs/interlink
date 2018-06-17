package person;

import person.consciousness.Knowledge;

public class Student {
    private Knowledge knowledge;
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, Knowledge knowledge) {
        this.name = name;
        this.knowledge = knowledge;
    }

    public void setKnowledge(Knowledge knowledge) {
        this.knowledge = knowledge;
    }

    public Knowledge getKnowledge() {
        return knowledge;
    }

    public String getName() {
        return name;
    }
}