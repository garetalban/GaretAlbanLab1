/**
 * 
 */
package Lab1_Packages;

import edu.fiu.sysdesign.SelfCheckCapable;

/**
 * this is the arm class
 *sub class for this would be the SampleTaking.java
 */
public class Arm implements SelfCheckCapable {
	String length;
	String Tools;
	String motors;
	String joints;
	
/**
 * operations - sample grabbing
 */
	String GrabSample( ) {
		return "Sample Grabbed";
	}
/**
 * operation - store sample	
 */
	String StoreSample() {
		return "Sample Stored Safely";
	}
/**
 * Operation - move sample could also be drop sample	
 */
	String MoveSample() {
		return "Sample Cache Moved/Dropped";
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
