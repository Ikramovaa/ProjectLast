package db;

import model.Group;
import model.Student;

import java.util.List;

public interface DataBaseS {
    String addStudent(Student student);

    Student getStudentById(int id);
    List<Student> getAllStudents();

    String updateStudentFullName(int id, String fullName);

    List<Student> filterByGender();

    void deleteStudentById(int id);

    String addNewGroup(Group group);

    String getGroupById(int id);

    List<Group> getAllGroups();

    List<Group> getAllGroups(List<Group> movies);

    String updateGroupName(int id, String groupName);

    List<Group>filterByYear(int year, String ascDesc);

    List<Group>sortGroupByYear(String ascDesc);
}
