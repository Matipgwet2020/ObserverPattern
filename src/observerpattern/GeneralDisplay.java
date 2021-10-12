/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern;

/**
 *
 * @author Mgms
 */
public class GeneralDisplay implements Observer {
    
     @Override
    public void update (String message) {
        System.out.println("---------General Display-----------");
	System.out.println(message);
    }
    
    public void display() {
        
    }
    
}
