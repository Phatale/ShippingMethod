package ShippingFolder;

import static org.junit.Assert.*;

import org.junit.Test;

public class MetodoShippingTest {

	@Test
	public void testMetodoShip() {
		
		MetodoShipping test = new MetodoShipping();
		//Probando que Libro > Precio
		double output = test.MetodoShip(500, "Libro");
		//Se toma el delta de 0.0001 ya que el precio tiene que redondearse a 0.00
		assertEquals(0.0,output, 0.0001);
		
		
		//Probando Precio > 100
		double output2 = test.MetodoShip(200, "TV");
		assertEquals(5.0,output2,0.0001);
		
		double output3 = test.MetodoShip(5000000, "Avion");
		assertEquals(5.0,output3,0.0001);
		
		//Probando el Precio < 100
		double output4 = test.MetodoShip(50,"Juego");
		assertEquals(2.50,output4,0.0001);
		
		double output5 = test.MetodoShip(10, "Audifonos");
		assertEquals(0.50,output5,0.0001);

		
		
	}

}
