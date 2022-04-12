
import java.util.Scanner;
import mahasiswa.Mhs;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Windows
 */
public class Mahasiswa extends Mhs{

    /**
     * @param args the command line arguments
     */
    public Mahasiswa(String nim, String nama, Double ipk, int sks, String tglLahir) {
        super(nim, nama, ipk, sks, tglLahir);
        Scanner scann = new Scanner (System.in);
        nama = scann.nextLine();
        System.out.println("Nama : " +nama);
    }
    public static void main(String[] args) {
        // TODO code application logic here
       
        System.out.println("Program Studi = " + Mhs.getProgdi);
    }

    
    
}
