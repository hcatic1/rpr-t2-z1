package ba.unsa.etf.rpr;

public class App {
    public static void main( String[] args ) {
        if(args[0].equals("sinus")){
            System.out.println(dajSinus(Double.parseDouble(args[1])));
        }
        else if(args[0].equals("faktorijel")){
            System.out.println(dajFaktorijel(Integer.parseInt(args[1])));
        }
        else{System.out.println("Ne postoji" + args[0] + "funkcija!");}
    }
    public static double dajSinus(double rad){
        double sin = 0;
        double y = rad;
        for(int i = 0; i < 10; i+=2){
            sin = sin + y/dajFaktorijel(i);
            y *= rad * rad * (-1);
        }
        return sin;
    }
    public static int dajFaktorijel(int x){
        int faktorijel = 1;
        for(int i = 1; i <= x; i++){
            faktorijel *= i;
        }
        return faktorijel;
    }
}
