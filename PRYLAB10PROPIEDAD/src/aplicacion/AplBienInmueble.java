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
  
  Propietario propietario1 = new Propietario("Oscar Trejos","117680317","86634888","oscar@gmail.com");
  Propietario propietario2 = new Propietario("Kevin Robles","375478877","84557899","kevin@gmail.com");
  Propietario propietario3 = new Propietario("Daniel Alberto","58774412","86554211","daniel@gmail.com");
  Propietario propietario4 = new Propietario("Ronaldo Cristiano","33458877","85669877","cr7@gmail.com");
  Propietario propietario5 = new Propietario("Maria Perez","22451176","54778966","marip@gmail.com");

  
  Ubicacion ubicacion1 = new Ubicacion("San Jose","Curridabat","Tirrases","400 sur del pali");
  Ubicacion ubicacion2 = new Ubicacion("Heredia","San Rafael","Concepcion","Del restaurante la paz 100 este");
  Ubicacion ubicacion3 = new Ubicacion("Alajuela","Alajuela","La Garita","De la lecheria 400 oeste");
  Ubicacion ubicacion4 = new Ubicacion("Heredia","Flores","San Joaquín","Del parque municipal 250 este");
  Ubicacion ubicacion5 = new Ubicacion("Alajuela","Alajuela","Sabanilla"," 100 este de la farmacia la bomba");  
  
  
  BienInmueble bienInmueble1 = new Lote(700,150000,45000000,ubicacion1,propietario1,"plano");
//  BienInmueble bienInmueble2 = new Lote(1400,,45000000,ubicacion1,propietario1,"plano");
//  BienInmueble bienInmueble3 = new Lote(700,150000,45000000,ubicacion1,propietario1,"plano");
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
