package entities;

public class Dog {
    
    private String name;
    private String breed;
    private Integer age;
    private Integer height;

    public Dog() {
    }

    public Dog(String name, String breed, Integer age, Integer height) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Dog{" + "name=" + name + ", breed=" + breed + ", age=" + age + ", height=" + height + '}';
    }
    
    
    
}
