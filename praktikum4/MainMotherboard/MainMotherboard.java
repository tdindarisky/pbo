/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainmotherboard;

/**
 *
 * @author Windows
 */
public class MainMotherboard {

    /**
     * @param args the command line arguments
     */
    
     
    static class USB{
        int usb2 = 3;
        int usb3 = 2;
        int getTotalPorts(){
    return usb2 + usb3;
 }
 } }

    
public class Main {    
    public static void main(String[] args) {
        // TODO code application logic here
         Motherboard.USB usb = new Motherboard();
        System.out.println("Total Ports = " + usb.getTotalPorts());
        
}

    }
    

