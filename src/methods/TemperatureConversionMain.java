package methods;

import java.text.DecimalFormat;

/**
 * https://www.rapidtables.com/convert/temperature/fahrenheit-to-celsius.html
 *
 * Homework on Temperature Conversion:
 * 1. Celsius to Kelvin
 * 2. Celsius to Fahrenheit
 * 3. Kelvin to Celsius
 * 4. Kelvin to Fahrenheit
 *
 * C is for Celsius
 * F is for Fahrenheit
 * K is for Kelvin
 *
 * */

public class TemperatureConversionMain {

    public static void main(String[] args){

        //instance of TemperatureConversion
        TemperatureConversion temp = new TemperatureConversion();
        
        //format numbers up to 2 decimal places
        DecimalFormat df = new DecimalFormat("#,###,##0.00");

        //initialization
        double celsius = 0;
        double kelvin = 0;
        double fahrenheit = 0;

        System.out.println("Temperature conversion from one unit to another unit: ");

        /* 1. Celsius to Kelvin */
        celsius = 40.20;
        kelvin = temp.celsiusToKelvin(celsius);
        System.out.println( df.format(celsius)  + "C" + " = " + df.format(kelvin) + "K");


        /* 2. Celsius to Fahrenheit */
        celsius = 50.10;
        fahrenheit = temp.celsiusToFahrenheit(celsius);
        System.out.println(df.format(celsius)  + "C" + " = " + df.format(fahrenheit) + "F");


        /* 3. Kelvin to Celsius */
        kelvin = 473.10;
        celsius = temp.kelvinToCelsius(kelvin);
        System.out.println(df.format(kelvin)  + "K" + " = " + df.format(celsius) + "C");

        /* 4. Kelvin to Fahrenheit */
        kelvin = 509.20;
        fahrenheit = temp.kelvinToFahrenheit(kelvin);
        System.out.println(df.format(kelvin)  + "K" + " = " + df.format(fahrenheit) + "F");
        
    }
}
