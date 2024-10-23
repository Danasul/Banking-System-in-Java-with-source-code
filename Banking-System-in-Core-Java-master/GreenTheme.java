/**
 * This program defines a custom theme for Java's Metal Look and Feel, named "Greenish".
 * The theme extends the DefaultMetalTheme class and overrides the primary and secondary color schemes with shades of green.
 * It specifies three primary colors and two secondary colors that are used throughout the user interface to give it a greenish appearance.
 * The getName method returns the name of the theme, and the getPrimary1, getPrimary2, getPrimary3, getSecondary2, and getSecondary3 methods 
 * return the custom colors.
 * Author: [Your Name]
 */


import javax.swing.plaf.*;
import javax.swing.plaf.metal.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class GreenTheme extends DefaultMetalTheme {

	public String getName() {

		return "Greenish";
	}

	private final ColorUIResource primary1 = new ColorUIResource(51, 102, 51);
	private final ColorUIResource primary2 = new ColorUIResource(102, 153, 102);
	private final ColorUIResource primary3 = new ColorUIResource(153, 204, 153);
	private final ColorUIResource secondary2 = new ColorUIResource(204, 204, 204);
	private final ColorUIResource secondary3 = new ColorUIResource(150, 200, 150);

	protected ColorUIResource getPrimary1() { return primary1; }
	protected ColorUIResource getPrimary2() { return primary2; }
	protected ColorUIResource getPrimary3() { return primary3; }
	protected ColorUIResource getSecondary2() { return secondary2; }
	protected ColorUIResource getSecondary3() { return secondary3; }

}
