/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposprimitivos;

import java.util.Scanner;



/**
 *
 * @author anton
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Nome do Aluno E : ");
        String nome = teclado.nextLine();
        
        System.out.printf("Digite a nota de %s :",nome);
        float nota = (float)teclado.nextFloat();
        nota = nota/2;
        System.out.printf("*  A nota de  %s E : %.1f  *\n",nome ,nota);
        
       
    }
    
}
