/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Mgms
 */
public class Observable {
   
    private ArrayList<Observer> observers = new ArrayList<Observer>();

    public void addObserver(Observer obj) {
        observers.add(obj);
        
    }
    
    public void deleteObserver(Observer obj) {
        observers.remove(obj);
    }
    
    public void notifyObservers(){
        for (Iterator iterator = observers.iterator(); iterator.hasNext();) {
            System.out.println("Notifying Observer");
           
            Observer observer = (Observer) iterator.next();

            observer.update("Update successful");
              
	}
        
    }
    public void setChanged() {
    }

    public ArrayList<Observer> getObservers() {
        return this.observers;
    }
    
    
}
