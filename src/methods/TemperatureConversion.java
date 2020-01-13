package methods;

/*Homework part 2:
* convert below implementation to methods:
* 1. Celsius to Kelvin
* 2. Celsius to Fahrenheit
* 3. Kelvin to Celsius
* 4. Kelvin to Fahrenheit
*
* Convert temperature from one unit to another unit.
*/

public class TemperatureConversion {

    //constructor
    public TemperatureConversion(){

    }

    /* 1. Celsius to Kelvin */
    public double celsiusToKelvin(double celsius){

        double kelvin = celsius + 273.15;

        return kelvin;
    }

    /* 2. Celsius to Fahrenheit */
    public double celsiusToFahrenheit(double celsius){

        double fahrenheit = celsius*9/5 + 32;

        return fahrenheit;
    }
    /* 3. Kelvin to Celsius */
    public double kelvinToCelsius(double kelvin){

        double celsius = kelvin - 273.15;

        return celsius;
    }

    /* 4. Kelvin to Fahrenheit */
    public double kelvinToFahrenheit(double kelvin){

        double fahrenheit = kelvin*9/5 - 459.67;

        return fahrenheit;
    }
}
