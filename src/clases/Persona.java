/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

/**
 *
 * @author jparedes2
 */
public class Persona {
    private long identificacion;
    private String primer_nombre;
    private String primer_apellido;
    private String genero;
    
    public Persona(long identificacion, String primer_nombre, String primer_apellido, String genero)
    {
      this.identificacion = identificacion;
      this.primer_nombre = primer_nombre;
      this.primer_apellido = primer_apellido;
      this.genero= genero;
    }
    
    public long getIdentificacion()
    {
        return identificacion;
    }

    public String getPrimer_nombre() 
    {
        return primer_nombre;
    }

    public String getPrimer_apellido() 
    {
        return primer_apellido;
    }
    public String getgenero ()
    {
        return genero;
    }
    
    public void setgenero (String genero)
    {
        this.genero= genero;
    }
    public void setprimer_Nombre(String primer_nombre)
    {
        this.primer_nombre= primer_nombre;
    }
    
    public void setprimer_Apellido(String primer_apellido)
    {
        this.primer_apellido= primer_apellido;
    }
    
    public void setidentificacion(Long identificacion)
    {
        this.identificacion= identificacion;
    }
    
}
