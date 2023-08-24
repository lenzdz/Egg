package Entities;

public class Persona {
    
    private String name;
    private int age;
    private char sex;
    private double weight;
    private double height;

    public Persona() {
    }

    public Persona(String name, int age, char sex, double weight, double height) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.weight = weight;
        this.height = height;
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

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Persona{" + "name=" + name + ", age=" + age + ", sex=" + sex + ", weight=" + weight + ", height=" + height + '}';
    }
    
}
