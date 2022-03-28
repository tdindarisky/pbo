/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpuaction;

import cpuaction.CPU.Processor;
import cpuaction.CPU.RAM;

/**
 *
 * @author Windows
 */
public class CPUAction {

    /**
     * @param args the command line arguments
     */
    
 
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        CPU cpu = new CPU();
        CPU.Processor pr = cpu.new Processor();
        
        CPU.RAM ram = cpu.new RAM();
        System.out.println("Processor Cache = " +pr.getCache());
        System.out.println("Ram Clock Speed = " +ram.getClockSpeed());
    }
    
}
