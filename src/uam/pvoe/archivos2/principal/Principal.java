/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.pvoe.archivos2.principal;

import java.util.LinkedList;
import java.util.Scanner;
import uam.pvoe.archivos2.clases.Alumno;
import uam.pvoe.archivos2.operaciones.Lectura;
import uam.pvoe.archivos2.operaciones.OperacionesLista;

/**
 *
 * @author pedro
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String [] args) {
        Alumno a = new Alumno();
        LinkedList lista = new LinkedList();
        Scanner sc = new Scanner(System.in);
        
        a = procesarArchivo();
        
        lista = insertarAlumno(lista, a);
        //imprimirLista(lista);
        
        System.out.println("1. Buscar un alumno por matrícula");
        System.out.println("2. Buscar alumnos por escuela");
        System.out.println("3. Buscar alumnos por puntaje superior");
        System.out.println("4. Borrar un alumno por matrícula");
        int opcion = sc.nextInt();
        
        if(opcion == 1){
            System.out.println("Dame la matrícula");
            String m = sc.nextLine();
            buscarAlumnoMat(lista, m);
        }
        else if(opcion == 2){
            System.out.println("Dame la Escuela");
            String p = sc.nextLine();
            buscarAlumnoEsc(lista, p);
        }
        
    }
    
    
    //métodos
    public static Alumno procesarArchivo(){
        Alumno a = new Alumno();
        Lectura lectura = new Lectura();
        a = lectura.leer("alumnos.dat");
        return a;
    }
    
    public static LinkedList insertarAlumno(LinkedList lista, Alumno alumno){
        OperacionesLista operaciones = new OperacionesLista();
       
        lista = operaciones.insertarAlumno(lista, alumno);
        
        return lista;
    }
    public static void imprimirLista(LinkedList lista){
        OperacionesLista operaciones = new OperacionesLista();
        operaciones.imprimirLista(lista);
    }
    
    public static int buscarAlumnoMat(LinkedList lista, String matricula){
        OperacionesLista operaciones = new OperacionesLista();
        int posicion;
        
        posicion = operaciones.buscarAlumnoMat(lista, matricula);
        return posicion;
    }
    
    public static int buscarAlumnoEsc(LinkedList lista, String procedencia){
        OperacionesLista operaciones = new OperacionesLista();
        int posicion;
        
        posicion = operaciones.buscarAlumnoMat(lista, procedencia);
        return posicion;
    }
}
