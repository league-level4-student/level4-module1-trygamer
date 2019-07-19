package _05_Enum_Stuff;


import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	

	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	
	Zodiac z = Zodiac.AQUARIUS;
	
JLabel drumLabelWithImage;

	

	JLabel drum;

	

public void Horos(Zodiac z) {
	
	//They can also be used in a switch statement
	switch(z) {
	// Notice that 'DataTypes.' is not requires when accessing categories
	case ARIES :{
		System.out.println("INT");
		
		break;
	}
	case TAURUS:{
		System.out.println("DOUBLE");
		break;
	}
	case GEMINI:{
		System.out.println("BOOLEAN");
		JFrame f = new JFrame();

		

		f.setVisible(true);

		

		f.setSize(500, 500);
		
		JPanel p = new JPanel();
		
		drumLabelWithImage = createLabelImage("gemini.jpg");
		
		
		p.add(drumLabelWithImage);
		p.add(drum);
		f.pack();
		

		f.add(p);
		break;
	}
	case CANCER:{
		System.out.println("LONG");
		break;
	}
	case LEO:{
		System.out.println("SHORT");
		break;
	}
	case VIRGO:{
		System.out.println("BYTE");
		break;
	}
	
	case LIBRA:{
		System.out.println("BYTE");
		break;
	}
	case SCORPIO:{
		System.out.println("BYTE");
		break;
	}
	case SAGITTARIUS:{
		System.out.println("BYTE");
		break;
	}
	case CAPRICORN:{
		System.out.println("BYTE");
		break;
	}
	case AQUARIUS:{
		System.out.println("BYTE");
		break;
	}
	case PISCES:{
		System.out.println("BYTE");
		break;
	}
	//https://github.com/League-Level1-Student/level1-module0-trygamer/blob/master/src/DrumKit.java
	
	
	
	}
	
	
	public Zodiac  Set(int i) {
		
		
		
	}
	
	
}
	
	
	

	
	
	
	
	// 3. Make a main method to test your method

public static void main(String[] args) {
	String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
	int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null, options,0);
	
	

}


private JLabel createLabelImage(String fileName) throws MalformedURLException {

	URL imageURL = getClass().getResource(fileName);

	if (imageURL == null) {

		System.err.println("Could not find image " + fileName);

		return new JLabel();

	}

	Icon icon = new ImageIcon(imageURL);

	JLabel imageLabel = new JLabel(icon);

	return imageLabel;

}




	
}