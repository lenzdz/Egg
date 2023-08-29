package entities;
import java.util.Objects;

public class Viewer {
    
    private String name;
    private Integer age;
    private Integer money;


    public Viewer() {
    }


    public Viewer(Integer age, Integer money) {
        this.age = age;
        this.money = money;
    }

    public Viewer(String name, Integer age, Integer money) {
        this.name = name;
        this.age = age;
        this.money = money;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getMoney() {
        return this.money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Viewer name(String name) {
        setName(name);
        return this;
    }

    public Viewer age(Integer age) {
        setAge(age);
        return this;
    }

    public Viewer money(Integer money) {
        setMoney(money);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Viewer)) {
            return false;
        }
        Viewer viewer = (Viewer) o;
        return Objects.equals(name, viewer.name) && Objects.equals(age, viewer.age) && Objects.equals(money, viewer.money);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, money);
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", age='" + getAge() + "'" +
            ", money='" + getMoney() + "'" +
            "}";
    }    

}
