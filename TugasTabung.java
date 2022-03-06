/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugastabung;

import java.util.Scanner;

/**
 *
 * @author Windows
 */
public class TugasTabung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double V, d, t, r, phi=3.14;
        Scanner scan = new Scanner (System.in);
         
         System.out.print("Masukkan diameter tabung: ");
         d=scan.nextDouble();
         r= d/2;
         
         System.out.print("Masukkan tinggi tabung: ");
         t=scan.nextDouble();
         
         V = phi * r *r*t;
         System.out.println("Volume tabung adalah " + String.format("%.2f", V));
    
    }
    
}
