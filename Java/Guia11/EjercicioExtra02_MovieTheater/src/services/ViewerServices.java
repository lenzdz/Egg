package services;

import java.util.ArrayList;
import java.util.Random;

import entities.Viewer;

public class ViewerServices {
    
    public ArrayList<Viewer> createViewers() {

        Random rand = new Random();
        Integer numViewers = rand.nextInt(49);

        ArrayList<Viewer> listViewers = new ArrayList<>();
        for (Integer index = 0; index < numViewers; index++) {
            listViewers.add(new Viewer(rand.nextInt(100), rand.nextInt(50)));
        }

        return listViewers;

    }

}
