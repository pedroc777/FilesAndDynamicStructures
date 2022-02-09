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
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import uam.pvoe.archivos2.clases.Alumno;

/**
 *
 * @author pedro
 */
public class Lectura {
    public LinkedList leer(String nombreArchivo){
        String cadenaLeida = "";
        FileReader fr;
        BufferedReader archivoLectura;
        
        LinkedList<Alumno> lista1 = new LinkedList<Alumno>();
        
        try{
            fr = new FileReader(nombreArchivo);
            archivoLectura = new BufferedReader(fr);
            cadenaLeida = archivoLectura.readLine();
            
            while(cadenaLeida!=null){
                StringTokenizer st = new StringTokenizer(cadenaLeida, ",");
                Alumno alumno = new Alumno();
                alumno.setMatricula(st.nextToken());
                alumno.setNombre(st.nextToken());
                alumno.setProcedencia(st.nextToken());
                alumno.setPuntaje(Integer.parseInt(st.nextToken()));
                lista1.add(alumno);
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
        return lista1;
    }
}
