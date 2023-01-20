/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

import java.util.Scanner;

/**
 *
 * @author Bryan Carcamo
 */
public class Lab1P1_BryanCarcamo {
    public static void main(String[] args) {
        Scanner lea = new Scanner (System.in);
        
    int opcion =0;
    
    while(opcion != 4){
        System.out.println("---Menu--");
        System.out.println("1.Socios");
        System.out.println("2.Determinar Mayor");
        System.out.println("3.Triangulo o no");
        System.out.println("4.Salir");
        System.out.println("Opcion: ");
        opcion=lea.nextInt();
        
        if(opcion==1){
        int grado=-1;
        float total=0.0f;
        int repetir=1;
        
        while(repetir!=0){
            System.out.println("Ingrese el grado del socio: ");
            grado=lea.nextInt();
            System.out.println("Ingrese el total de la compra: ");
            total=lea.nextFloat();
            
            if (grado==0){
            total=total;
            }else if(grado == 1){
            total=0.9f*total;
            }else if(grado ==2){
            total=0.85f*total;
            }else if(grado == 3){
            total=0.75f*total;
            }else{
                System.out.println("El grado ingresado no es valido");
            }
            System.out.println("Total a pagar: "+total);    
            System.out.println("Desea calcular el total a pagar de otro cliente? [1/0]");
            repetir=lea.nextInt();
        }
        }
        else if(opcion ==2){
        
            int mayor=0;
            System.out.println("Ingrese un numero: ");
            int numero=lea.nextInt();
            
            System.out.println("Desea ingresar otro numero? [1/0]");
            int pregunta=lea.nextInt();
            
            while(pregunta !=0){
                System.out.println("Ingrese un numero: ");
                numero=lea.nextInt();
                
              System.out.println("Desea ingresar otro numero? [1/0]");
               pregunta=lea.nextInt();  
            
                
            }
            if(numero>=mayor){
            mayor=numero;
            }
            
            System.out.println("El numero mayor es: "+mayor);
            
        }
        
        else if(opcion ==3){
            int a,b,c=0;
            int pregunta=2;
            while(pregunta!=0){
            System.out.println("Ingrese a: ");
            a=lea.nextInt();
            System.out.println("Ingrese b: ");
            b=lea.nextInt();
            System.out.println("Ingrese c: ");
            c=lea.nextInt();
            
            if(a<b+c && b<a+c && c<a+b){
                System.out.println("Los lados ingresados SI forman un triangulo ");
            }else{
                System.out.println("Los lados ingresados NO forman un triangulo ");
            }
            
            System.out.println("Desea ingresar otros datos? [1/0]");
            pregunta=lea.nextInt();
            
        }
        }
        else if(opcion == 4){
            System.out.println("Feliz dia");
        }else{
            System.out.println("La opcion ingresada no es valida");
        }
    }
        
    }
   
}
