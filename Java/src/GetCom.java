import com.fazecast.jSerialComm.SerialPort;
public class GetCom {
    public static void main(String[] args) {
        SerialPort[] ports = SerialPort.getCommPorts();
        for (SerialPort port : ports) {
            String portName = port.getDescriptivePortName();
            if (portName.contains("Qualcomm") && portName.contains("MDM")) {
				System.out.println(port.getSystemPortName());
	    }
        }
    }
}
