/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serializacion2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import Serializacion.Usuario;

/**
 *
 * @author T-102
 */
public class PersistenciaEmpleado {
ArrayList<Empleado> empleados;

 public PersistenciaEmpleado(){
        empleados= new ArrayList<>();
    }
   public void guardar(Empleado e){
       
       //Para serializar el primer paso es generar el archivo fisico donde estara el
       //objeto tipo usuario      
       
       File file= new File ("empleados.yo");
       
       if(file.exists()){
           empleados=   buscarTodos();
       }
        
//Despues lo abrimos para escribir sobre el
       try{      
       
       FileOutputStream fos=new FileOutputStream(file);
       
       ObjectOutputStream oos=new ObjectOutputStream(fos);
       //guardamos nuestro usuario
       empleados.add(e);
       oos.writeObject(empleados);
       //ponemos un mensajito
       
           System.out.println("Objeto guardsdo con exito!!");
   
       }catch(Exception e){
           System.out.println(e.getMessage());
       }
          //public void setU(Usuario u) {
         // this.u = u;
    }

private static class ArrayList<T> {

        public ArrayList() {
        }

        private void add(Empleado e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    public ArrayList<Empleado> buscarTodos(){
        
        File file=new File ("empleados.yo");
        try{
            FileInputStream fis=new FileInputStream(file);
            ObjectInputStream ois=new ObjectInputStream(fis);
            empleados= (ArrayList<Empleado>) ois.readObject();
        }catch(Exception e){
            
        }
        return empleados;
        
    
}
}
