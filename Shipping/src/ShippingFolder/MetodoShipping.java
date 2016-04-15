package ShippingFolder;

public class MetodoShipping {


	double MetodoShip(int precio, String Articulo){
		double shipping = (0.05)*(precio) ;
		
		if(Articulo.contentEquals("Libro")){
			shipping = 0;
			return shipping;	
		}
		
		if(precio > 100){
			shipping = 5;	
		}
		
		return shipping;
		
	}
}
