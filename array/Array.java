/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Scanner;

/**
 *
 * @author Windows
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] angka = new int [5];
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        
        for( int i = 0; i < angka.length; i++ ){
            System.out.print("Angka ke-" + i + ": ");
            angka[i] = scanner.nextInt();
        }
        
        for (int a : angka){
            System.out.println(a);
        
        }
        for (int num: angka){
            sum = sum+num;
            
        }
        System.out.println("Jumlah Dari Semua Elemen Array Adalah :"+sum);
    }

    
    
}
