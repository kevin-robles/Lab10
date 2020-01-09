/**
 *Clase padre de bienes con construccion, que a su vez es clase hija de BienInmueble
 *@author Kevin Robles, Oscar Trejos
 * @version 07/01/2020
 */
package logicadenegocios;
import java.util.Date;

public abstract class Construccion extends BienInmueble{
  protected double areaConstruccion;
  protected int cantidadEspacioParqueo;
  protected String estiloConstruccion;
  protected double valorMetroCuadradoConstruccion;
  protected Date fechaConstruccion;

    /**
   * Metodo constructor para un bien inmueble con construccion
   * @param pAreaTerreno
   * @param pValorMetroCuadrado
   * @param pValorFiscal
   * @param pUbicacion
   * @param pPropietario 
   */
  public Construccion(double pAreaTerreno, double pValorMetroCuadrado, int pValorFiscal, Ubicacion pUbicacion, Propietario pPropietario) {
    super(pAreaTerreno, pValorMetroCuadrado, pValorFiscal, pUbicacion, pPropietario);
  }

  public double getAreaConstruccion() {
    return areaConstruccion;
  }
  
  public void setAreaConstruccion(double pAreaConstruccion) {
    this.areaConstruccion = pAreaConstruccion;
  }

  public int getCantidadEspacioParqueo() {
    return cantidadEspacioParqueo;
  }
  
  public void setCantidadEspacioParqueo(int pCantidadEspacioParqueo) {
    this.cantidadEspacioParqueo = pCantidadEspacioParqueo;
  }

  public String getEstiloConstruccion() {
    return estiloConstruccion;
  }
  
  public void setEstiloConstruccion(String pEstiloConstruccion) {
    this.estiloConstruccion = pEstiloConstruccion;
  }

  public double getValorMetroCuadradoConstruccion() {
    return valorMetroCuadradoConstruccion;
  }
  
  public void setValorMetroCuadradoConstruccion(double pValorMetroCuadradoConstruccion) {
    this.valorMetroCuadradoConstruccion = pValorMetroCuadradoConstruccion;
  }

  public Date getFechaConstruccion() {
    return fechaConstruccion;
  }

  public void setFechaConstruccion(Date pFechaConstruccion) {
    this.fechaConstruccion = pFechaConstruccion;
  }
  
   /**
   * Metodo para retornar objeto en cadena de caracteres
   * @return La información del bien inmueble.
   */
  @Override
  public String toString(){
    String mensaje = "";
    mensaje += super.toString();
    mensaje += "Área de construcción: "+getAreaConstruccion()+"m²\n";
    mensaje += "Valor metro cuadrado de construcción: ₡"+getValorMetroCuadradoConstruccion()+"\n";
    mensaje += "Cantidad de espacios para parqueo: "+getCantidadEspacioParqueo()+"\n";
    mensaje += "Estilo de construcción: "+getEstiloConstruccion()+"\n";
    mensaje += "Fecha de construcción: "+getFechaConstruccion()+"\n";
    return mensaje;
  }

}
