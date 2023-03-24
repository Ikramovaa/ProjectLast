package db;

import model.Gender;
import model.Group;
import model.Student;

import java.util.ArrayList;
import java.util.List;

public class DataBase  {
    List<Student>students=new ArrayList<>();
    List<Group>groups=new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }
}
