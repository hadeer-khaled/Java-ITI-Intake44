
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

//    @Override
//    public String toString() {
//        return "City{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", population=" + population +
//                ", countryCode='" + countryCode + '\'' +
//                '}';
//    }
    public String getName() {
        return name;
    }
    public int getPopulation() {
        return population;
    }

}// end of class