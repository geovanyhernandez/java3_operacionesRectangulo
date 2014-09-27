import java.util.Scanner;

public class OperacionRectangulo{

public static void main (String[] args ){

double base;
double altura; 

Rectangulo operaciones = new Rectangulo();

Scanner sc = new Scanner(System.in);
System.out.print("\ningresa la altura del rectangulo: ");
altura = sc.nextDouble();


System.out.print("\ningresa la base del rectangulo: ");
base = sc.nextDouble();


operaciones.setBase(base);
operaciones.setAltura(altura);

System.out.println("\nla area es : " + operaciones.superficie());

System.out.println("\nel perimetro es : " + operaciones.perimetro()); 

 }
}
