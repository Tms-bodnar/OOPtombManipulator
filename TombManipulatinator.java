/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TombManipulatinator;

/**
 *
 * @author user
 */
public class TombManipulatinator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Tomb tomb1 = new Tomb();
       tomb1.elem(0);
       Sztring szoveg1 = new Sztring("elelele");
       Integr szam = new Integr(2345);
       
       
       tomb1.set(szoveg1, 0);
       tomb1.set(szam, 1);
       tomb1.set(szam.integr(3456), 2);
       tomb1.set(szoveg1.sztring("lalalal"), 3);
       
               
       
        tomb1.kiir();
        tomb1.kiir(3);
        tomb1.get(1);
        tomb1.get(2);
    }
    
}

