package com.example.takeapart.Models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Project {
    private String projectName;
    private Date dueDate;
    private List<Assignment> tasks;
    private Status status;
    //private User owner;

    public Project(String name, Date date){
        projectName = name;
        dueDate = date;
        tasks = new ArrayList<>();
        status = Status.Waiting;
    }


}
