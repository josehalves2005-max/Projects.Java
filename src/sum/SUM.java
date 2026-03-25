package sum;

import java.util.Locale;
import java.util.Scanner;
import sum.application.Calculator;

public class SUM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        System.out.print("Quantos Numeros voce vai digitar? ");
        int t = sc.nextInt();
        
        Calculator [] vect = new Calculator[t];
        

        for(int i = 0; i < vect.length; i++){
            System.out.print("Digite um numero: ");
            double value = sc.nextDouble();
            vect[i] = new Calculator (value);
        }
        
        double sum = 0; 
        System.out.println();
        
        System.out.print("VALORES = ");
        
        for(int i = 0; i < vect.length; i++){
            System.out.printf("%.1f ", vect[i].getValue());
            sum += vect[i].getValue();
        }

        double avarage = sum / t;
        
        System.out.println();

        System.out.printf("SOMA = %.2f%n", sum);
        System.out.printf("MEDIA = %.2f%n", avarage);
        

        
sc.close();
    }
    
}
