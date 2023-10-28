package Services;

import Entities.Fabricante;
import Persistance.FabricanteDAO;

public class FabricanteServices {

    private FabricanteDAO dao;

    public FabricanteServices() {
        this.dao = new FabricanteDAO();
    }

    public void createFabricante (String name) throws Exception {

        try {
            if (name == null || name.trim().isEmpty()) {
                throw new Exception("Debe ingresar un nombre.");
            }
            if (searchFabricanteByName(name) != null) {
                throw new Exception("Ya existe un fabricante con ese nombre.");
            }

            Fabricante fabricante = new Fabricante();
            fabricante.setNombre(name);
            dao.saveFabricante(fabricante);
        } catch (Exception e) {
            throw e;
        }


    }

    public Fabricante searchFabricanteByName(String name) throws Exception {

        try {

            //Validamos
            if (name == null || name.trim().isEmpty()) {
                throw new Exception("Debe indicar el nombre del fabricante.");
            }

            Fabricante fabricante = dao.searchFabricanteByName(name);

            return fabricante;
        } catch (Exception e) {
            throw e;
        }
    }
}
