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
public class Integr extends Tomb{
    private int integr;

    public Integr() {
    }

    public Integr(int integr) {
        this.integr = integr;
    }

    public int getIntegr() {
        return integr;
    }

    public void setIntegr(int integr) {
        this.integr = integr;
    }
    public Integr integr(int szam){
        Integr integr = new Integr(szam);
        
        return integr;
        
    }
    public int getInt(){
        return integr;
    }
    @Override
    public void kiir() {
        System.out.println(integr);    }
}
