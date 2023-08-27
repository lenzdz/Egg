package CountriesApp;

import java.util.HashMap;

import entities.Country;
import services.CountryServices;

public class App {
    public static void main(String[] args) throws Exception {

        CountryServices servCountry = new CountryServices();

        HashMap<Integer, Country> countryPostalCodes = servCountry.createCities();
        System.out.println(countryPostalCodes);

        servCountry.checkCities(countryPostalCodes);

        countryPostalCodes = servCountry.addCity(countryPostalCodes);
        System.out.println(countryPostalCodes);

        countryPostalCodes = servCountry.removeCity(countryPostalCodes);
        System.out.println(countryPostalCodes);
    }
}
