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
  protected int valorFiscal;
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
  public BienInmueble(double pAreaTerreno, double pValorMetroCuadrado, int pValorFiscal, 
    Ubicacion pUbicacion, Propietario pPropietario) {
    this.numFinca = BienInmueble.cantidadBienInmueble;
    this.areaTerreno = pAreaTerreno;
    this.valorMetroCuadrado = pValorMetroCuadrado;
    this.valorFiscal = pValorFiscal;
    this.ubicacion = pUbicacion;
    this.propietario = pPropietario;
    BienInmueble.cantidadBienInmueble ++;
    this.comentarios = new ArrayList<Comentario>();
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

  public int getValorFiscal() {
     return valorFiscal;
  }

  public void setValorFiscal(int pValorFiscal) {
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
    String mensaje = "\n\n\tINFORMACIÓN DE BIEN INMUEBLE";
    mensaje += "\nNúmero de finca: " + getNumFinca()+"\n";
    mensaje += "Tipo Bien Inmueble: "+getClass().getSimpleName()+"\n";
    mensaje += "Área del terreno: " + getAreaTerreno()+ "m²\n";
    mensaje += "Valor del metro cuadrado: ₡" + getValorMetroCuadrado()+ "\n";
    mensaje += "Valor fiscal: ₡" + getValorFiscal()+ "\n";
    mensaje += "Nota: " + getNota()+ "\n";
    mensaje += "Ubicación: \n" + ubicacion.toString()+ "\n";
    mensaje += "Propietario: \n" + propietario.toString()+ "\n";
    mensaje += "Comentarios: \n";
    int contador = 1;
    for(Comentario comentario : comentarios){
      mensaje += "#"+contador;
      contador++;
      mensaje += comentario.toString();
    }
    mensaje += "\n";
    return mensaje;
  
  }
}
