/**
 *Clase simple que posee los atributos y métodos respectivos de la clase Edificio.
 *@author Kevin Robles, Oscar Trejos
 * @version 07/01/2020
 */
package logicadenegocios;
import java.util.ArrayList;

public class Edificio extends Construccion{
  private double altura;
  private boolean piscina;
  private boolean rancho;
  private int cantidadParqueoVisitante;
  private ArrayList<Nivel> niveles;

  /**
   * Metodo constructor para Construccion tipo Edificio
   * @param pAreaTerreno
   * @param pValorMetroCuadrado
   * @param pValorFiscal
   * @param pUbicacion
   * @param pPropietario 
   */
  public Edificio(double pAreaTerreno, double pValorMetroCuadrado, double pValorFiscal, 
      Ubicacion pUbicacion, Propietario pPropietario) {
    super(pAreaTerreno, pValorMetroCuadrado, pValorFiscal, pUbicacion, pPropietario);
    this.niveles = new ArrayList<Nivel>();
  }


  public double getAltura() {
    return altura;
  }
  
  public void setAltura(double pAltura) {
    this.altura = pAltura;
  }

  public int getCantidadNiveles() {
    return this.niveles.size();
  }

  public boolean isPiscina() {
    return piscina;
  }
  
  public void setPiscina(boolean pPiscina) {
    this.piscina = pPiscina;
  }

  public boolean isRancho() {
    return rancho;
  }
  
  public void setRancho(boolean pRancho) {
    this.rancho = pRancho;
  }

  public int getCantidadParqueoVisitante() {
    return cantidadParqueoVisitante;
  }
  
  public void setCantidadParqueoVisitante(int pCantidadParqueoVisitante) {
    this.cantidadParqueoVisitante = pCantidadParqueoVisitante;
  }

  public ArrayList<Nivel> getNiveles() {
    return niveles;
  }
  
  /**
   * Metodo para agregar un nivel al edificio
   * @param pCantidadResidencias
   * @param pTipo
   * @param pCantidadMetrosCuadrados
   * @param pCostoMetroComercial
   * @param pCantidadMetrosComunes 
   */
  public void agregarNivel(int pCantidadResidencias, String pTipo, double pCantidadMetrosCuadrados,
      double pCostoMetroComercial, double pCantidadMetrosComunes){
    this.niveles.add(new Nivel(pCantidadResidencias,pTipo,pCantidadMetrosCuadrados,pCostoMetroComercial,
        pCantidadMetrosComunes));
  }
  
  private double getTotalMetrosComerciales(){
    double total = 0;
    for(Nivel nivel:niveles){
      total += nivel.getCantidadMetrosComerciales() * nivel.getCostoMetroComercial();
    }
    return total;
  }

  /**
   * Metodo para calcular el precio del edificio
   * @return precio del edificio
   */
  public double calcularPrecioPropiedad() {
    Double MetroCuadrado = (getValorMetroCuadrado() * getAreaTerreno());
    Double MetroConstruccion = (getValorMetroCuadradoConstruccion() * getAreaConstruccion());
    Double NivelComercial = (getCantidadNiveles() * getTotalMetrosComerciales());
    return MetroCuadrado + MetroConstruccion + NivelComercial ;
  }
  
   /**
   * Metodo para retornar objeto en cadena de caracteres
   * @return La información del bien inmueble.
   */
  public String toString(){
    String mensaje = "";
    mensaje +="Altura: "+getAltura()+"\n";
    mensaje +="Cantidad niveles: "+getCantidadNiveles()+"\n";
    mensaje +="Posee piscina: "+isPiscina()+"\n";
    mensaje +="Posee rancho: "+isRancho()+"\n";
    mensaje +="Precio propiedad: "+calcularPrecioPropiedad()+"\n";
    for(Nivel nivel:niveles){
      mensaje += nivel.toString();
    }
    return mensaje;
  }
    
}
