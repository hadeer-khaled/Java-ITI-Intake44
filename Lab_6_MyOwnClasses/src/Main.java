import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Map;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {

        City city1 = new City(1, "A", 2500000, "A"); // capital
        City city2 = new City(2, "B", 2000000, "B");
        City city3 = new City(3, "C", 970000, "C");
        City city4 = new City(4, "D", 400000, "D"); // capital

        City city5 = new City(5, "E", 400000, "E"); // capital
        City city6 = new City(6, "F", 350000, "F");
        City city7 = new City(7, "H", 200000, "H");
        City city8 = new City(8, "I", 100000, "I"); // capital

        Country country1 = new Country("CC1", "Country1", "Continent1",  55000000, 1, Arrays.asList(city1, city2));

        Country country2 = new Country("CC2", "Country2", "Continent1", 8800000, 4, Arrays.asList(city3, city4));

        Country country3 = new Country("CC3", "Country3", "Continent2", 8800000, 5, Arrays.asList(city5 , city6));

        Country country4 = new Country("CC4", "Country4", "Continent2", 8800000, 8, Arrays.asList(city7 , city8));

        List<Country> countries = Arrays.asList(country1, country2 , country3 , country4);

        // -------  Question 1) Find the highest populated city for each country -------\\
        System.out.println(" ");
        System.out.println(" ------------ The highest populated city for each country ------------");
        countries.forEach(country -> {
            Optional<City> highestPopulatedCity = country.getCities().stream()
                    .max(Comparator.comparingInt(City::getPopulation));

            highestPopulatedCity.ifPresent(city ->
                    System.out.println("Country: " + country.getName() +
                            ", Highest Populated City: " + city.getName() +
                            ", Population: " + city.getPopulation()));
        });


        //Optional helps handle the case where a country may not have any cities or if the city list is empty.

        // -------  Question 2) Find the most populated city of each continent -------\\
        System.out.println(" ");
        System.out.println(" ------------ The most populated city of each continent ------------");
        Map<City, String> cityToContinentMapping = countries.stream()
                .flatMap(country -> country.getCities().stream().map(city -> Map.entry(city, country.getContinent())))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        // Find the most populated city for each continent
        Map<String, City> mostPopulatedCityForEachContinent = cityToContinentMapping.entrySet().stream()
                .collect(
                        Collectors.toMap(
                                Map.Entry::getValue,
                                Map.Entry::getKey,
                                (c1, c2) -> c1.getPopulation() > c2.getPopulation() ? c1 : c2
                        )
                );

        mostPopulatedCityForEachContinent.forEach((continent, city) ->
                System.out.println("Continent: " + continent +
                        ", Most Populated City: " + city.getName() +
                        ", Population: " + city.getPopulation()));


        // -------  Question 3) Find the highest populated capital city -------\\
        System.out.println(" ");
        System.out.println(" ------------ The highest populated capital city ------------");
        Optional<City> highestPopulatedCapital = countries.stream()
                .filter(country -> country.getCapital() != 0)
                .map(country -> country.getCities().stream().filter(city -> city.getId() == country.getCapital()))
                .flatMap(cityStream -> cityStream)
                .max(Comparator.comparingInt(City::getPopulation));

        highestPopulatedCapital.ifPresent(city ->
                System.out.println("Highest Populated Capital City: " + city.getName() +
                        ", Population: " + city.getPopulation()));

    } // end of Main function

} // end of Main Class