
public class City {
    private int id;
    private String name;
    private String countryCode;
    private int population;


    public City(int id, String name, int population, String countryCode) {
        this.id = id;
        this.name = name;
        this.population = population;
        this.countryCode = countryCode;
    }

    public City() {
    }

    public String getName() {
        return name;
    }
    public int getPopulation() {
        return population;
    }
    public int getId(){
        return id;
    }
}// end of class