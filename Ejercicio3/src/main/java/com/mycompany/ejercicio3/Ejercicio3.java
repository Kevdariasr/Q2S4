package com.mycompany.ejercicio3;
import java.util.Scanner;
public class Ejercicio3 {

    private Scanner leer;
    int x,y;
    
    public void inicializar(){
        leer=new Scanner(System.in);
        System.out.println("Ingrese cordenada x : ");
        x=leer.nextInt();
        System.out.println("Ingrese cordenada en y : ");
        y=leer.nextInt();
    }
    
    public void imprimirCuadrante(){
        if (x>0 && y>0){
            System.out.println("Se encuendra en el primer cuadrante.");
        } else{
            if(x<0 && y>0){
            System.out.println("Se encuendra en el segundo cuadrante.");
           } else {
                if(x<0 && y<0){
                    System.out.println("Se encuendra en el tercer cuadrante.");
                } else {
                    if(x>0 && y<0){
                        System.out.println("Se encuendra en el cuarto cuadrante.");
                    } else{
                        System.out.println("El punto no se encuentra.");
                    }
                }
        
        }
    }
 }
   
    public static void main(String[] args) {
        Ejercicio3 cordenadas;
        cordenadas=new Ejercicio3();
        cordenadas.inicializar();
        cordenadas.imprimirCuadrante();
    }
}
