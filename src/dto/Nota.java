/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.io.Serializable;




/**
 *
 * @author jdcob
 */
public class Nota implements Serializable {

    private  double larta;
    private  double lanum1;
    private  double lanum2;
    private  double lanum3;
    private  double lanum4;
    private Estudiante elEstudiante;
    private String codigo;
 


    public Nota(Estudiante elEstudiante,double num1, double num2, double num3, double num4) {
        this.elEstudiante = elEstudiante;
        this.codigo = elEstudiante.obtenerCodigo();
        this.lanum1 = num1;
        this.lanum2 = num2;
        this.lanum3 = num3;
        this.lanum4 = num4;
        this.larta = ((num1*0.25)+(num2*0.35)+(num3*0.15)+(num4*0.25));
    }
     public Estudiante obtenerEstudiante(){
        return this.elEstudiante;
    }
     public double obtenerNota1(){
        return this.lanum1;
    }
     public  double obtenerNota2(){
        return this.lanum2;
    }
     public  double obtenerNota3(){
        return this.lanum3;
    }
     public double obtenerNota4(){
        return this.lanum4;
    }
     public  double obtenerNotaT(){
        return this.larta;
    }

    public String getCodigo() {
        return codigo;
    }
     @Override
    public String toString() {
        return ""+this.elEstudiante+"\nTiene como nota final:    "+larta;
    }
}

 
      


  
