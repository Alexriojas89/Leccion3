/**
 * 
 */

/**
 * @author Alex
 *
 */
public class Leccion3 {

	/**
	 * 
	 */
	public Leccion3() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String modelo[]={"jetta","borra","golf","passat","beetle"};

int a�o[];
a�o= new int[5];
a�o [0]=2007;
a�o [1]=2008;
a�o [2]=2009;
a�o [3]=2010;
a�o [4]=2011;
 
  String comprador[];
  comprador= new String[5];
  comprador[0]="Francisco Gerte";
  comprador[1]="Alma Madero";
  comprador[2]="Monica Galindo";
  comprador[3]="Lalo N, Ganiza";
  comprador[4]="Susana Horia";

 int num_serie;
 int malos_num=0;
 
 for (num_serie=0;num_serie<modelo.length;num_serie++) {
	 
	 if  (modelo[num_serie]!="borra") {
     malos_num=num_serie;
     
     if( a�o[malos_num]>=2009){
    	 
System.out.println("El modelo "+modelo[num_serie]+" a�o "+a�o[malos_num]+" con numero de series "+ num_serie+" esta en mal estado, es necesario llamar al cliente "+ comprador[malos_num]);
     }
	      }
 }
}
}
