package entities;

public class Person {
    
    private String name;
    private String lastname;
    private Integer age;
    private Integer id;
    private Dog pet;

    public Person() {
    }

    public Person(String name, String lastname, Integer age, Integer id) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Dog getPet() {
        return pet;
    }

    public void setPet(Dog pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Persona [" + "nombre=" + name + ", apellido=" + lastname + ", edad=" + age + ", id=" + id + ", mascota= " + pet + "]";
    }
    
    
    
}
