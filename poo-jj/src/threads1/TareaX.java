/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads1;

/**
 *
 * @author T-102
 * primera forma de crear un Thread
 * heredando la clase Thread
 */ 
public class TareaX extends Thread {
    @Override
    public void run(){
        System.out.println("Soy un Thread muy sencillo" +
                "y me llamo"+ Thread.currentThread().getName());
    }
}
