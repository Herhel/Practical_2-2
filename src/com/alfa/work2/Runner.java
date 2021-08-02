package com.alfa.work2;

public class Runner {
    private Employee[] employees;
    public void run () {
        createBase();
        System.out.println("Кол-во сотрудников: " + Employee.getNumberOfEmployees());
    }

    private void createBase () {
        employees = new Employee[] {
                new Employee("Игорь", "Петров", "электрик", "+380965554477"),
                new Employee("Василий", "Иванов", "бухгалтер", "+380660478521"),
                new Employee("Алексей", "Незнайка", "секретарь", "+380992548965"),
                new Employee("Михаил", "Муха", "охранник"),
                new Employee("Олег", "Сидоров", "сантехник", "+380508547456")
        };
    }
}
