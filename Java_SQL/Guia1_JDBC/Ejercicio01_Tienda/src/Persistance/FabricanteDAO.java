package Persistance;

import Entities.Fabricante;

import java.sql.SQLException;
import java.util.ArrayList;

public final class FabricanteDAO extends DAO {

    public void saveFabricante(Fabricante fabricante) throws Exception {

        try {

            if (fabricante == null) {
                throw new Exception("Debe indicar un fabricante.");
            }

            String sqlStatement = "INSERT INTO fabricante (nombre)" +
                    "VALUES ('" + fabricante.getNombre() + "');";

            insertUpdateErase(sqlStatement);
        } catch (Exception e) {
            throw e;
        }

    }

    public void updateFabricante(Fabricante fabricante) throws Exception {

        try {

            if (fabricante == null) {
                throw new Exception("Debe indicar un fabricante.");
            }

            String sqlStatement = "UPDATE fabricante" +
                    "SET nombre = '" + fabricante.getNombre() + "' WHERE codigo = " + fabricante.getCodigo() + ";";
            insertUpdateErase(sqlStatement);

        } catch (Exception e) {
            throw e;
        }

    }

    public void eraseFabricante(String name) throws SQLException {

        try {
            String sqlStatement = "DELETE FROM fabricante WHERE nombre = '" + name + "';";
            insertUpdateErase(sqlStatement);
        } catch (Exception e) {
            throw e;
        }

    }

    public Fabricante searchFabricanteByName(String name) throws Exception {

        try {

            String sqlStatement = "SELECT * FROM fabricante " +
                    "WHERE nombre = '" + name + "';";
            checkDatabase(sqlStatement);

            Fabricante fabricante = null;

            while (resultSet.next()) {
                fabricante = new Fabricante();
                fabricante.setCodigo(resultSet.getLong(1));
                fabricante.setNombre(resultSet.getString(2));
            }

            disconnectDatabase();
            return fabricante;

        } catch (Exception e) {
            disconnectDatabase();
            throw e;
        }

    }

    public ArrayList<Fabricante> listFabricantes() throws Exception{

        try {
            String sqlStatement = "SELECT * FROM fabricante";
            checkDatabase(sqlStatement);

            Fabricante fabricante = null;
            ArrayList<Fabricante> fabricantesList = new ArrayList<>();

            while (resultSet.next()) {
                fabricante = new Fabricante();
                fabricante.setCodigo(resultSet.getLong(1));
                fabricante.setNombre(resultSet.getString(2));
                fabricantesList.add(fabricante);
            }

            disconnectDatabase();
            return fabricantesList;

        } catch (Exception e) {
            e.printStackTrace();
            disconnectDatabase();
            throw new Exception("Error de sistema.");
        }

    }

}
