package edu.cnm.deepdive.temp_converter_android;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class TempConverter {

  private static Scanner input = new Scanner(System.in);

  private static void convert(Scanner scanner) {
    try {
      String line;
      while (!(line  = scanner.nextLine().trim()).isEmpty()) {
        char finalChar = line.toUpperCase().charAt(line.length() - 1);
        if (finalChar == 'C') {
          double celsius = parseTemperature(line);
          System.out.printf("%.3fF%n", celsiusToFahrenheit(celsius));
        } else if (finalChar == 'F') {
          double fahrenheit = parseTemperature(line);
          System.out.printf("%.3fC%n", fahrenheitToCelsius(fahrenheit));
        } else if (finalChar == 'K'){
          double kelvin = parseTemperature(line);
          System.out.printf("%.3fF%n", kelvinToCelsius(kelvin));
        }
      }
    } catch (NoSuchElementException expected) {
    }
  }

  private static double parseTemperature(String line) {
    line = line.substring(0, line.length() - 1).trim();
    return Double.parseDouble(line);
  }


  public static double fahrenheitToCelsius(double fahrenheit) {
    return (fahrenheit - 32) * 5 / 9;
  }

  public static double faharenheitToKelvin(double fahrenheit){
    return (fahrenheit + 459.67) * 5 / 9;
  }

  public static double celsiusToFahrenheit(double celsius) {
    return 9 * celsius / 5 + 32;
  }

  public static double celsiusToKelvin(double celsius){
    return (celsius + 273.15);
  }

  public static double kelvinToFahrenheit(double kelvin){
    return (kelvin * 9 / 5) - 459.67;
  }

  public static double kelvinToCelsius(double kelvin){
    return (kelvin - 273.15);
  }


}



