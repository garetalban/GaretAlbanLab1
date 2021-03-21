/**
 * 
 */
package Lab1_Packages;

import edu.fiu.sysdesign.SelfCheckCapable;

/**
 * this is a sub class of the arm class
 * handles the sample taking which is controlled and attached to the arm
 *
 */
public class SampleTaking implements SelfCheckCapable {
	String drillbit;
	String container;
	String tubes;
	
/**
 * operation - drill
 */
	String Drill() {
		return "Sampling";
	}
	
	
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Hello Earth";
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
