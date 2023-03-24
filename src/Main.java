import db.DataBase;
import model.Gender;
import model.Group;
import model.Student;
import service.StudentService;
import service.impl.GroupServiceImpl;
import service.impl.StudentServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DataBase dataBase=new DataBase();
        Group group1=new Group(1,"Java","Hello java ",2023);
        Group group2=new Group(2,"JS","Hello JS ",2022);
        Group group3=new Group(3,"Python","Hello Python ",2021);
        Group group4=new Group(4,"React","Hello React ",2020);
        List<Group>groups=new ArrayList<>();
        groups.add(group1);
        groups.add(group2);
        groups.add(group3);
        groups.add(group4);


        Student student1=new Student("Ikramova",28, Gender.FEMALE);
        Student student2=new Student("Akunov",20, Gender.MALE);
        Student student3=new Student("Arzykulova",19, Gender.FEMALE);
       List<Student>students=new ArrayList<>();
       students.add(student1);
       students.add(student2);
       students.add(student3);
        GroupServiceImpl groupService = new GroupServiceImpl();
        System.out.println(groupService.addNewGroup(group1));
        System.out.println(groupService.getGroupById(1));
      //  System.out.println(groupService.getAllGroups());
        System.out.println(groupService.updateGroupName(3,"JS"));
      //  System.out.println(groupService.filterByYear());
        StudentServiceImpl studentService=new StudentServiceImpl() ;
        System.out.println(studentService.addStudent(student1));
        System.out.println(studentService.getStudentById(1));
        System.out.println(studentService.filterByGender());

    }
}