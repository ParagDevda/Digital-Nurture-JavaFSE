package Deepskilling.week1.DSA.Exercise5;

class Node {

    int taskId;
    String taskName;
    String status;
    Node next;

    Node(int taskId, String taskName, String status) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.status = status;
        next = null;
    }
}

public class TaskManagement {

    Node head;

    // Add Task
    void addTask(int id, String name, String status) {

        Node newNode = new Node(id, name, status);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
    }

    // Search Task
    void searchTask(int id) {

        Node temp = head;

        while (temp != null) {

            if (temp.taskId == id) {
                System.out.println(temp.taskId + " " +
                                   temp.taskName + " " +
                                   temp.status);
                return;
            }

            temp = temp.next;
        }

        System.out.println("Task not found");
    }

    // Display Tasks
    void displayTasks() {

        Node temp = head;

        while (temp != null) {

            System.out.println(temp.taskId + " " +
                               temp.taskName + " " +
                               temp.status);

            temp = temp.next;
        }
    }

    // Delete Task
    void deleteTask(int id) {

        if (head == null)
            return;

        if (head.taskId == id) {
            head = head.next;
            return;
        }

        Node temp = head;

        while (temp.next != null && temp.next.taskId != id)
            temp = temp.next;

        if (temp.next != null)
            temp.next = temp.next.next;
    }

    public static void main(String[] args) {

        TaskManagement tm = new TaskManagement();

        tm.addTask(101, "Coding", "Pending");
        tm.addTask(102, "Testing", "Completed");
        tm.addTask(103, "Documentation", "Pending");

        System.out.println("Tasks:");
        tm.displayTasks();

        System.out.println("\nSearch Task 102:");
        tm.searchTask(102);

        tm.deleteTask(102);

        System.out.println("\nAfter Deletion:");
        tm.displayTasks();
    }
}
