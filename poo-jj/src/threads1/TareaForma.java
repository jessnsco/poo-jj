/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads1;

/**
 *
 * @author T-102
 */
public class TareaForma {
    public static void main(String[] args) {
        
        Thread t1=new Thread(new Runnable(){
            public void run(){
                System.out.println("Yo soy un thread bueno");
                
            } // se cierra el metodo run
        }//se cierra la interfaz autonoma
        ); //se cierra el constructor
t1.start();
}
}



