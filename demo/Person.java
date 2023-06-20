/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

/**
 *
 * @author Admin
 */
public class Person{
    private String name;
    private int age;
    private String id;
    static int num = 1;

    public Person() {
     
    }

    public Person(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
    
    public void addOne(){
        num += 1;
    }
    public static void speak(){
        System.out.println("say something");
       
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static int getNum() {
        return num;
    }

    public static void setNum(int num) {
        Person.num = num;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + ", id=" + id + '}';
    }
    
    
}
