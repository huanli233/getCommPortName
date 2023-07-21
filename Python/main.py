import serial.tools.list_ports
ports = serial.tools.list_ports.comports()
for port in ports:
    if ("Qualcomm" in port.manufacturer or "Qualcomm" in port.description) and ("MDM" in port.manufacturer or "MDM" in port.description):
        print(port.device)