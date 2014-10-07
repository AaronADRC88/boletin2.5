/*millas a metros*/
package boletin2.pkg5;

import java.util.Scanner;

/**
 *
 * @author aferreiradominguez
 */
public class Boletin25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    float millas, metros ;
    System.out.println("millas= ");
    Scanner dato=new Scanner(System.in);
    millas=dato.nextFloat();
    System.out.println("metros="+millas*1852);
    
    
    }
    
}
