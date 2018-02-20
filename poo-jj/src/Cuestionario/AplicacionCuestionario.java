/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuestionario;
import java.util.*;
/**
 *
 * @author T-102
 */
public class AplicacionCuestionario {
    
    public static void main(String[] args) {
        //generar opciones
        Opcion op1= new Opcion("Grasa ",false);
        Opcion op2= new Opcion("Contaminacion ",false);
        Opcion op3= new Opcion("Sol ",false);
        Opcion op4= new Opcion("Azucar ..........0",true);
        ArrayList<Opcion> opciones= new ArrayList<>();
        opciones.add(op1);
        opciones.add(op2);
        opciones.add(op3);
        opciones.add(op4);
        
        //generamos preguntas
        Pregunta p1= new Pregunta();
        p1.setTitulo("¿Cual es el principal causante de cancer?");
        p1.setOpciones(opciones);
        
        //generamos el modelo
        ModeloCuestionario modelo= new ModeloCuestionario();
        modelo.agregarPregunta(p1);
        ArrayList<Pregunta> c= modelo.obtenerCuestionario();
        
        //iteremoslo
        for(Pregunta p: c){
            System.out.println(p.getTitulo());
            for(Opcion o: p.getOpciones()){
                System.out.println(o.getTitulo()+ ""+ o.isCorrecta());
            }
        }
    }
    
}
