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
public class Sztring extends Tomb{
    protected String text;

    public Sztring() {
    }

    public Sztring(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    public Sztring sztring(String text){
        Sztring sztring = new Sztring(text);
        
        return sztring;
    }
    public String getSztring(){
        return text;
    }
    @Override
    public void kiir() {
        System.out.println(text);  
    }
    
    
}
