package entities;

public class Dog {
    
    private String name;
    private String breed;
    private Integer age;
    private Integer height;
    private Boolean adopted;

    public Dog(String string, String string2, int i, int j) {
    }


    public Dog(String name, String breed, Integer age, Integer height, Boolean adopted) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.height = height;
        this.adopted = adopted;
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


    public Boolean isAdopted() {
        return this.adopted;
    }

    public Boolean getAdopted() {
        return this.adopted;
    }

    public void setAdopted(Boolean adopted) {
        this.adopted = adopted;
    }

    @Override
    public String toString() {
        return "{" + "nombre= " + name + ", raza= " + breed + ", edad= " + age + ", altura= " + height + "}";
    }

}
