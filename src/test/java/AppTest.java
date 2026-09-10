package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testAddEmployee() {

        App app = new App();

        app.addEmployee("Rahul");

        assertTrue(app.employeeExists("Rahul"));
        assertEquals(1, app.getEmployeeCount());
    }

    @Test
    void testMultipleEmployees() {

        App app = new App();

        app.addEmployee("Rahul");
        app.addEmployee("Priya");
        app.addEmployee("Arun");

        assertEquals(3, app.getEmployeeCount());
        assertTrue(app.employeeExists("Priya"));
    }

    @Test
    void testRemoveEmployee() {

        App app = new App();

        app.addEmployee("Rahul");
        app.addEmployee("Priya");

        boolean removed = app.removeEmployee("Rahul");

        assertTrue(removed);
        assertFalse(app.employeeExists("Rahul"));
        assertEquals(1, app.getEmployeeCount());
    }

    @Test
    void testInvalidEmployeeName() {

        App app = new App();

        assertThrows(
                IllegalArgumentException.class,
                () -> app.addEmployee("")
        );
    }

    @Test
    void testEmployeeDoesNotExist() {

        App app = new App();

        app.addEmployee("Rahul");

        assertFalse(app.employeeExists("Kiran"));
    }
}
