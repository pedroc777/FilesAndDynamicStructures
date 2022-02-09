/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.pvoe.archivos2.operaciones;

import java.util.LinkedList;
import uam.pvoe.archivos2.clases.Alumno;

/**
 *
 * @author pedro
 */
public class OperacionesLista {
    
    public LinkedList insertarAlumno(LinkedList listaAlumnos, Alumno alumno){
        listaAlumnos.add(alumno);
        return listaAlumnos;
    }
    
    public void imprimirLista(LinkedList lista){
        for(int i = 0; i<lista.size(); i++){
            Alumno al = (Alumno)lista.get(i);
            System.out.println(al.toString());
        }
    }
    
    public Alumno regresarAlumno(LinkedList listaAlumnos, int posicion){
        Alumno al = (Alumno)listaAlumnos.get(posicion);
        return al;
    }
    
    public LinkedList borrarAlumno(LinkedList listaAlumnos, int posicion){
        listaAlumnos.remove(posicion);
        return listaAlumnos;
    }
    
    public int buscarAlumnoMat(LinkedList listaAlumnos, String matricula){
        int posicion = -1;
        for(int i = 0; i<listaAlumnos.size(); i++){
            Alumno al = (Alumno)listaAlumnos.get(i);
            if(al.getMatricula().compareTo(matricula) == 0){
                posicion = i;
                break;
            }
        }
        return posicion;
    }
    public int buscarAlumnoEsc(LinkedList listaAlumnos, String procedencia){
        int posicion = -1;
        for(int i = 0; i<listaAlumnos.size(); i++){
            Alumno al = (Alumno)listaAlumnos.get(i);
            if(al.getProcedencia().compareTo(procedencia) == 0){
                posicion = i;
                break;
            }
        }
        return posicion;
    }
}
