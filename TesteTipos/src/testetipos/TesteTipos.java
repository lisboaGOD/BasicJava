/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testetipos;

import java.util.Arrays;

/**
 *
 * @author anton
 */
public class TesteTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       double v [] = {1.2, 13.1 , 12.0 , 11, 0.12};
       Arrays.sort(v);
       
       for (double valor: v){System.out.print(valor +" ");}
       
       int vet[] = {1,7 ,4 ,2 ,5 ,6,7};
       int  p = Arrays.binarySearch(vet, 7);
        System.out.println("\n:"+p+":");
        
        int num[]= new int [5];
        Arrays.fill(num, 9);
        
        for (int valorr:num){System.out.print(valorr);}
}
    
}
