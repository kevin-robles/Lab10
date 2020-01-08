/**
 *Clase simple que posee los atributos y métodos respectivos de la clase Nivel.
 *@author Kevin Robles, Oscar Trejos
 * @version 07/01/2020
 */
package logicadenegocios;

public class Nivel {
    
  private int cantidadResidencias;
  private String tipo;
  private double cantidadMetrosComerciales;
  private double costoMetroComercial;
  private double cantidadMetrosComunes;

  /**
   * Metodo constructor para un Nivel que pertenece a un Edificio
   * @param pCantidadResidencias
   * @param pTipo
   * @param pCantidadMetrosCuadrados
   * @param pCostoMetroComercial
   * @param pCantidadMetrosComunes 
   */
  public Nivel(int pCantidadResidencias, String pTipo, double pCantidadMetrosComerciales,
      double pCostoMetroComercial, double pCantidadMetrosComunes) {
    this.cantidadResidencias = pCantidadResidencias;
    this.tipo = pTipo;
    this.cantidadMetrosComerciales = pCantidadMetrosComerciales;
    this.costoMetroComercial = pCostoMetroComercial;
    this.cantidadMetrosComunes = pCantidadMetrosComunes;
   }

  public int getCantidadResidencias() {
    return cantidadResidencias;
  }

  public void setCantidadResidencias(int pCantidadResidencias) {
    this.cantidadResidencias = pCantidadResidencias;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String pTipo) {
    this.tipo = pTipo;
  }

  public double getCantidadMetrosComerciales() {
    return cantidadMetrosComerciales;
  }

  public void setCantidadMetrosComerciales(double pCantidadMetrosComerciales) {
    this.cantidadMetrosComerciales = pCantidadMetrosComerciales;
  }

  public double getCostoMetroComercial() {
    return costoMetroComercial;
  }

  public void setCostoMetroComercial(double pCostoMetroComercial) {
    this.costoMetroComercial = pCostoMetroComercial;
  }

  public double getCantidadMetrosComunes() {
    return cantidadMetrosComunes;
  }

  public void setCantidadMetrosComunes(double pCantidadMetrosComunes) {
    this.cantidadMetrosComunes = pCantidadMetrosComunes;
  }
  
  /**
   * Metodo para retornar objeto en cadena de caracteres
   * @return La información del nivel.
   */
  public String toString(){
    String mensaje;
    mensaje = "La cantidad de residencias es: " + getCantidadResidencias()+"\n";
    mensaje += "La cantidad de metros comerciales es: " + getCostoMetroComercial()+ "\n";
    mensaje += "El tipo es: " + getTipo()+ "\n";
    mensaje += "La cantidad de metros comunes es: " + getCantidadMetrosComunes()+ "\n";
    return mensaje;  
  }
  
  
  
  

    
}
