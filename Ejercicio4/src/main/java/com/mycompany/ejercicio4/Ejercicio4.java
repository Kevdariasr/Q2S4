package com.mycompany.ejercicio4;
import java.util.Scanner;

public class Ejercicio4 {

    private Scanner leer;
    int lado;
    public void inicio(){
        leer=new Scanner(System.in);
        System.out.print("ingrese el valor del lado :");
        lado=leer.nextInt();
        
    }
    
    public void Perimetro(){
        
        int perimetro;
        perimetro=lado*4;
        System.out.println("El perimetro es:"+perimetro );
        
    }
    public void Area(){
        
        int area;
        area=lado*lado;
        System.out.println("El area es:"+area );
    }
    
    public static void main(String[] args) {
        
        Ejercicio4 cuadrado1;
        cuadrado1=new Ejercicio4();
        cuadrado1.inicio();
        cuadrado1.Area();
        cuadrado1.Perimetro();
        
    }
}
