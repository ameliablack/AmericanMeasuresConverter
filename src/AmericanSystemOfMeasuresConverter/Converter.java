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
public class Converter {
    //private attribute for input of data type double
    private double input;
    
    //default constructor w no parameter which sets input to double nan
    public Converter(){
        this.input = input;
    }

    //overloaded constructor
    public Converter(double input){
        this.input = input;
    }
    
    //get and set methods for input parameter
    public double getInput(){
        return this.input;
    }
    public void setInput(double input){
        this.input = input;
    }
    
    //method convert() which returns input value
    public double convert(){
        return this.input;
    }
}
