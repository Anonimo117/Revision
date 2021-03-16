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
public class Tarea_Alumno2 {
       public double base;
   public double altura;
   
   public Tarea_Alumno2(double b, double a){
       this.base = b;
       this.altura=a;
   }
   
   // ejemplo de método sin error 
   public int mul(int a, int b){
       int cont = 0;
       
       for(int i=0;i<b;i++){
           cont=cont+a;
       }
       return cont;
       
   }
   
   public double calculaperimetro(){
       double perimetro;
       perimetro = this.altura*this.base;
       return perimetro;
   }
}
