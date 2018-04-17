/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ete;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
/**
 *
 * @author T-102
 */
public class PersistenciaAlumno {
    ArrayList<Alumno> alumnos;
    public PersistenciaAlumno(){
        alumno=new ArrayList<>();
    }
    
    public ArrayList<Alumno> leerTodos(){
        File file=new File("alumnos");
        try{
            FileInputStream fis=new FileInputStream(file);
            ObjectInputStream ois=new ObjectInputStream(fis);
            
            //leemos lo guardado
            alumnos= (ArrayList<Alumo>) ois.readObject();
        }catch(Exception e){
            System.out.println("Esto ocurrio al leer" +e.getMessage());
        }
        return alumnos;
    }
    //guardar
    public void guardar(Alumno alumno){
        try{
            File file=new File ("alumnos");
            if(file.exist())alumnos=leerTodos();
            FileOutputStream fos=new FileOutputStream(file);
            ObjectOutputStream ops=new ObjectOutStream(fos);
            //primero agregamos al arraylist
            alumnos.add(alumno);
            //ahora si volvemos a guardar todo el arraylist 
        }
    }
}
