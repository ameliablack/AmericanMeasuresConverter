/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AmericanSystemOfMeasuresConverter;

/**
 *
 * @author AliDemirUG
 */
public class WeightConverter extends Converter{ 
    //constructors which call parent counstructors
    public WeightConverter() {
        super();
    }
    public WeightConverter(double input){
        super(input);
    }
    
    //overridden convert() method to convert input to kilograms and returns the value. if instance has no value, it should return double NaN
    public double convert() {
        if(super.getInput()==Double.NaN){
            return Double.NaN;
        }
        else{ // use formula for conversion kg = lb * 0.4535924
            return super.getInput() * 0.4535924;
        }
    }
}
