/**
 *Clase simple que posee los atributos y métodos respectivos de la clase Comentario.
 *@author Kevin Robles, Oscar Trejos
 * @version 07/01/2020
 */
package logicadenegocios;
import java.util.Date;

/**
 *
 * @author Oscar Andres
 */
public class Comentario {
    
  private String detalle;
  private int nota;
  private String nombreVisitante;
  private Date fechaVisita; 

  public Comentario(String pDetalle, int pNota, String pNombreVisitante, Date pFechaVisita) {
    this.detalle = pDetalle;
    this.nota = pNota;
    this.nombreVisitante = pNombreVisitante;
    this.fechaVisita = pFechaVisita;
  }

  public String getDetalle() {
    return detalle;
  }

  public void setDetalle(String pDetalle) {
    this.detalle = pDetalle;
  }

  public int getNota() {
    return nota;
  }

  public void setNota(int pNota) {
    this.nota = pNota;
  }

  public String getNombreVisitante() {
    return nombreVisitante;
  }

  public void setNombreVisitante(String pNombreVisitante) {
    this.nombreVisitante = pNombreVisitante;
  }

  public Date getFechaVisita() {
    return fechaVisita;
  }

  public void setFechaVisita(Date pFechaVisita) {
    this.fechaVisita = pFechaVisita;
  }
  
  
  /**
   * @return La información de la clase.
   */
  @Override
  public String toString(){
    String mensaje;
    mensaje = "El detalle es: " + getDetalle()+"/n";
    mensaje += "La nota es: " + getNota()+ "/n";
    mensaje += "El nombre del visitante es: " + getNombreVisitante()+ "n/";
    mensaje += "La fecha de visita es: " + getFechaVisita()+ "/n";
    return mensaje;  
  }
  
    
}
