/**
 *Clase simple que posee los atributos y métodos respectivos de la clase Ubicacion.
 *@author Kevin Robles, Oscar Trejos
 * @version 07/01/2020
 */
package logicadenegocios;

public class Ubicacion {
    
  private String provincia;
  private String canton;
  private String distrito;
  private String direccionExacta;

  /**
   * Método constructor.
   * @param pProvincia
   * @param pCanton
   * @param pDistrito
   * @param pDireccionExacta 
   */
  public Ubicacion(String pProvincia, String pCanton, String pDistrito
  ,String pDireccionExacta){
   this.provincia = pProvincia;
   this.canton = pCanton;
   this.distrito = pDistrito;
   this.direccionExacta = pDireccionExacta;     
  }

   public String getProvincia() {
     return provincia;
   }

   public void setProvincia(String pProvincia) {
     this.provincia = pProvincia;
   }

   public String getCanton() {
     return canton;
   }

   public void setCanton(String pCanton) {
     this.canton = pCanton;
   }

   public String getDistrito() {
     return distrito;
   }

   public void setDistrito(String pDistrito) {
     this.distrito = pDistrito;
   }

   public String getDireccionExacta() {
     return direccionExacta;
   }

   public void setDireccionExacta(String pDireccionExacta) {
     this.direccionExacta = pDireccionExacta;
   }  
  
  /**
   * @return La información de la clase.
   */
  @Override
  public String toString(){
    String mensaje;
    mensaje = "La provincia es: " + getProvincia()+"/n";
    mensaje += "El canton es: " + getCanton() + "/n";
    mensaje += "El distrito es: " + getDistrito() + "n/";
    mensaje += "La dirección exacta es: " + getDireccionExacta() + "/n";
    return mensaje;  
  }
   
  
}
