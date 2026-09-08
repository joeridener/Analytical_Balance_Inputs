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
