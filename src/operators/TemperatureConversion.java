package operators;

import java.text.DecimalFormat;
import java.util.Scanner;

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
 * To convert temperature from one unit to another unit we will get the temperature
 * from the keyboard as input and convert it to another unit
 * */

public class TemperatureConversion {

    public static void main(String[] args){

        //get input from the console
        Scanner input = new Scanner(System.in);
        
        //format numbers up to 2 decimal places
        DecimalFormat df = new DecimalFormat("#,###,##0.00");

        //initialization
        double tempFahrenheit = 0;
        double tempCelsius = 0;
        double tempKelvin = 0;

        System.out.println("*****Temperature Conversion*****");
        System.out.println("Enter temperature as input from keyboard...");

        //Celsius to Kelvin
        System.out.println("\n1). Celsius to Kelvin");
        System.out.println("Enter Temperature in Celsius: ");
        tempCelsius = input.nextDouble();
        tempKelvin = tempCelsius + 273.15;
        System.out.println( df.format(tempCelsius)  + "C" + " = " + df.format(tempKelvin) + "K");

        //Celsius to Fahrenheit
        System.out.println("\n2). Celsius to Fahrenheit");
        System.out.println("Enter Temperature in Celsius: ");
        tempCelsius = input.nextDouble();
        tempFahrenheit = tempCelsius*9/5 + 32;
        System.out.println(df.format(tempCelsius)  + "C" + " = " + df.format(tempFahrenheit) + "F");

        //Kelvin to Celsius
        System.out.println("\n3). Kelvin to Celsius");
        System.out.println("Enter Temperature in Kelvin: ");
        tempKelvin = input.nextDouble();
        tempCelsius = tempKelvin - 273.15;
        System.out.println(df.format(tempKelvin)  + "K" + " = " + df.format(tempCelsius) + "C");

        //Kelvin to Fahrenheit
        System.out.println("\n4). Kelvin to Fahrenheit");
        System.out.println("Enter Temperature in Kelvin: ");
        tempKelvin = input.nextDouble();
        tempFahrenheit = tempKelvin*9/5 - 459.67;
        System.out.println(df.format(tempKelvin)  + "K" + " = " + df.format(tempFahrenheit) + "F");

    }
}
