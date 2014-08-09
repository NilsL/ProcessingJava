package nilsl.processing.lib.applet;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import processing.core.PApplet;

public class NApplet extends PApplet {
	
	static final Logger logger = LogManager.getLogger(NApplet.class.getName()); 
	
	public void setup(NAppletSettings settings) {
		size(settings.width, settings.height);
		
		logger.trace(String.format("Size set to %d * %d", settings.width, settings.height));
	}
}
