package entities;

public abstract class Animal {

    protected String name;
    protected String diet;
    protected Integer age;

    public Animal() {
    }

    public Animal(String name, String diet, Integer age) {
        this.name = name;
        this.diet = diet;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", diet='" + diet + '\'' +
                ", age=" + age +
                '}';
    }

    public abstract void foodTaken();
}
