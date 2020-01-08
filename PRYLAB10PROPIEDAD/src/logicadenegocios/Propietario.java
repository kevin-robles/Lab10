/**
 *Clase simple que posee los atributos y métodos respectivos de la clase Propietario.
 *@author Kevin Robles, Oscar Trejos
 * @version 07/01/2020
 */
package logicadenegocios;

public class Propietario {
    
  private String nombreCompleto;
  private String cedula;
  private String telefono;
  private String correo; 
  
  /**
   * Metodo constructor para el propietario de uno o varios Bienes inmuebles
   * @param pNombreCompleto
   * @param pCedula
   * @param pTelefono
   * @param pCorreo 
   */
  public Propietario(String pNombreCompleto, String pCedula, String pTelefono, String pCorreo) {
  this.nombreCompleto = pNombreCompleto;
  this.cedula = pCedula;
  this.telefono = pTelefono;
  this.correo = pCorreo;
  }

  public String getNombreCompleto() {
    return nombreCompleto;
  }

  public void setNombreCompleto(String pNombreCompleto) {
   this.nombreCompleto = pNombreCompleto;
    }

  public String getCedula() {
    return cedula;
  }

  public void setCedula(String pCedula) {
    this.cedula = pCedula;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String pTelefono) {
    this.telefono = pTelefono;
  }

  public String getCorreo() {
    return correo;
  }

  public void setCorreo(String pCorreo) {
    this.correo = pCorreo;
  }
  
  /**
   * Metodo para retornar objeto en cadena de caracteres
   * @return La información del propietario.
   */
  public String toString(){
    String mensaje;
    mensaje = "El nombre completo es: " + getNombreCompleto()+"\n";
    mensaje += "La cédula es: " + getCedula() + "\n";
    mensaje += "El teléfono es: " + getTelefono()+ "\n";
    mensaje += "El correo es: " + getCorreo()+ "\n";
    return mensaje;  
  }
  
    
}
