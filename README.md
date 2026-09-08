Program Output:

"C:\Program Files\Java\jdk-11.0.31\bin\java.exe" "-javaagent:C:\Program Files\pirate.bay.copy.intellij\IntelliJIdea2023.3\lib\idea_rt.jar=61440:C:\Program Files\pirate.bay.copy.intellij\IntelliJIdea2023.3\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\Joseph\IdeaProjects\Analytical_Balance_Inputs\target\classes;C:\Users\Joseph\.m2\repository\com\fazecast\jSerialComm\2.10.4\jSerialComm-2.10.4.jar;C:\Users\Joseph\.m2\repository\ch\qos\logback\logback-classic\1.4.14\logback-classic-1.4.14.jar;C:\Users\Joseph\.m2\repository\ch\qos\logback\logback-core\1.4.14\logback-core-1.4.14.jar;C:\Users\Joseph\.m2\repository\org\slf4j\slf4j-api\2.0.7\slf4j-api-2.0.7.jar net.sensor.www.Main
18:01:01.900 [main] INFO net.business.logic.www.SerialReader -- 
18:01:01.904 [main] INFO net.business.logic.www.SerialReader -- COM Port Open and Ready...
18:01:01.904 [main] INFO net.business.logic.www.SerialReader -- 
---- METTLER TOLEDO ----
       0.00 g
       2.14 g
       0.00 g
       4.79 g
      -2.13 g

      A volume of roughly 2 mL gives a density of 2.52 and consistent with the density of quartz (a little low). Which broken shards of quartz is the sample that is examined.

⚖️ Analytical Balance Inputs
Java Serial Integration for the Mettler Toledo PB602 Analytical Balance
This project provides a lightweight Java interface for reading serial data from laboratory‑grade analytical balances — specifically the Mettler Toledo PB602, a precision instrument commonly used in chemistry, biology, and engineering labs.

The codebase focuses on stable serial communication, clean parsing, and easy integration with downstream business logic.

📡 Supported Device
Mettler Toledo PB602 Analytical Balance
This project is designed around the PB602’s RS‑232 output format:

9600 baud, 8 data bits, no parity, 1 stop bit (8N1)

Outputs weight readings as formatted ASCII text

Example output:
