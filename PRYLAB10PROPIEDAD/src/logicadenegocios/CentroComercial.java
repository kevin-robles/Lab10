/**
 *Clase simple que posee los atributos y métodos respectivos de la clase Centro Comercial.
 *@author Kevin Robles, Oscar Trejos
 * @version 07/01/2020
 */
package logicadenegocios;

public class CentroComercial extends Construccion{
  private int cantidadTiendas;
  private int cantidadSalasCine;
  private String nombreCine;

  /**
   * Metodo constructor para las construcciones tipo Centro Comercial
   * @param pAreaTerreno
   * @param pValorMetroCuadrado
   * @param pValorFiscal
   * @param pUbicacion
   * @param pPropietario 
   */
  public CentroComercial(double pAreaTerreno, double pValorMetroCuadrado, int pValorFiscal, 
      Ubicacion pUbicacion, Propietario pPropietario) {
    super(pAreaTerreno, pValorMetroCuadrado, pValorFiscal, pUbicacion, pPropietario);
  }

  public int getCantidadTiendas() {
    return cantidadTiendas;
  }
  
  public void setCantidadTiendas(int pCantidadTiendas) {
    this.cantidadTiendas = pCantidadTiendas;
  }

  public int getCantidadSalasCine() {
    return cantidadSalasCine;
  }
  
  public void setCantidadSalasCine(int pCantidadSalasCine) {
    this.cantidadSalasCine = pCantidadSalasCine;
  }

  public String getNombreCine() {
    return nombreCine;
  }

  public void setNombreCine(String pNombreCine) {
    this.nombreCine = pNombreCine;
  }
  
  /**
   * Metodo para calcular el precio del centro comercial
   * @return precio del centro comercial
   */
  public double calcularPrecioPropiedad() {
    if(getValorFiscal() > 580000000){
      return getValorFiscal() * 1.32;
    }
    else if(getValorFiscal() >= 340000000 && getValorFiscal() <= 580000000){
      return getValorFiscal() * 1.12;
    }
    else{
      return getValorFiscal();
    }
  }
  
  /**
   * Metodo para retornar objeto en cadena de caracteres
   * @return La información del bien inmueble.
   */
  public String toString(){
    String mensaje = "";
    mensaje += "Cantidad tiendas: "+getCantidadTiendas()+"\n";
    mensaje += "Nombre cadena de cine: "+getNombreCine()+"\n";
    mensaje += "Cantidad de salas de cine: "+getCantidadSalasCine()+"\n";
    mensaje +="Precio propiedad: "+calcularPrecioPropiedad()+"\n";
    return mensaje;
  }
  
}
