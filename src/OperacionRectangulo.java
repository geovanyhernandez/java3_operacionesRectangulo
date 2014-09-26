import java.util.Scanner; 

public class OperacionRectangulo{

public static void main (String args []){

	double ladoa, ladob, resulp, resula;
	Rectangulo Operaciones = new  Rectangulo;


	Scanner sc = new Scanner(System.in);
	System.out.print("\ingresa el ladoa: ");
	ladoa = sc.nextDouble();
 

	resula = Rectangulo.area();
	resulp = Rectangulo.perimetro();


  System.out.println("la area es : " + resula);  
  System.out.println("el perimetro  es : " + resulp);  


    }
}


