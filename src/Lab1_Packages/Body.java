/**
 * 
 */
package Lab1_Packages;

import javax.print.DocFlavor.STRING;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * The body class contains perseverance's main computer
 * Computer is housed in protective material from Mars' elements 
 */
public abstract class Body {
	STRING bellypan;
	STRING material;
	STRING computer;
	/**
	 * This processes the image data 
	 */
	String ProcessImages() {
		return "Picture Sent";
	}
	/**
	* This processes the video data
	 */
	void ProcessVideos() {
		
	}
	/**
	 * This sends the commands from the body to the systems
	 */
	void SendCommands( ) {
		return;
	}
	
	/**
	 * This process receieves the commands from earth
	 */
	void ReceiveCommands() {
		
	}
	/**
	 * this process is responsible for dropping the samples collected 
	 * the dropping operation is for the next mission
	 */
	void DropSamples( ) {
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "Body";
	}
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.1);
	}
	

}
