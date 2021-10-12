/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern;

import java.util.ArrayList;

/**
 *
 * @author Mgms
 */
public class WeatherData extends Observable{
    
    private double temperature;
    private double pressure;
    private double humidity;
    
    public WeatherData(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    public double getTemperature() {
        return this.temperature;
    }

    public double getPressure() {
        return this.pressure;
    }

    public double getHumidity() {
        return this.humidity;
    }
    
    @Override
	public void notifyObservers() {
            ArrayList<Observer> observers = super.getObservers();
            observers.forEach(observer -> {
            System.out.println("Notifying Observer");
            observer.update("update parameters are Temperature: "+this.temperature+" Pressure: "+this.pressure+" Humidity: "+this.humidity);
            System.out.println("\n");
	});
		
	}
	
	public void setTemperature(double temperature) {
		this.temperature = temperature;
		this.notifyObservers();
	}

	public void setPressure(double pressure) {
		this.pressure = pressure;
		this.notifyObservers();
	}

	public void setHumidity(double humidity) {
		this.humidity = humidity;
		this.notifyObservers();
	}
    
    
    
    
    
}
