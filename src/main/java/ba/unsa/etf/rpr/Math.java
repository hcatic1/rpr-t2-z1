package ba.unsa.etf.rpr;

public class Math {
    public static void main( String[] args ) {
        if(args.length != 2) System.err.println("Nedovoljan broj parametara");
        else if(args[0].equals("sinus")){
            try{
                System.out.println(dajSinus(Double.parseDouble(args[1])));
            }catch (Exception e){
                System.err.println("Nije proslijeđen ispravan tip parametra, za funkciju sinus treba proslijediti realan broj.");
            }
        }
        else if(args[0].equals("faktorijel")){
            try{
                System.out.println(dajFaktorijel(Integer.parseInt(args[1])));
            }catch (Exception e){
                System.err.println("Nije proslijeđen ispravan tip parametra, za funkciju sinus treba proslijediti cijeli broj.");
            }
        }
        else{System.err.println("Ne postoji" + args[0] + "funkcija!");}
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
