package problema._negativos;

import problema._negativos.application.Result;
import java.util.Locale;
import java.util.Scanner;

public class Problema_negativos {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        System.out.println("Quantos Numeros voce vai digitar? ");
        int r = sc.nextInt();
        
        Result[] vect = new Result[r];
        
        for(int i = 0; i < vect.length; i++){
            System.out.println("Digite um numero: ");
            int numbers = sc.nextInt();
            vect[i] = new Result (numbers);    
        }
        
        System.out.println("Numeros Negatiivos: ");
        for(int i = 0; i< vect.length; i++)
            if(vect[i].getNumbers() < 0){
                System.out.println(vect[i].getNumbers());
            }
           
        sc.close();
       




    }
    
}
