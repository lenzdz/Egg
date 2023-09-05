package entities;

public final class Dog extends Animal {

    private String dogBreed;

    public Dog(String dogBreed) {
        this.dogBreed = dogBreed;
    }

    public Dog(String name, String diet, Integer age, String dogBreed) {
        super(name, diet, age);
        this.dogBreed = dogBreed;
    }

    public String getDogBreed() {
        return dogBreed;
    }

    public void setDogBreed(String dogBreed) {
        this.dogBreed = dogBreed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                ", name='" + name + '\'' +
                ", diet='" + diet + '\'' +
                ", age=" + age +
                "dogBreed='" + dogBreed + '\'' +
                '}';
    }

    @Override
    public void foodTaken() {
        System.out.println("La dieta del perro " + this.name + " se basa en " + this.diet +".");
    }


}
