package ejercicio7;

import java.ultil.Scanner;
public class Main {

public stactic double suma(double n1, double n2){
    return n1 + n2;
  }

  public stactic double Restas(double n1, double n2){
    return n1 - n2;
  }

  public stactic double Multiplicancion(double n1, double n2){
    return n1 * n2;
  }

  public stactic double Division(double n1, double n2){
    return n1 / n2;
  }

  public stactic double Exponenciacion(double n1, double n2){
    return Math.pow(n1, n2);
  }

  public stactic double Radicacion(double n1, double n2){
    return Math.pow(n1, (1/n2));
  }

 public stactic void main (String[] args){
/*Programas que pida dos numeros al usuario y una operacion matematica a ejercutar con esos dos numeros.
 * Las operaciones son:
 * -> Sumas
 * -> Restas (al primero menos el segundo)
 * -> Multiplicancion
 * -> Division (al primero le sobra el segundo)
 * -> Exponenciacion (el primero es la base y el segundo el exponente)
 * -> Radicacion (el primero es el radicando y el segundo es el indice)
 */
 
 Scanner lector = nwe Scanner(System.in);
      
 double n1, n2;
 int opc;
System.out.println("Ingrese el primer numero: ");
n1 = lector.nextDouble();

System.out.println("Ingrese el segundo numero: ");
n2 = lector.nextDouble();

System.out.println("\n1. suma");
System.out.println("2. resta");
System.out.println("3. multiplicacion");
System.out.println("4. Division");
System.out.println("5. Exponenciacion");
System.out.println("6. Radicacion");
System.out.println("Que operacion desea ejecutar?: ");
opc = lector.nextl();

if(opc == 1) {
    System.out.println("La suma es:" + suma(n1, n2) );
} else if(opc == 2 ){
    System.out.println("La resta es:" + resta(n1, n2) );
} else if(opc == 3 ){
    System.out.println("La multiplicacion es:" + multiplicacion(n1, n2) );
} else if(opc == 4 ){
    System.out.println("La Division es:" + Division(n1, n2) );
} else if(opc == 5 ){
    System.out.println("La Exponenciacion es:" + Exponenciacion(n1, n2) );
} else if(opc == 6 ){
    System.out.println("La Radicacion es:" + Radicacion(n1, n2) );
} else {
    System.out.println("ERROR: Ingreso una opcion no valida.");
}

}


   }