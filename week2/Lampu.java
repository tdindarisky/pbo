/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

/**
 *
 * @author Windows
 */
public class Lampu {

    /**
     * @param args the command line arguments
     */
    
        // TODO code application logic here
        boolean nyala;
       
        void nyalakanLampu(){
        nyala = true;
        System.out.println("Apakah lampu hdup? " + nyala);
        
       }   
        void matikanLampu(){
        nyala = false;
        System.out.println("Apakah lampu hidup? " + nyala);
    }
        public static void main(String[] args) {
            Lampu lampu = new Lampu();
            
            lampu.nyalakanLampu();
            lampu.matikanLampu();
    }
    
}
