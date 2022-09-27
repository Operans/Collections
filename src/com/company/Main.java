package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Emloyee> employees = new ArrayList<>();

        //Добавить сотрудников
//        employees.add(new Emloyee("Chingiz",21));
//        employees.add(new Emloyee("Bektur",42));
//        employees.add(new Emloyee("Someone",12));
//        employees.add(new Emloyee("Baisla", 75));

        //Отсортировать и вывести в зависимости от возраста
//        Collections.sort(employees);
//        System.out.println(employees)

        //Перемешать
//        Collections.shuffle(employees);
//        System.out.println(employees);

        //Удалить
//        employees.remove(0);
//        System.out.println(employees);

    }
}

class Emloyee implements Comparable<Emloyee>{
    private String name;
    private int age;

    public Emloyee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Emloyee o) {
        return (int)(this.age - o.getAge());
    }

    @Override
    public String toString() {
        return "Emloyee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
