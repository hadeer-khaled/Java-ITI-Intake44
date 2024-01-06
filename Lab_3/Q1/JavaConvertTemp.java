import java.util.function.Function;

class TemperatureConverter implements Function<Double , Double>{
    @Override
    public  Double apply(Double celsius){
        return (celsius * 9 / 5) + 32;
    }
}

class MainClass {
    public static void main(String[] args){
     TemperatureConverter celsiusToFahrenheit  = new TemperatureConverter()   ;
     double FahrenheitTemp = celsiusToFahrenheit.apply(10.0);
     System.out.println(FahrenheitTemp + "F");
    }
   
    
}
