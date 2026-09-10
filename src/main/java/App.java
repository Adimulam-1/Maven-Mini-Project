package com.example;

import java.util.ArrayList;
import java.util.List;

public class App {

    private final List<String> employees = new ArrayList<>();

    // Add employee
    public void addEmployee(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Employee name cannot be empty");
        }

        employees.add(name);
    }

    // Get all employees
    public List<String> getEmployees() {
        return new ArrayList<>(employees);
    }

    // Find employee
    public boolean employeeExists(String name) {
        return employees.contains(name);
    }

    // Remove employee
    public boolean removeEmployee(String name) {
        return employees.remove(name);
    }

    // Get employee count
    public int getEmployeeCount() {
        return employees.size();
    }

    public static void main(String[] args) {

        App app = new App();

        app.addEmployee("Rahul");
        app.addEmployee("Priya");
        app.addEmployee("Arun");

        System.out.println("Employee Management Application");
        System.out.println("--------------------------------");

        System.out.println("Employees: " + app.getEmployees());
        System.out.println("Total Employees: " + app.getEmployeeCount());

        System.out.println("Is Rahul available? "
                + app.employeeExists("Rahul"));

        app.removeEmployee("Arun");

        System.out.println("After removing Arun:");
        System.out.println(app.getEmployees());
    }
}
