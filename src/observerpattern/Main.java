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
public class Main {
    public static void main (String[] args) {
        System.out.println("**************Observer Design Pattern********* \n");
        GeneralDisplay general = new GeneralDisplay();
		StatisticsDisplay stat = new StatisticsDisplay();
		ForecastDisplay forecast = new ForecastDisplay();
		
		WeatherData wd = new WeatherData(35, 8, 65);
		wd.addObserver(general);
		wd.addObserver(stat);
		wd.addObserver(forecast);
			
		wd.setTemperature(32);
		wd.setTemperature(25);
		wd.setTemperature(10);
		wd.setHumidity(105);
    }
    
}
