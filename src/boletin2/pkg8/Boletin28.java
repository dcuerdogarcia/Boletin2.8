
package boletin2.pkg8;

import java.util.Scanner;
        
public class Boletin28 {

    public static void main(String[] args) {
    double grad, kelv, far;
    System.out.println("Introducir temperatura en g.centigrados:");
    Scanner dato =new Scanner(System.in);
    grad=dato.nextDouble();
    kelv=grad+273;
    far=grad*18000+32;
    System.out.println(+grad+"ºC son "+kelv+" K y "+far+"ºF");
    }
    
}
