package com.mycompany.semana4ejercicio1;
import java.util.Scanner;
public class Semana4ejercicio1 {

    private Scanner teclado;
    private String nombre;
    private int edad;
    
    public void variables(){
     String nombre="";
        int edad=0;   
    }
    
    public void leervariables(){
        
        teclado=new Scanner(System.in);
        System.out.print("Digite el nombre: ");
        nombre=teclado.next();
        System.out.print("Digite la edad: ");
        edad=teclado.nextInt();
        
    }
   
     public void imprimirpantalla(){
    
      System.out.println("nombre:"+nombre);
      System.out.println("Edad:"+edad);   
         
     }
     
    public void esMayorEdad(){
        
      if(edad>=18){
        System.out.println(nombre+" es mayor de edad.");  
      }  else{
          System.out.println(nombre+" es menor de edad");
      }
     
    } 
     
    public static void main(String[] args) {
        
        Semana4ejercicio1 persona;
        persona=new Semana4ejercicio1();
        persona.variables();
        persona.leervariables();
        persona.imprimirpantalla();
        persona.esMayorEdad();
    
        
    }
    
}
