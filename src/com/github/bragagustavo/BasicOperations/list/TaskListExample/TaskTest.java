package com.github.bragagustavo.BasicOperations.list.TaskListExample;

public class TaskTest{
    public static void main(String[] args) {
        TaskList taskList = new TaskList();
        
        System.out.println(taskList.getTotalTasks());
        
        taskList.addTask("task 1");
        taskList.addTask("task 2");
        taskList.addTask("task 2");
        taskList.addTask("task 3");
       
        System.out.println(taskList.getTotalTasks());
        
        taskList.removeTask("task 2");
        
        System.out.println(taskList.getTotalTasks());
        
        taskList.getTaskDescription();
        
        taskList.removeTask("task 1");
        taskList.removeTask("task 3");

       System.out.println("Total de itens na lista: " + taskList.getTotalTasks());
       taskList.removeTask("task 1");
       taskList.getTaskDescription();

        

    }

}