/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

import java.util.Scanner;

/**
 *
 * @author Windows
 */
public class ArrayList {

    /**
     * @param args the command line arguments
     */
    
    static int n;
    public static void main(String[] args) {
        

                   String nim;
                   String nama;
                   Double ipk;

               List<String> mhs = new ArrayList<String>();
		System.out.print("Masukkan Jumlah Data: ");
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		
		/**
		 * Gunakan Scanner untuk menginput data nim, nama, ipk
		 */
		
	}
	
	public static void setMahasiswa(String[] nim, String[] nama, Double[] ipk) {
		//gunakan perulangan untuk menyimpan data ke Class Mahasiswa
                System.out.print("NIM   : ");
                nim = scanner.nextLine();
    
                System.out.print("Nama: ");
                nama = scanner.nextLine();
    
                System.out.print("IPK: ");
                ipk = scanner.nextDouble();

                for (int i = 1; i <= n; i++)
                 list.add(i);
             
	}
	
	public static void cetakMahasiswa(ArrayList<Mahasiswa> list) {
		//gunakan perulangan untuk mencetak data yang diambil dari atribut di class Mahasiswa
		 for (String a : list) {
                     System.out.println(a);
                 }
	}

}
    
    

