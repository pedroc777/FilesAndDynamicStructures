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
    public LinkedList regresarAlumnoEsc(LinkedList listaAlumnos, int posicion){
        LinkedList<Alumno> lista1 = new LinkedList<Alumno>();
        for(int i = 0; i<posicion; i++){
           Alumno al = (Alumno)listaAlumnos.get(posicion);
           lista1.add(al);
        }
        return lista1;
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
    
    public static void mostrarAlumnoEsc(LinkedList lista, String procedencia){
        
        System.out.println("Students from school " + procedencia + 
                " are the following:\n");
        for(int i = 0; i<lista.size(); i++){
                Alumno al = (Alumno)lista.get(i);
                if(al.getProcedencia().compareTo(procedencia) == 0){
                    System.out.println(al.toString());
                }
            }
    }
    
    public static void mostrarPuntaje(LinkedList lista, int puntaje){
        System.out.println("Students with score close to " + puntaje + 
                " are the following:\n");
        for(int i = 0; i < lista.size(); i++){
            Alumno al = (Alumno)lista.get(i);
            if(al.getPuntaje() >= puntaje){
                System.out.println(al.toString());
            }
        }
    }
}
