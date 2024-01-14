import java.util.List;
class Country {
    private String code;
    private String name;
    private String continent;
    private int population;
    private int capital;
    private List<City> cities;

    public Country(String code, String name, String continent, int population, int capital, List<City> cities) {
        this.code = code;
        this.name = name;
        this.continent = continent;
        this.population = population;
        this.capital = capital;
        this.cities = cities;
    }

    // Getters for the sake of the example
    public List<City> getCities() {
        return cities;
    }

    public String getContinent() {
        return continent;
    }
    public int getPopulation() {
        return population;
    }
    public String getName() {
        return name;
    }
}
//public class Country {
//    private String code;
//    private String name;
//    private String continent;
//    private int population;
//    private int capital;
//    private List<City> cities;
//
//    public Country() {
//    }
//    public Country(String code, String name, String continent, int population,int capital, List<City> cities) {
//        this.code = code;
//        this.name = name;
//        this.continent = continent;
//        this.population = population;
//        this.capital = capital;
//        this.cities = cities;
//    }
//    public String getContinent() {
//        return continent;
//    }
//    public List<City> getCities() {
//        return cities;
//    }
//    public String getName() {
//        return name;
//    }
//
//}// end of class