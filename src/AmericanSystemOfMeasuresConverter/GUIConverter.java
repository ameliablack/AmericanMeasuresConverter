/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AmericanSystemOfMeasuresConverter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ameliablack
 */
public class GUIConverter {
    public GUIConverter(){
    // use JFrame and JPanel
    JFrame frame = new JFrame("Converter");
    frame.setLayout(new FlowLayout());
    JPanel panel = new JPanel();
    
    // GUI will have 4 buttons:"Distance Converter", "Temperature Converter", "Weight Converter" and "Exit"
    JButton distance = new JButton("Distance Converter");
    JButton temp = new JButton("Temperature Converter");
    JButton weight = new JButton("Weight Converter");
    JButton leave = new JButton("Exit");
    
    // once user clicks ok, message dialog will pop up
    panel.add(distance);
    panel.add(temp);
    panel.add(weight);
    panel.add(leave);
    frame.add(panel);
    frame.setLayout(new FlowLayout());
    frame.setSize(600,100);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    
        // when user clicks distnace converter, an input dialog will pop up where user can type value anf click OK:
        distance.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
           String str = JOptionPane.showInputDialog("Enter Distance In Miles: ");
           Double miles = Double.parseDouble(str);
           DistanceConverter obj = new DistanceConverter(miles);
           JOptionPane.showMessageDialog(frame,"Distance in KM is " + obj.convert());
        }
        });
    
        // when user clicks on temperature button, an inpit dialog will pop up to input value and then when clicks ok, the message dialog with popup with converted result
        temp.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            String str = JOptionPane.showInputDialog("Enter Temperature In Fahrenheit: ");
            Double con = Double.parseDouble(str);
            TemperatureConverter obj = new TemperatureConverter(con);
            JOptionPane.showMessageDialog(frame,"Temperature in Celsius is " + obj.convert());
        }
        });

        // when user clicks on weight converter, an input dialog will pop up to input value followed by another pop up showing the result
        weight.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            String str = JOptionPane.showInputDialog("Enter Weight In Pounds: ");
            Double pounds = Double.parseDouble(str);
            WeightConverter obj = new WeightConverter(pounds);
            JOptionPane.showMessageDialog(frame, "Weight in kilograms is " + obj.convert());
        }    
        });
        
        
        // when user clocks Exit, the program will terminate
        leave.addActionListener(new ActionListener(){
        @Override 
        public void actionPerformed(ActionEvent e){
        System.exit(0);
        }
        });}
    
    //main method
    public static void main(String[] args){
        new GUIConverter();
    }

}

 
