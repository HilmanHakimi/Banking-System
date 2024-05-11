package Day9;

import java.util.ArrayList;
import java.util.Scanner;

public class CommandLineExercise {
    private static ArrayList<Task> tasks = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nWelcome to the To-Do List App!");
        System.out.println("Commands:");
        System.out.println("1. Add a task");
        System.out.println("2. Mark a task as completed");
        System.out.println("3. List all tasks");
        System.out.println("4. Delete a task");
        System.out.println("5. Exit");
        System.out.print("\nEnter your command: ");

        boolean exit = false;

        while (!exit) {


            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    markTaskCompleted();
                    break;
                case 3:
                    listTasks();
                    break;
                case 4:
                    deleteTask();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid command. Please try again.");
                    break;
            }
            System.out.print("\nEnter your command: ");
        }

        sc.close();
    }

    private static void addTask() {
        System.out.print("Enter task description: ");
        String description = sc.nextLine();
        tasks.add(new Task(description));
        System.out.println("Task added successfully!");
    }

    private static void markTaskCompleted() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks found.");
            return;
        }



        System.out.print("Enter the number of the task to mark as completed: ");
        int taskNumber = sc.nextInt() - 1;
        sc.nextLine(); // Consume newline character

        if (isValidTaskNumber(taskNumber)) {
            tasks.get(taskNumber).markCompleted();
            System.out.println("Task marked as completed!");
        } else {
            System.out.println("Invalid task number.");
        }
    }

    //method to list the task that have been inserted
    private static void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks found.");
            return;
        }


        //To set the choosen task that have been completed
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            String status = task.isCompleted() ? "[Completed]" : "";
            System.out.println((i + 1) + "." + status + " " + task.getDescription());
        }
    }

    private static void deleteTask() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks found.");
            return;
        }



        System.out.print("Enter the number of the task to delete: ");
        int taskNumber = sc.nextInt() - 1;
        sc.nextLine(); // Consume newline character

        if (isValidTaskNumber(taskNumber)) {
            tasks.remove(taskNumber);
            System.out.println("Task deleted successfully!");
        } else {
            System.out.println("Invalid task number.");
        }
    }

    private static boolean isValidTaskNumber(int taskNumber) {
        return taskNumber >= 0 && taskNumber < tasks.size();
    }

    static class Task {
        private final String description;
        private boolean completed;

        public Task(String description) {
            this.description = description;
            this.completed = false;
        }

        public String getDescription() {
            return description;
        }

        public boolean isCompleted() {
            return completed;
        }

        public void markCompleted() {
            this.completed = true;
        }
    }
}

