package service.impl;

import db.DataBase;
import model.Group;
import service.GroupService;

import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class GroupServiceImpl implements GroupService {
    DataBase dataBase=new DataBase();
    @Override
    public String addNewGroup(Group group) {
        dataBase.getGroups().add(group);
        return "Successfully added";
    }

    @Override
    public String getGroupById(int id) {
        dataBase.getGroups().stream();
        return "Successfully find by ID";
    }

    @Override
    public List<Group> getAllGroups() {
        dataBase.getGroups().stream().forEach(group -> getAllGroups());
        return null;
    }

   @Override
    public List<Group> getAllGroups(List<Group> groups) {

       return null;
   }

    @Override
    public String updateGroupName(int id, String groupName) {
        dataBase.getGroups().stream();
        return "Successfully changed";
    }

    @Override
    public List<Group> filterByYear(int year, String ascDesc) {
       // System.out.println(dataBase.getGroups().stream().filter().sorted().toList());
        return filterByYear(year, ascDesc);
    }

    @Override
    public List<Group> sortGroupByYear(String ascDesc) {
        return null;
    }
}
