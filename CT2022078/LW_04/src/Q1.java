import java.util.Scanner;

class Temperature{

    private  double celsius;

    public Temperature() {
        this.celsius = 0.0 ;
    }

    public Temperature(double celsius){
        this.celsius = celsius;
    }

    public double toCelsius(double celsius){
        return celsius;
    }

    public double toFahrenheit(double celsius){
        return (celsius * 9 / 5 + 32);
    }

    public double setCelsius(double celsius){
        this.celsius = celsius;
        return celsius;
    }

    public double setFahrenheit(double fahrenheit){
        celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;
    }
}


public class Q1 {
    static void main() {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");

        double cel = input.nextDouble();

        Temperature temp = new Temperature(cel);

        System.out.println("Temperature in Fahrenheit: " + temp.toFahrenheit(cel));
    }
}
