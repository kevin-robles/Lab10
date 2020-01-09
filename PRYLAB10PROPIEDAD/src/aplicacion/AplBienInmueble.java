/**
 * Clase que inicia la aplicacion
 *
 * @author Kevin Robles, Oscar Trejos
 * @version 06/01/2020
 */
package aplicacion;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;
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

    //LOTES
    Lote lote1 = new Lote(700,150000,45000000,ubicacion1,propietario1,"plano");
    lote1.agregarComentario("Visita para posible compra", 95, "Juan Quiros", new Date(ThreadLocalRandom.current().nextInt() * 1000L));
    lote1.agregarComentario("Visita de municipalidad", 90, "Daniel Martinez", new Date(ThreadLocalRandom.current().nextInt() * 1000L));

    Lote lote2 = new Lote(1400,20000,33000000,ubicacion4,propietario3,"montañoso");
    lote2.agregarComentario("Chequeo mensual", 100, "Reinaldo Jimenez", new Date(ThreadLocalRandom.current().nextInt() * 1000L));
    lote2.agregarComentario("Visita de amigo", 95, "Luis Marin", new Date(ThreadLocalRandom.current().nextInt() * 1000L));

    Lote lote3 = new Lote(2300,12000,51000000,ubicacion5,propietario2,"quebrado");
    lote3.agregarComentario("Visita del perito", 100, "Oscar Figueroa", new Date(ThreadLocalRandom.current().nextInt() * 1000L));
    lote3.agregarComentario("Visita para posible compra", 95, "Ricardo Montero", new Date(ThreadLocalRandom.current().nextInt() * 1000L));


    //CASAS
    Casa casa1 = new Casa(450,35000,15750000,ubicacion2,propietario4);
    casa1.setAreaConstruccion(200);
    casa1.setCantidadEspacioParqueo(10);
    casa1.setEstiloConstruccion("gótico");
    casa1.setValorMetroCuadradoConstruccion(60000);
    casa1.setFechaConstruccion(new Date(ThreadLocalRandom.current().nextInt() * 1000L));
    casa1.setColor("Blanco");
    casa1.setNumeroCasa(1);
    casa1.agregarComentario("Visita para posible renta", 80, "Cesar Esquivel", new Date(ThreadLocalRandom.current().nextInt() * 1000L));

    Casa casa2 = new Casa(750,60000,35600000,ubicacion1,propietario5);
    casa2.setAreaConstruccion(500);
    casa2.setCantidadEspacioParqueo(3);
    casa2.setEstiloConstruccion("contemporáneo");
    casa2.setValorMetroCuadradoConstruccion(55000);
    casa2.setFechaConstruccion(new Date(ThreadLocalRandom.current().nextInt() * 1000L));
    casa2.setColor("Azul");
    casa2.setNumeroCasa(2);
    casa2.agregarComentario("Visita para posible compra", 80, "Guillermo Rojas", new Date(ThreadLocalRandom.current().nextInt() * 1000L));

    Casa casa3 = new Casa(600,72000,45120000,ubicacion3,propietario1);
    casa3.setAreaConstruccion(400);
    casa3.setCantidadEspacioParqueo(10);
    casa3.setEstiloConstruccion("barroco");
    casa3.setValorMetroCuadradoConstruccion(25000);
    casa3.setFechaConstruccion(new Date(ThreadLocalRandom.current().nextInt() * 1000L));
    casa3.setColor("Ladrillo");
    casa3.setNumeroCasa(3);
    casa3.agregarComentario("Visita para posible cambio", 100, "Carlos Rodriguez", new Date(ThreadLocalRandom.current().nextInt() * 1000L));

    //EDIFICIOS
    Edificio edificio1 = new Edificio(4500,50000,80000000,ubicacion4,propietario2);
    edificio1.setAreaConstruccion(1000);
    edificio1.setCantidadEspacioParqueo(200);
    edificio1.setEstiloConstruccion("modernista");
    edificio1.setValorMetroCuadradoConstruccion(100000);
    edificio1.setFechaConstruccion(new Date(ThreadLocalRandom.current().nextInt() * 1000L));
    edificio1.setAltura(100);
    edificio1.setPiscina(true);
    edificio1.setRancho(true);
    edificio1.setCantidadParqueoVisitante(15);
    edificio1.agregarNivel(10, "comercial ", 500, 110000, 100);
    edificio1.agregarNivel(10, "comercial ", 450, 99000, 100);
    edificio1.agregarNivel(15, "residencial", 300, 75000, 50);
    edificio1.agregarComentario("Visita para posible renta de apartamento", 70, "Jimena Solano", new Date(ThreadLocalRandom.current().nextInt() * 1000L));


    Edificio edificio2 = new Edificio(8000,78000,95000000,ubicacion2,propietario3);
    edificio2.setAreaConstruccion(5000);
    edificio2.setCantidadEspacioParqueo(500);
    edificio2.setEstiloConstruccion("Art-Deco");
    edificio2.setValorMetroCuadradoConstruccion(300000);
    edificio2.setFechaConstruccion(new Date(ThreadLocalRandom.current().nextInt() * 1000L));
    edificio2.setAltura(250);
    edificio2.setPiscina(false);
    edificio2.setRancho(true);
    edificio2.setCantidadParqueoVisitante(60);
    edificio2.agregarNivel(30, "residencial", 2000, 10000, 1000);
    edificio2.agregarNivel(45, "residencial", 2000, 99999, 1000);
    edificio2.agregarNivel(40, "comercial", 2000, 55000, 1000);
    edificio2.agregarComentario("Visita para posible compra de apartamento", 93, "Manuel Serrano", new Date(ThreadLocalRandom.current().nextInt() * 1000L));

    //CENTROS COMERCIALES
    CentroComercial centroComercial1 = new CentroComercial(2000,45000,16000000,ubicacion1,propietario2);
    centroComercial1.setAreaConstruccion(1500);
    centroComercial1.setCantidadEspacioParqueo(350);
    centroComercial1.setEstiloConstruccion("gótico");
    centroComercial1.setValorMetroCuadradoConstruccion(30000);
    centroComercial1.setFechaConstruccion(new Date(ThreadLocalRandom.current().nextInt() * 1000L));
    centroComercial1.setCantidadTiendas(100);
    centroComercial1.setCantidadSalasCine(10);
    centroComercial1.setNombreCine("Cinepolis");
    centroComercial1.agregarComentario("Visita para posible alquiler de tienda", 90, "Josue Medrano", new Date(ThreadLocalRandom.current().nextInt() * 1000L));

    CentroComercial centroComercial2 = new CentroComercial(1800,78000,14000000,ubicacion3,propietario5);  
    centroComercial2.setAreaConstruccion(1200);
    centroComercial2.setCantidadEspacioParqueo(450);
    centroComercial2.setEstiloConstruccion("barroco");
    centroComercial2.setValorMetroCuadradoConstruccion(90000);
    centroComercial2.setFechaConstruccion(new Date(ThreadLocalRandom.current().nextInt() * 1000L));
    centroComercial2.setCantidadTiendas(85);
    centroComercial2.setCantidadSalasCine(5);
    centroComercial2.setNombreCine("Nova Cinemas");
    centroComercial2.agregarComentario("Visita para posible nuevo negocio", 89, "Raul Salas", new Date(ThreadLocalRandom.current().nextInt() * 1000L));

    bienesInmuebles.add(lote1);
    bienesInmuebles.add(lote2);
    bienesInmuebles.add(lote3);
    bienesInmuebles.add(casa1);
    bienesInmuebles.add(casa2);
    bienesInmuebles.add(casa3);
    bienesInmuebles.add(edificio1);
    bienesInmuebles.add(edificio2);
    bienesInmuebles.add(centroComercial1);
    bienesInmuebles.add(centroComercial2);

    int totalCartera = 0;
    int totalImpuestos = 0;
    for(BienInmueble bienInmueble :bienesInmuebles){
      System.out.println(bienInmueble.toString());
      totalCartera += bienInmueble.getValorFiscal();
      totalImpuestos += bienInmueble.calcularImpuesto();
    }
    System.out.println("\n\nEl valor total de la cartera de propiedades registradas es: ₡"+totalCartera);
    System.out.println("El valor total a pagar de impuestos es: ₡"+totalImpuestos);
  }
}
