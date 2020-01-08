/**
 * Clase que inicia la aplicacion
 *
 * @author Kevin Robles, Oscar Trejos
 * @version 06/01/2020
 */
package aplicacion;
import java.util.ArrayList;
import logicadenegocios.BienInmueble;
import logicadenegocios.Casa;
import logicadenegocios.CentroComercial;
import logicadenegocios.Edificio;
import logicadenegocios.Lote;
import logicadenegocios.Propietario;
import logicadenegocios.Ubicacion;

public class AplBienInmueble {
    
  public static void main(String[] args) {
    ArrayList<BienInmueble> bienesInmuebles = new ArrayList<BienInmueble>();
  
//  Propietario propietario1 = new Propietario();
//  Propietario propietario2 = new Propietario();
//  Propietario propietario3 = new Propietario();
//  
//  Ubicacion ubicacion1 = new Ubicacion();
//  Ubicacion ubicacion1 = new Ubicacion();
//  
//  
//  BienInmueble bienInmueble1 = new Lote();
//  BienInmueble bienInmueble2 = new Lote();
//  BienInmueble bienInmueble3 = new Lote();
//  BienInmueble bienInmueble4 = new Casa();
//  BienInmueble bienInmueble5 = new Casa();
//  BienInmueble bienInmueble6 = new Casa();
//  BienInmueble bienInmueble7 = new Edificio();
//  BienInmueble bienInmueble8 = new Edificio();
//  BienInmueble bienInmueble9 = new CentroComercial();
//  BienInmueble bienInmueble10 = new CentroComercial();  
//  
//  bienesInmuebles.add(bienInmueble1);
//  bienesInmuebles.add(bienInmueble2);
//  bienesInmuebles.add(bienInmueble3);
//  bienesInmuebles.add(bienInmueble4);
//  bienesInmuebles.add(bienInmueble5);
//  bienesInmuebles.add(bienInmueble6);
//  bienesInmuebles.add(bienInmueble7);
//  bienesInmuebles.add(bienInmueble8);
//  bienesInmuebles.add(bienInmueble9);
//  bienesInmuebles.add(bienInmueble10);
    double totalCartera = 0;
    double totalImpuestos = 0;
    for(BienInmueble bienInmueble :bienesInmuebles){
      bienInmueble.toString();
      totalCartera += bienInmueble.getValorFiscal();
      totalImpuestos += bienInmueble.calcularImpuesto();
    }
    System.out.println("\n\nEl valor total de la cartera de propiedades registradas es: "+totalCartera);
    System.out.println("El valor total a pagar de impuestos es: "+totalImpuestos);
  }
}
