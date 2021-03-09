/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

/**
 *
 * @author Alan
 */
public class Tarea_Alumno1 {
    
   public double base;
   public double altura;
   
   public Tarea_Alumno1(double b, double a){
       this.base = b;
       this.altura=a;
   }
   
   // ejemplo de método con errores
   public int mul(int a, int b){
       int c = 0;
       int cont = 0;
       cont++;
       
       while(cont<10){
           c = c+(a*b);
       }
       return c;
   }
   
   public double calculaperimetro(){
       double perimetro;
       perimetro = this.altura*this.base;
       return perimetro;
   }
    
}
