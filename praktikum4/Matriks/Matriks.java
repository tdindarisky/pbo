/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriks;

/**
 *
 * @author Windows
 */
public class Matriks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double[][] d = { { 1, 2, 3 }, { 4, 5, 6 }, { 9, 1, 3} };
        Matrix D = new Matrix(d);
        D.show(); 
        System.out.println();
        
        double [][] a = {{1,2,5}, {4,8,6}, {9,3,5}};
        Matrix A = new Matrix(a);
        A.swap(1, 2);
        A.show(); 
        System.out.println();
 // shouldn't be equal since AB != BA in general
        
        Matrix B = A.transpose();
        B.show();
        System.out.println();
        
       Matrix I = new Matrix(1,2);
       Matrix C = I.identity(1);
 
       
       //Penjumlahan
       Matrix F = B.plus(A);
       F.show();
       System.out.println();
        

        //Perkalian
        Matrix E = B.times(A);
        E.show();
        System.out.println();
        
        System.out.println(A.times(B).eq(B.times(A)));
        System.out.println();
        Matrix b = Matrix.random(5, 1);
        b.show();
        System.out.println();
        
        
        Matrix x = A.solve(b);
       x.show();
       System.out.println();
        
        
        A.times(x).show();
 
 
    }
    
}
