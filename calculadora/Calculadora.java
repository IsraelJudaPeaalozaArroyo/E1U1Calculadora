package calculadora;

import calculadora.Operaciones.Divicion;
import calculadora.Operaciones.Multiplicacion;
import calculadora.Operaciones.Operacion;
import calculadora.Operaciones.Resta;
import calculadora.Operaciones.Suma;
import java.util.ArrayList;
import java.util.Scanner;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.IOException;
        
public class Calculadora {
    static Scanner sc=new Scanner(System.in);
    static ArrayList<Operacion> Operaciones=new ArrayList<Operacion>();
   
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        leermenu();
        
 
    }
    
    public static void leermenu() throws IOException{
        
        InputStreamReader flujoEntrada=new InputStreamReader(System.in);
        BufferedReader teclado=new BufferedReader(flujoEntrada);
        
        int tipo;
        String continuar="si";
        //do{
        while(continuar.equals("si")){
            do{
                 System.out.println("*********************************************************************** ");
                System.out.println("Elige el tipo de Operacion que quieres realizar");
                System.out.println("1. Suma: ");
                System.out.println("2. Resta: ");
                System.out.println("3. Multiplicacion: ");
                System.out.println("4. Division: ");
                
             
                tipo=sc.nextInt();
                
            } while (tipo<1||tipo>5);
            if (tipo !=5){
                switch(tipo){
                    case 1:
                        leersuma();
                        break;
                    case 2:
                        leerresta();
                        break;
                    case 3:
                        leermultiplicacion();
                        break;
                    case 4:
                        leerdivicion();
                        break;
                }
            }
            System.out.println("Deseas continuar con las operaciones Si/No ");
            continuar=teclado.readLine();
        }
        //} while(tipo!=5);   
    }
    
    
   public static void leersuma(){
       double uno,dos;       
       System.out.println("*********************************************************************** ");
       System.out.println("Introduce los datos a sumar");
       System.out.println("Numero 1: ");
       uno=sc.nextDouble();
       System.out.println("Numero 2: ");
       dos=sc.nextDouble();
       
       Suma s=new Suma(uno,dos);
       Operaciones.add(s);       
       for(Operacion p: Operaciones){            
            //System.out.print(p.toString());
            System.out.println( p.toString());
        }
       
       
    } 
    
  public static void leerresta(){
       double uno,dos;
       System.out.println("*********************************************************************** ");
       System.out.println("Introduce los datos a restar");
       System.out.println("Numero 1: ");
       uno=sc.nextDouble();
       System.out.println("Numero 2: ");
       dos=sc.nextDouble();
       
       Resta r=new Resta(uno,dos);
       Operaciones.add(r);      
       for(Operacion p: Operaciones){            
            //System.out.print(p.toString());
            System.out.println( p.toString());
        }
    } 
   
  public static void leermultiplicacion(){
       double uno,dos;
       System.out.println("*********************************************************************** ");
       System.out.println("Introduce los datos a multiplicar");
       System.out.println("Numero 1: ");
       uno=sc.nextDouble();
       System.out.println("Numero 2: ");
       dos=sc.nextDouble();
       
       Multiplicacion m=new Multiplicacion(uno,dos);
       Operaciones.add(m);       
       for(Operacion p: Operaciones){
            //System.out.print(p.toString());
            System.out.println( p.toString());
        }
    } 
   
  public static void leerdivicion(){
       double uno,dos;
       System.out.println("*********************************************************************** ");
       System.out.println("Introduce los datos a dividir");
       System.out.println("Numero dentro de la casita: ");
       uno=sc.nextDouble();
       System.out.println("Numero fuera de la casita: ");
       dos=sc.nextDouble();
       
       Divicion d=new Divicion(uno,dos);
       Operaciones.add(d);      
       for(Operacion p: Operaciones){            
            //System.out.print(p.toString());
            System.out.println( p.toString());
        }
    }   
}
