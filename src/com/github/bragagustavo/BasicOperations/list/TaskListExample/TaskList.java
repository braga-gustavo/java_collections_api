package com.github.bragagustavo.BasicOperations.list.TaskListExample;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    List<Task> taskList;


    public TaskList(){
        this.taskList = new ArrayList<>();
    }
    

    public void addTask(String description){
        Task task = new Task(description);
        taskList.add(task);
    }

    public void removeTask (String description){
        List<Task> tasksToRemove = new ArrayList<>();
        if(!taskList.isEmpty()){
            for(Task t : taskList){
                if(t.getDescription().equalsIgnoreCase(description)){
                    tasksToRemove.add(t);
                }
            }
            taskList.removeAll(tasksToRemove);
        }else{
            System.out.println("A lista está vazia");
        }
    }

    public int getTotalTasks(){
        return taskList.size();
    }

    public void getTaskDescription(){
        if(!taskList.isEmpty()){
            System.out.println(taskList);
        }else{
            System.out.println("A lista está vazia");
        }
    }



    
}
