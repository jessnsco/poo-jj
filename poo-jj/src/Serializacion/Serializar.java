/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serializacion;
import java.io.*;
/**
 *
 * @author T-102
 */
public class Serializar {
    
    public static void main (String[] args){
    
    
   Usuario u=new Usuario(20, "Pedro ");
   
   
   PersistenciaUsuario p=new PersistenciaUsuario();
   
   p.setU(u);
   
   p.guardar();
}
}
