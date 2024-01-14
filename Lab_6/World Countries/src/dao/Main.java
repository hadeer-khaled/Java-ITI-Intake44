package dao;

import domain.City;
import domain.Country;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String args[]) {
        InMemoryWorldDao worldDao = InMemoryWorldDao.getInstance ();
        Set<String> allContinents = worldDao.getContinents ();
        //System.out.println(allContinents);

        Map<String, Country> allCountries = worldDao.getCountries ();
//        System.out.println(allCountries.values());

        // -------------------------------- 1) The highest populated city of each country --------------------------------
        Map<String, String> CountriesCitiesMaxPop = allCountries.values().stream().collect(Collectors.toMap(
                Country::getName,
                c->{ List<City> cities = c.getCities();
                    return  cities.stream().max(Comparator.comparing(City::getPopulation)).map(City::getName)
                            .orElse("There is no Cities");
                }
        ));
        CountriesCitiesMaxPop.forEach((key, val) -> {
            System.out.println("Country: " + key + "     City: " + val);
        });
        // -------------------------------------------------------------------------------------------------------------\\


        // -------------------------------- 2) the most populated city of each continent -------------------------------\\
        Map<String, City> mostPopulatedCityForEachContinent = countries2.stream()
                .flatMap(country -> country.getCities().stream()
                        .map(city -> new AbstractMap.SimpleEntry<>(country.getContinent(), city)))
                .collect(Collectors.groupingBy(
                        Map.Entry::getKey,
                        Collectors.maxBy(Comparator.comparingInt(entry -> entry.getValue().getPopulation()))
                ))
                .entrySet().stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        entry -> entry.getValue().map(Map.Entry::getValue).orElse(null)
                ));


    }
}
