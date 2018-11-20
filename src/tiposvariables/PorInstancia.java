/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposvariables;

/**
 *
 * @author alba
 */
public class PorInstancia {
    
    private String nombre;
    private String trabajo;
    
    //constructor
    public PorInstancia (String nombre, String trabajo){
        this.nombre = nombre;
        this.trabajo = trabajo;
        
    }
    public String getNombre() {
    return nombre;
}
    public void SetNombre(String nombre){
       this.nombre = nombre;
    }
      public String getTrabajo() {
    return trabajo;
    }
      public void SetTrabajo(String nombre){
       this.trabajo = trabajo;
    }
}
