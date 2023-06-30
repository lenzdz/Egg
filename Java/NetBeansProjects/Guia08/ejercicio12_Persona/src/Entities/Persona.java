package Entities;

import java.time.LocalDate;

public class Persona {
    
    private String name;
    private LocalDate birth;

    public Persona() {
    }

    public Persona(String name, LocalDate birth) {
        this.name = name;
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Persona{" + "name=" + name + ", birth=" + birth + '}';
    }
    
    
    
}
