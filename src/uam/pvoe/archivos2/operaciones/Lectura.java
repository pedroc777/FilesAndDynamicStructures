/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.pvoe.archivos2.operaciones;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import uam.pvoe.archivos2.clases.Alumno;

/**
 *
 * @author pedro
 */
public class Lectura {
    public Alumno leer(String nombreArchivo){
        String cadenaLeida = "";
        FileReader fr;
        BufferedReader archivoLectura;
        
        Alumno alumno2 = new Alumno();
        
        try{
            fr = new FileReader(nombreArchivo);
            archivoLectura = new BufferedReader(fr);
            System.out.println("Los alumnos son: ");
            cadenaLeida = archivoLectura.readLine();
            
            while(cadenaLeida!=null){
                StringTokenizer st = new StringTokenizer(cadenaLeida, ",");
                Alumno alumno = new Alumno();
                alumno.setMatricula(st.nextToken());
                alumno.setNombre(st.nextToken());
                alumno.setProcedencia(st.nextToken());
                alumno.setPuntaje(Integer.parseInt(st.nextToken()));
                
                alumno2 = alumno;
                
                //System.out.println("Alumno: " + alumno.toString());
                
                //System.out.println("Alumno: " + cadenaLeida);
                cadenaLeida = archivoLectura.readLine();
            }
            archivoLectura.close();
        }
        catch(FileNotFoundException ex){
            Logger.getLogger(Lectura.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(IOException ex){
            Logger.getLogger(Lectura.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return alumno2;
    }
}
