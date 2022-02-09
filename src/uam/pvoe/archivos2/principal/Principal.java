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
        LinkedList<Alumno> lista1 = new LinkedList<Alumno>();
        Scanner sc = new Scanner(System.in);
        
        lista1 = procesarArchivo();
       
        System.out.println("Pick one of the next options:\n");
        System.out.println("1. Look for a student by registration number\n");
        System.out.println("2. Look for a student by school name\n");
        System.out.println("3. Look for a student by score\n");
        System.out.println("4. Delete a student using registration number\n");
        System.out.println("5. Exit\n\n");
        int n = sc.nextInt();
        
        Scanner zc = new Scanner(System.in);
        if(n == 1){
            System.out.println("Write the registration number\n");
            String camp = zc.nextLine();
            mostrarAlumno(lista1, camp);
        }
        else if(n == 2){
            System.out.println("Write the school name\n");
            String camp = zc.nextLine();
            mostrarAlumnoEsc(lista1, camp);
        }
        else if(n == 3){
            System.out.println("Write the score\n");
            int camp = zc.nextInt();
            mostrarPuntaje(lista1, camp);
        }
        else if(n == 4){
            System.out.println("Write the registration number\n");
            String camp = zc.nextLine();
            borrarAlumno(lista1, camp);
            imprimirLista(lista1);
        }
        else if(n == 5){
            System.out.println("Thanks for using this program. Come back soon!");
        }
    }
    
    
    //métodos
    public static LinkedList procesarArchivo(){
        LinkedList<Alumno> lista1 = new LinkedList<Alumno>();
        Lectura lectura = new Lectura();
        lista1 = lectura.leer("alumnos.dat");
        return lista1;
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
    
    
    public static void mostrarAlumno(LinkedList lista, String matricula){
        OperacionesLista operaciones = new OperacionesLista();
        int posicion;
        posicion = buscarAlumnoMat(lista, matricula);
        
        if(posicion < 0){
            System.out.println("El alumno no existe");
        }
        else{
            Alumno alu = operaciones.regresarAlumno(lista, posicion);
            System.out.println("Sus datos son: " + alu.toString());
        }
    }
    
    
    public static void mostrarAlumnoEsc(LinkedList lista, String procedencia){
        OperacionesLista operaciones = new OperacionesLista();
        operaciones.mostrarAlumnoEsc(lista, procedencia);
    }
    
    
    public static void mostrarPuntaje(LinkedList lista, int puntaje){
        OperacionesLista operaciones = new OperacionesLista();
        operaciones.mostrarPuntaje(lista, puntaje);
    }
    
    
    public static LinkedList borrarAlumno(LinkedList lista, String matricula){
        OperacionesLista operaciones = new OperacionesLista();
        int posicion;
        
        posicion = buscarAlumnoMat(lista, matricula);
        
        if(posicion < 0){
            System.out.println("No existe el alumno");
        }
        else{
            lista = operaciones.borrarAlumno(lista, posicion);
        }
        return lista;
    }
}
