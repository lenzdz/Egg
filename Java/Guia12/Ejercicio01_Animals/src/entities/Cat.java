package entities;

public final class Cat extends Animal {

    private String catBreed;

    public Cat(String catBreed) {
        this.catBreed = catBreed;
    }

    public Cat(String name, String diet, Integer age, String catBreed) {
        super(name, diet, age);
        this.catBreed = catBreed;
    }

    public String getCatBreed() {
        return catBreed;
    }

    public void setCatBreed(String catBreed) {
        this.catBreed = catBreed;
    }

    @Override
    public String toString() {
        return "Cat{" +
                ", name='" + name + '\'' +
                ", diet='" + diet + '\'' +
                ", age=" + age +
                "catBreed='" + catBreed + '\'' +
                '}';
    }

    @Override
    public void foodTaken() {
        System.out.println("La dieta del gato " + this.name + " se basa en " + this.diet +".");
    }
}
