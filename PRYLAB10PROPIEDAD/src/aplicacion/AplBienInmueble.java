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
  BienInmueble bienInmueble2 = new Lote(1400,20000,33000000,ubicacion4,propietario3,"montañoso");
  BienInmueble bienInmueble3 = new Lote(2300,12000,51000000,ubicacion5,propietario2,"quebrado");
  
  BienInmueble bienInmueble4 = new Casa(450,35000,15750000,ubicacion2,propietario4);//Faltan los sets nada mas
  BienInmueble bienInmueble5 = new Casa(750,60000,35600000,ubicacion1,propietario5);
  BienInmueble bienInmueble6 = new Casa(600,72000,45120000,ubicacion3,propietario1);
  
  
  BienInmueble bienInmueble7 = new Edificio(4500,50000,80000000,ubicacion4,propietario2);
  BienInmueble bienInmueble8 = new Edificio(8000,78000,95000000,ubicacion2,propietario3);
  BienInmueble bienInmueble9 = new Edificio(3200,78000,31000000,ubicacion3,propietario4);

  
  BienInmueble bienInmueble10 = new CentroComercial(2000,45000,16000000,ubicacion1,propietario2);
  BienInmueble bienInmueble11 = new CentroComercial(1800,78000,14000000,ubicacion3,propietario5);  
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
