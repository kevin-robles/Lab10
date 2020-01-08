/**
 *Clase para bienes inmuebles tipo Lote
 *@author Kevin Robles, Oscar Trejos
 * @version 07/01/2020
 */
package logicadenegocios;

public class Lote extends BienInmueble{
  private String tipoTopografia;

  /**
   * Metodo constructor
   * @param pAreaTerreno
   * @param pValorMetroCuadrado
   * @param pValorFiscal
   * @param pUbicacion
   * @param pPropietario
   * @param pTipoTopograficia 
   */
  public Lote(double pAreaTerreno, double pValorMetroCuadrado, double pValorFiscal, 
      Ubicacion pUbicacion, Propietario pPropietario,String pTipoTopograficia) {
    super(pAreaTerreno, pValorMetroCuadrado, pValorFiscal, pUbicacion, pPropietario);
    this.tipoTopografia = pTipoTopograficia;
  }

  public String getTipoTopografia() {
    return tipoTopografia;
  }

  public void setTipoTopografia(String tipoTopografia) {
    this.tipoTopografia = tipoTopografia;
  }
  
  /**
   * Metodo para calcular el precio del lote
   * @return precio del lote
   */
  public double calcularPrecioPropiedad() {
    double precio = getValorMetroCuadrado() * getAreaTerreno();
    if(getTipoTopografia().equals("Quebrado") || getTipoTopografia().equals("Montañoso")){
      precio -= precio*0.8;
    }
    return precio;
  }
  
  /**
   * Metodo para representar el objeto en cadena de caracteres
   * @return objeto en cadena de caracteres
   */
  public String toString(){
    String mensaje = "Tipo topografia: "+getTipoTopografia()+"\n";
    mensaje +="Precio propiedad: "+calcularPrecioPropiedad()+"\n";
    return mensaje;
  }
    
}
