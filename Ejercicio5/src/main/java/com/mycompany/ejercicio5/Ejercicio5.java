package com.mycompany.ejercicio5;
import java.util.Scanner;

public class Ejercicio5 {

    public static Scanner leer;
    
    public static int leernumero(String numero){
        
        int Numero;
        System.out.println("Indique el" + numero + " : ");
        Numero = leer.nextInt();
        return Numero;
    }
    
     public static int sumar(int n1,int n2){
     int suma;
     suma = n1 + n2;
     return suma;
     }
    
    public static int restar(int n1,int n2){
     int restar;
     restar = n1 - n2;
     return restar;
     }
    
    public static int multiplicar(int n1,int n2){
     int multiplicar;
     multiplicar = n1 * n2;
     return multiplicar;
     }
    
    public static float Dividir(int n1,int n2){
     int Dividir;
     Dividir = n1 / n2;
     return Dividir;
     }
    
    public static void Resultados(int S,int R,int M,float D){
        System.out.println("Suma: "+ S);
        System.out.println("Resta: "+ R);
        System.out.println("Multiplicacion: "+ M);
        System.out.println("Dividir: "+ D);
        
    }
    
    
    
    public static void main(String[] args) {
        leer = new Scanner(System.in);
        int n1,n2,op_sumar,op_restar,op_multiplicar;
        float op_divir;
        
        n1 = leernumero("n1");
        n2 = leernumero("n2");
        
        op_sumar = sumar(n1,n2);
        op_restar = restar(n1,n2);
        op_multiplicar = multiplicar(n1,n2);
        op_divir = Dividir(n1,n2);
        
        Resultados(op_sumar,op_restar,op_multiplicar,op_divir);
    }
}
