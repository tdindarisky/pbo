/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

import java.util.Scanner;

/**
 *
 * @author Windows
 */
public class AksiSepeda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    int jumlahRoda;
    String jenis, merk;
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Jenis Sepeda: ");
    jenis = scan.nextLine();
    
    System.out.print("Merk: ");
    merk = scan.nextLine();
    
    System.out.print("Jumlah roda: ");
    jumlahRoda = scan.nextInt();
    
            
            
    
    System.out.println("Sepeda " +jenis+ " bermerk " +merk+ " memiliki jumlah roda " +jumlahRoda);
    
    
        Sepeda sepedaBalap = new Sepeda();
        
        int gearSepeda = sepedaBalap.gear;
        System.out.println(gearSepeda);
        sepedaBalap.ngerem();
        
        Sepeda sepedaGunung = new Sepeda();
        int gearSepedaGunung = sepedaGunung.gear;
        System.out.println(gearSepedaGunung);
        sepedaGunung.ngerem();
        
    }
    
}
