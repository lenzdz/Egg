package entities;

import java.util.ArrayList;

public class Game {
    
    private Watergun pistol;
    private ArrayList<Player> users;

    public Game() {
    }

    public Game(Watergun pistol, ArrayList<Player> users) {
        this.pistol = pistol;
        this.users = users;
    }

    public Watergun getPistol() {
        return pistol;
    }

    public void setPistol(Watergun pistol) {
        this.pistol = pistol;
    }

    public ArrayList<Player> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<Player> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Game{" + "pistol=" + pistol + ", user=" + users + '}';
    }
    
}
