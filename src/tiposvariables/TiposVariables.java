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
public class TiposVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //variables publicas
        VariablesPublicas.estado = "PROCESANDO SOLICITUD";
        VariablesPublicas.identificador = 
                (int) (Math.random() * 100);
        
        System.out.println("La ciudad es " + Constantes.ciudad);
        
        
        if (Constantes.pais.equals ("argentina")){ 
              PorInstancia porinstancia = new PorInstancia ("Alba", "Estudiante");
        }
    }
    
}
