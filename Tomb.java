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
public class Tomb {

    Tomb[] tomb = new Tomb[0];

    public Tomb() {
    }

    public Tomb(Tomb[] tomb) {
        this.tomb = tomb;
    }

    public Tomb[] elem(int meret) {
        Tomb[] ujTomb = new Tomb[meret];
        tomb = ujTomb;
        return tomb;
    }

    public void set(Tomb elem, int index) {
        if (index < tomb.length - 1) {
            Tomb[] ujTomb = new Tomb[index + 1];
            for (int i = 0; i < ujTomb.length; i++) {
                ujTomb[i] = tomb[i];
            }
            ujTomb[ujTomb.length - 1] = elem;
            tomb = ujTomb;
        }
        if (index >= tomb.length) {
            Tomb[] ujTomb = new Tomb[index + 1];
            for (int i = 0; i < tomb.length; i++) {
                ujTomb[i] = tomb[i];
            }
            ujTomb[ujTomb.length - 1] = elem;
            tomb = ujTomb;
        } else {
            for (int i = 0; i < tomb.length; i++) {
                if (i == index) {
                    tomb[i] = elem;
                }
            }
        }
    }
    
    public void get(int index){
        
           if (tomb[index] instanceof Integr) {
               Integr integr = (Integr) tomb[index];
               ((Integr) tomb[index]).getInt();
               System.out.println(((Integr) tomb[index]).getInt());
           }
           if (tomb[index] instanceof Sztring) {
               Sztring sztring = (Sztring) tomb[index];
               ((Sztring) tomb[index]).getSztring();
               System.out.println(((Sztring) tomb[index]).getSztring());
           }      
        
    }
    
    public void kiir() {
        System.out.println("Az elemek: ");
        for (Tomb elem : tomb) {
            elem.kiir();
        }
    }

    public void kiir(int index) {
        System.out.println("Ez az eleme: ");
        tomb[index].kiir();
    }
}
