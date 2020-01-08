/**
 *Clase padre de bienes inmuebles
 *@author Kevin Robles, Oscar Trejos
 * @version 07/01/2020
 */
package logicadenegocios;
import java.util.ArrayList;
import java.util.Date;

public abstract class BienInmueble {
  protected int numFinca;
  protected double areaTerreno;
  protected double valorMetroCuadrado;
  protected double valorFiscal;
  protected ArrayList<Comentario> comentarios;
  protected Ubicacion ubicacion;
  protected Propietario propietario;
  protected static int cantidadBienInmueble = 0;

  /**
   * Metodo constructor de un Bien inmueble
   * @param pAreaTerreno
   * @param pValorMetroCuadrado
   * @param pValorFiscal
   * @param pUbicacion
   * @param pPropietario 
   */
  public BienInmueble(double pAreaTerreno, double pValorMetroCuadrado, double pValorFiscal, 
    Ubicacion pUbicacion, Propietario pPropietario) {
    this.numFinca = BienInmueble.cantidadBienInmueble;
    this.areaTerreno = pAreaTerreno;
    this.valorMetroCuadrado = pValorMetroCuadrado;
    this.valorFiscal = pValorFiscal;
    this.ubicacion = pUbicacion;
    this.propietario = pPropietario;
    BienInmueble.cantidadBienInmueble ++;
  }

  public int getNumFinca() {
    return numFinca;
  }
  
  public double getAreaTerreno() {
     return areaTerreno;
  }
  
  public void setAreaTerreno(double pAreaTerreno) {
     this.areaTerreno = pAreaTerreno;
  }

  public double getValorMetroCuadrado() {
     return valorMetroCuadrado;
  }

  public void setValorMetroCuadrado(double pValorMetroCuadrado) {
     this.valorMetroCuadrado = pValorMetroCuadrado;
  }

  public double getValorFiscal() {
     return valorFiscal;
  }

  public void setValorFiscal(double pValorFiscal) {
     this.valorFiscal = pValorFiscal;
  }

  public double getNota() {
    if(comentarios.isEmpty()){
      return 100;
    }
    double suma = 0;
    for(Comentario comentario: comentarios){
      suma += comentario.getNota();
    }
    
    return suma / comentarios.size();
  }

  public ArrayList<Comentario> getComentarios() {
     return comentarios;
  }
  
  public void setComentarios(ArrayList<Comentario> pComentarios) {
     this.comentarios = pComentarios;
  }

  public Ubicacion getUbicacion() {
     return ubicacion;
  }

  public void setUbicacion(Ubicacion pUbicacion) {
     this.ubicacion = pUbicacion;
  }
  public Propietario getPropietario() {
     return propietario;
  }

  public void setPropietario(Propietario pPropietario) {
     this.propietario = pPropietario;
  }
  
  /**
   * Metodo abstracto para calcular el precio de la propiedad
   * @return precio del bien inmueble
   */
  public abstract double calcularPrecioPropiedad(); 
  
  /**
   * Método para calcular el impuesto de la propiedad
   * @return Monto del impuesto a pagar
   */
  public double calcularImpuesto(){ 
    return  valorFiscal*1.2;  
  }
  
  
  public void agregarComentario(String pDetalle, int pNota, String pNombreVisitante, Date pFechaVisita){
    this.comentarios.add(new Comentario(pDetalle, pNota, pNombreVisitante, pFechaVisita));
  }
  
  /**
   * Metodo para retornar objeto en cadena de caracteres
   * @return La información del bien inmueble.
   */
  @Override
  public String toString(){
      
    String mensaje;
    mensaje = "\n\nEl número de finca es: " + getNumFinca()+"\n";
    mensaje += "El area del terreno es: " + getAreaTerreno()+ "\n";
    mensaje += "El valor del metro cuadrado es: " + getValorMetroCuadrado()+ "\n";
    mensaje += "El valor fiscal es: " + getValorFiscal()+ "\n";
    mensaje += "La nota es: " + getNota()+ "\n";
    mensaje += "La ubicación es: " + ubicacion.toString()+ "\n";
    mensaje += "La informacion del propietario es: " + propietario.toString()+ "\n";
    for(Comentario comentario : comentarios){
      mensaje += comentario.toString();
    }
    return mensaje;
  
  }
}
