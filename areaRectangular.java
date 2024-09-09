/*Calcular el area,perimetro de un rectangulo */

import java.util.Scanner;

public class areaRectangular{
  Run|Debug
  /**
   * @param args
   */
  public static void main(String[] args) 
  {
 Scanner input = new Scanner(System.in);
  float area,perimetro,base,altura;
  System.out.println(x:"Ingresa la base del rectangulo");
  base = input.nextFloat();
  System.out.println(x:"Ingresa la altura");
  altura = input.nextFloat();
  area = base * altura;
  perimetro = (base + altura) * 2;
  System.out.println(x:"El area del rectangulo es: "+area+" cm2");
 System.out.println(x:"El perimetro es: "+perimetro+" cm ");
 input.close();
    }
}