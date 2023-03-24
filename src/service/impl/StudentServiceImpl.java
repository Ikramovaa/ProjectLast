package service.impl;

import db.DataBase;
import model.Gender;
import model.Student;
import service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    DataBase dataBase=new DataBase();

    @Override
    public String addStudent(Student student) {
        dataBase.getStudents().add(student);
        return "Student is successfully added";
    }

    @Override
    public Student getStudentById(int id) {
        System.out.println(dataBase.getStudents().stream());
        return null;
    }

    @Override
    public List<Student> getAllStudents() {

        return null;
    }

    @Override
    public String updateStudentFullName(int id, String fullName) {
        return null;
    }

    @Override
    public List<Student> filterByGender() {
        System.out.println(dataBase.getStudents().stream().filter(student -> student.getGender().equals(Gender.FEMALE)));
        return null;
    }

    @Override
    public void deleteStudentById(int id) {

    }
}
