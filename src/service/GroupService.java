package service;

import model.Group;

import java.util.List;

public interface GroupService  {
    String addNewGroup(Group group);

    String getGroupById(int id);

    List<Group> getAllGroups();

    List<Group> getAllGroups(List<Group> movies);

    String updateGroupName(int id, String groupName);

    List<Group>filterByYear(int year, String ascDesc);

    List<Group>sortGroupByYear(String ascDesc);

}
