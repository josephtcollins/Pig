import java.util.Scanner;
import ch06.lists.*;
import support.*;       

public class Country
{
  public static void main(String[] args)
  {
    Scanner conIn = new Scanner(System.in);

    String name;          
    String country;
    int count = 0;
    ListInterface<String> countries = new ArraySortedList<String>(20);
    
    System.out.print("Your name (enter to end): ");
    name = conIn.nextLine();
    System.out.println("Enter countries, one at a time. Press enter to end.");
    country = conIn.nextLine();
    countries.add(country);
      
      while (!country.equals(""))
      {
         country = conIn.nextLine();
         if(!countries.contains(country)){
            countries.add(country);
            count++;
            }
      }
    System.out.println(name + "'s country list...");
    System.out.println(countries);
    System.out.println("Total number: " + count);
  }
}