/**
 * 
 */
package Lab1_Packages;

import edu.fiu.sysdesign.SelfCheckCapable;

/**
 * this is the camera class
 *
 */
public class Cameras implements SelfCheckCapable {
	String housing;
	String lenses;
	
/**
 * Operations for camera
 */
	String CaptureImage( ) {
		return "ImageCaptured";
	}
	String CaptureVideo( ) {
		return "VideoCaptured";
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
