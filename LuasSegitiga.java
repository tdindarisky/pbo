/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luassegitiga;

import java.util.Scanner;

/**
 *
 * @author Windows
 */
public class LuasSegitiga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double L, a, t;
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Masukkan alas segitiga: ");
        a=scan.nextDouble();
        
        System.out.println("Masukkan tinggi segitiga: ");
        t=scan.nextDouble();
        
        L = 0.5 * a * t;
        System.out.println("Luas Segitiga siku-siku adalah " + String.format("%.2f", L));
    }
    
}
