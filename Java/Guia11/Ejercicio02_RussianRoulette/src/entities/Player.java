package entities;

public class Player {
    
    private Integer id;
    private String name;
    private Boolean wet;

    public Player() {
    }

    public Player(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.wet = false;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getWet() {
        return wet;
    }

    public void setWet(Boolean wet) {
        this.wet = wet;
    }

    @Override
    public String toString() {
        return "Player{" + "id=" + id + ", name=" + name + ", wet=" + wet + '}';
    }
    
    
    
}
