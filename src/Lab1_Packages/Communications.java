/**
 * 
 */
package Lab1_Packages;

import edu.fiu.sysdesign.SelfCheckCapable;

/**
 * this is the communications class
 * handles communications to and from earth
 *
 */
public class Communications implements SelfCheckCapable {
	String antenna;
	String motor;
	
/**
 * operation - Receive Commands from earth
 */
	String ReceieveCommands() {
		return "Command received, processing";
	}
	
/**
 * Operation - transmit data to earth  
 */
	String TransmitData() {
		return "Transmitting Data";
	}
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
