package net.business.logic.www;

import com.fazecast.jSerialComm.SerialPort;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * <h4>Mettler Toledo Analytical Balance Sensor Input Source Code File</h4>
 * This is the main source code file of the simple application. It reads the given input from a Mettler Toledo
 * analytical balance.
 */
public class SerialReader {

    private SerialPort port;
    private Logger logger = LoggerFactory.getLogger(SerialReader.class);

    /**
     * <p>Class constructor with one argument in the parameter list. Takes a string argument as a parameter that
     * depending on device and USB port provides identification of
     * the correct USB port to read.</p>
     * @param comPort
     */
    public SerialReader(String comPort){

        port = SerialPort.getCommPort(comPort);
        port.setBaudRate(9600);
        port.setNumDataBits(7);
        port.setParity(SerialPort.EVEN_PARITY);
        port.setNumStopBits(SerialPort.ONE_STOP_BIT);

    }

    /**
     * <p>DataInputStream is the most convenient io stream to use. Method readByte() is best due
     * to pre-formattng of Enc type. The Mettler Toledo only sends data under certain circumstances and I
     * use class SerialPort's byteAvailable() to test when data is available from sensor.</p>
     */
    public void readSerialPort()
    {

        DataInputStream dataInputStream = new DataInputStream(port.getInputStream());

        try {

            while( true ){
                if(port.bytesAvailable()>0){
                    byte b = dataInputStream.readByte();
                    System.out.print((char)b);
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally{
            try {
                dataInputStream.close();
                port.closePort();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /**
     * Attempts to open the configured COM port and logs the result.
     *
     * <p>This method calls {@code port.openPort()} to establish a serial
     * connection. If the port opens successfully, informational log messages
     * are recorded indicating that the COM port is ready. If the port fails
     * to open, error log messages are recorded to assist with diagnosing
     * connection issues.</p>
     *
     * <p>No exceptions are thrown directly from this method; all connection
     * failures are handled through logging.</p>
     */
    public void openConnection() {
        if (this.port.openPort()) {
            logger.info("");
            logger.info("COM Port Open and Ready...");
            logger.info("");
        } else {
            logger.error("");
            logger.error("COM Port Connection Failed...");
            logger.error("");
        }
    }

}
