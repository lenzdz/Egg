// La clase quedó con el nombre de Country porque leí mal el ejercicio y pensé que eran códigos postales de ciudades, no países.
// Para el punto en el que me di cuenta, ya había avanzado demasiado en el ejercicio y no sabía si refractorizarlo corregiría el código en todas las instancias.

package entities;
import java.util.Objects;

public class Country {
    
    private String name; // Equivalente a país.
    private String zone; // Equivalente a ciudad.

    public Country() {
    }

    public Country(String name, String zone) {
        this.name = name;
        this.zone = zone;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getZone() {
        return this.zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Country)) {
            return false;
        }
        Country country = (Country) o;
        return Objects.equals(name, country.name) && Objects.equals(zone, country.zone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, zone);
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", zone='" + getZone() + "'" +
            "}";
    }


}
