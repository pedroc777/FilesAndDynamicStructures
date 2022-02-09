/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.pvoe.archivos2.clases;

/**
 *
 * @author pedro
 */
public class Alumno {
    private String matricula;
    private String nombre;
    private String procedencia;
    private int puntaje;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    @Override
    public String toString() {
        return 
               "\nMatricula: " + matricula + 
               "\nNombre: " + nombre + 
               "\nProcedencia: " + procedencia + 
               "\nPuntaje:" + puntaje + "\n";
    }

    
    
    
}
