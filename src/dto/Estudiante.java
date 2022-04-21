/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;
import dto.Nota;
import java.io.Serializable;


/**
 *
 * @author jdcob
 */
public class Estudiante implements Serializable {
   
    private String nombre;
    private String codigo;
     
    
    public String obtenerNombre(){
        return this.nombre;
    }
    public String obtenerCodigo(){
        return this.codigo;
    }
    
    public void modificaNombre(String nombre){
        this.nombre = nombre;
    }
    public void modificaCodigo(String codigo){
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre ;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


    @Override
    public String toString() {
        return "Estudiante:   "+this.nombre+ "\n Codigo:   "+this.codigo;
    }
 
    
  
    

    
   
}
