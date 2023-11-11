/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AmericanSystemOfMeasuresConverter;

/**
 *
 * @author ameliablack
 */
public class TemperatureConverter extends Converter{ 
    //constructor which call parent counstructors
    public TemperatureConverter() {
        super();
    }
    public TemperatureConverter(double input){
        super(input);
    }
    
    //overridden convert() method to convert input to celsius and returns the value. if instance has no value, it should return double NaN
    public double convert() {
        if(super.getInput()==Double.NaN){
            return Double.NaN;
        }
        else{ // use formula for conversion C = ((F-32)*5)/9
            return((super.getInput()-32.0)*5.0)/9.0;
        }
    }
}
