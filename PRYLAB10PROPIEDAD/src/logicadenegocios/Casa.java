/**
 *Clase para objetos tipo Casa
 *@author Kevin Robles, Oscar Trejos
 * @version 07/01/2020
 */
package logicadenegocios;

public class Casa extends Construccion{
  private int numeroCasa;
  private String color;

  /**
   * Metodo constructor para las construcciones tipo Casa
   * @param pAreaTerreno
   * @param pValorMetroCuadrado
   * @param pValorFiscal
   * @param pUbicacion
   * @param pPropietario
   */
  public Casa(double pAreaTerreno, double pValorMetroCuadrado, double pValorFiscal, 
      Ubicacion pUbicacion, Propietario pPropietario) {
    super(pAreaTerreno, pValorMetroCuadrado, pValorFiscal, pUbicacion, pPropietario);
  }

  public int getNumeroCasa() {
    return numeroCasa;
  }
  
  public void setNumeroCasa(int pNumeroCasa) {
    this.numeroCasa = pNumeroCasa;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String pColor) {
    this.color = pColor;
  }
  
  /**
   * Metodo para calcular el precio de la casa
   * @return precio de la casa
   */
  public double calcularPrecioPropiedad() {
    Double MetroCuadrado = (getValorMetroCuadrado() * getAreaTerreno());
    Double MetroConstruccion = (getValorMetroCuadradoConstruccion() * getAreaConstruccion());
    return MetroCuadrado + MetroConstruccion;
  }
  
    /**
   * Metodo para retornar objeto en cadena de caracteres
   * @return La información del bien inmueble.
   */
  public String toString(){
    String mensaje = "";
    mensaje +="Número de casa:"+getNumeroCasa()+"\n";
    mensaje +="Color: "+getColor()+"\n";
    mensaje +="Precio propiedad: "+calcularPrecioPropiedad()+"\n";
    return mensaje;
  }
}
