/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicadenegocios;

import java.util.ArrayList;

/**
 *
 * @author krobl
 */
public abstract class BienInmueble {
    
  protected static int numFinca = 0;
  protected double areaTerreno;
  protected double valorMetroCuadrado;
  protected double valorFiscal;
  protected double nota;
  protected ArrayList<Comentario> comentarios;
  protected Ubicacion ubicacion;
  protected Propietario propietario;

  public BienInmueble(double pAreaTerreno, double pValorMetroCuadrado, double pValorFiscal,
  double pNota, Ubicacion pUbicacion, Propietario pPropietario) {
    this.areaTerreno = pAreaTerreno;
    this.valorMetroCuadrado = pValorMetroCuadrado;
    this.valorFiscal = pValorFiscal;
    this.nota = pNota;
    this.ubicacion = pUbicacion;
    this.propietario = pPropietario;
    BienInmueble.numFinca ++;
  }

  public static int getNumFinca() {
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
     return nota;
  }

  
  public void setNota(double pNota) {
     this.nota = pNota;
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
  
  
  public abstract double calcularPrecioPropiedad(); 
  
  
  public double calcularImpuesto(){ 
    return  valorFiscal*1.2;  
  }
  
  /**
   * @return La información del bien inmueble.
   */
  @Override
  public String toString(){
      
    String mensaje;
    mensaje = "El número de finca es: " + getNumFinca()+"/n";
    mensaje += "El area del terreno es: " + getAreaTerreno()+ "/n";
    mensaje += "El valor del metro cuadrado es: " + getValorMetroCuadrado()+ "n/";
    mensaje += "El valor fiscal es: " + getValorFiscal()+ "/n";
    mensaje += "La nota es: " + getNota()+ "/n";
    mensaje += "La ubicación es: " + ubicacion.toString()+ "/n";
    mensaje += "La informacion del propietario es: " + propietario.toString()+ "/n";
    for(int i = 0;i<comentarios.size();i++){
        Comentario comentario = (Comentario) comentarios.get(i);
        mensaje += comentario.toString();
    }
    return mensaje;
  
  }
  
  
  
  
  
  
  
  
  
  
    
}
