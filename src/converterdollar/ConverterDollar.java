package converterdollar;

import converterdollar.application.CurrencyConverter;
import java.util.Locale;
import java.util.Scanner;

public class ConverterDollar {

    public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    
        System.out.print("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();
        
        System.out.print("How many dollars will be bought? ");
        double dollar = sc.nextDouble();
        
        double doll = CurrencyConverter.calculator(dollar, dollarPrice);
        
        System.out.printf("Amout to be  paid in reais = %.2f%n", doll);

    }
    
}
