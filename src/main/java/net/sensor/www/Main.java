package net.sensor.www;


import net.business.logic.www.SerialReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

/**
 * <h4>Sensor Input for Chem Lab Application</h4>
 * <p>This project is for inputting sensor data into a Maven application.</p>
 * <p>I am beginning a chemistry application that maintains lab records for every experiment, reaction ect.</p>
 * <p>This module, although may not make it to the final application (for the sake of practicing and committing
 * to memory) includes an interface which will decouple the application from any sensor.</p>
 * <p>So this is a simple application that took readings from a Mettler Toledo analytical balance.</p>
 */
public class Main {
    public static void main(String[] args) {

        SerialReader serialReader = new SerialReader("COM3");
        serialReader.openConnection();
        serialReader.readSerialPort();
    }
}