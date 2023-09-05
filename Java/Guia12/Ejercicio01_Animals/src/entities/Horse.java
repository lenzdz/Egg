package entities;

public final class Horse extends Animal {

    private String horseBreed;

    public Horse(String horseBreed) {
        this.horseBreed = horseBreed;
    }

    public Horse(String name, String diet, Integer age, String horseBreed) {
        super(name, diet, age);
        this.horseBreed = horseBreed;
    }

    public String getHorseBreed() {
        return horseBreed;
    }

    public void setHorseBreed(String horseBreed) {
        this.horseBreed = horseBreed;
    }

    @Override
    public String toString() {
        return "Horse{" +
                ", name='" + name + '\'' +
                ", diet='" + diet + '\'' +
                ", age=" + age +
                "horseBreed='" + horseBreed + '\'' +
                '}';
    }

    @Override
    public void foodTaken() {
        System.out.println("La dieta del caballo " + this.name + " se basa en " + this.diet +".");
    }


}
