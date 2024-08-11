/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication5;
import java.util.Scanner;
/**
 *
 * @author ESTUDIANTE
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner (System.in);
        double Vect [][] = new double [5][4];
        double a, b;
        b=0;
        
        System.out.println("para ingresar numeros decimales utilesi (,) ");
        System.out.println("");
        
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j<= 2; j++){
            System.out.println("ingrese la nota numero "+(j+1)+" de su alumno numero "+(i+1));
            a = sc.nextDouble();
            Vect [i][j] = a;
            b=b+a;
            }   
            Vect [i][3] = (b/3);
            b=0;
            System.out.println(" ");
            System.out.println(" ");
        }
        
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j<= 3; j++){
            System.out.print(Vect [i][j]+"  ");
            }   
            System.out.println("");
        }
        
        System.out.println("");
        System.out.println("");
        System.out.println(":D");
        System.out.println("");
        
        


        
        
    }
    
}
