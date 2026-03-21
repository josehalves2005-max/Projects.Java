package converterdollar.application;

public class CurrencyConverter {

    public static final double TAX = 0.06;
    
    
    public static double calculator(double dollar, double dollarPrice){
        return (dollar * dollarPrice) + (dollar * dollarPrice * TAX);  
    }

    
}
