/**
 *Clase simple que posee los atributos y métodos respectivos de la clase Nivel.
 *@author Kevin Robles, Oscar Trejos
 * @version 07/01/2020
 */
package logicadenegocios;

public class Nivel {
    
  private int cantidadResidencias;
  private String tipo;
  private double cantidadMetrosCuadrados;
  private double costoMetroComercial;
  private double cantidadMetrosComunes;

  public Nivel(int pCantidadResidencias, String pTipo, double pCantidadMetrosCuadrados,
  double pCostoMetroComercial, double pCantidadMetrosComunes) {
    this.cantidadResidencias = pCantidadResidencias;
    this.tipo = pTipo;
    this.cantidadMetrosCuadrados = pCantidadMetrosCuadrados;
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

  public double getCantidadMetrosCuadrados() {
     return cantidadMetrosCuadrados;
  }

  public void setCantidadMetrosCuadrados(double pCantidadMetrosCuadrados) {
     this.cantidadMetrosCuadrados = pCantidadMetrosCuadrados;
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
   * @return La información del nivel.
   */
  @Override
  public String toString(){
    String mensaje;
    mensaje = "La cantidad de residencias es: " + getCantidadResidencias()+"/n";
    mensaje += "La cantidad de metros comerciales es: " + getCostoMetroComercial()+ "/n";
    mensaje += "El tipo es: " + getTipo()+ "n/";
    mensaje += "La cantidad de metros comunes es: " + getCantidadMetrosComunes()+ "/n";
    return mensaje;  
  }
  
  
  
  

    
}
