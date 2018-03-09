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
public class Usuario implements Serializable{
    
    int edad;
    String nombre;
    
    public Usuario(){
        
    }

    public int getEdad() {
        return edad;
    }

    public Usuario(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    } 
}
    

