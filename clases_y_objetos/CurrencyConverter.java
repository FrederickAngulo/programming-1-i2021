public class CurrencyConverter {

    public static double convertColonToDollars (double colones){
        return colones/600;
    }

    public static void main ( String [] args ){
        double dollar = convertColonToDollars(3000.0);
        System.out.println(dollar);
    }
}