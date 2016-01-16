/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.agitman.mockito;

import java.util.Random;

/**
 *
 * @author edi
 */
public class Truble {

    public void execute(){
        System.out.println("EXECUTE");
        boolean v = prepare();
        
        if(executeCall() && v){
            System.out.println("condition met executed");
            end();
        }
        System.out.println("FINISH LINE");
    }
    
    protected boolean prepare() {
        System.out.println("Prepare");
        Random r = new Random(System.currentTimeMillis());
        return r.nextBoolean();
    }

    protected boolean executeCall() {
        System.out.println("executeCall");
        Random r = new Random(System.currentTimeMillis());
        Wrapper wrapper = new Wrapper();
        wrapper.doJdbc();
        return r.nextBoolean();
    }

    protected boolean end() {
        System.out.println("END");
        Random r = new Random(System.currentTimeMillis());
        return r.nextBoolean();
    }

}
