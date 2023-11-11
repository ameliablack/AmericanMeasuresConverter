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
public class DistanceConverter extends Converter{
    //constructers whical call on parent constructors 
    public DistanceConverter(){
        super();
    }
    public DistanceConverter(double input){
        super(input);
    }
    
    //overriden convert method to convert input (distance in miles) to distance in kiloneters and returns the value. If the instance has no input value, it should return double nan,
    public double convert(){
        if(super.getInput() == Double.NaN)
        {
            return Double.NaN;
        }
        else{   // use formula KM=M*1.609
            return super.getInput()*1.609;
        }
    }
}
