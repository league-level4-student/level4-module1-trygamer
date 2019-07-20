package _05_Enum_Stuff;


import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import _04_Intro_To_Enums.IntroToEnums.DataTypes;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	

	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	
	Zodiac z = Zodiac.AQUARIUS;
	
JLabel drumLabelWithImage;

	

	JLabel drum;

	

public void Horos(Zodiac z) throws MalformedURLException {
	
	//They can also be used in a switch statement
	switch(z) {
	// Notice that 'DataTypes.' is not requires when accessing categories
	case ARIES :{
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
	case TAURUS:{
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
	case GEMINI:{
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
	case LEO:{
		JFrame f = new JFrame();
		f.setVisible(true);
		f.setSize(500, 500);
		JPanel p = new JPanel();
		drumLabelWithImage = createLabelImage("leo.jpg");
		p.add(drumLabelWithImage);
		p.add(drum);
		f.pack();
		f.add(p);
		break;
	}
	case VIRGO:{
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
	
	case LIBRA:{
		JFrame f = new JFrame();
		f.setVisible(true);
		f.setSize(500, 500);
		JPanel p = new JPanel();
		drumLabelWithImage = createLabelImage("libra.png");
		p.add(drumLabelWithImage);
		p.add(drum);
		f.pack();
		f.add(p);
		break;
	}
	case SCORPIO:{
		JFrame f = new JFrame();
		f.setVisible(true);
		f.setSize(500, 500);
		JPanel p = new JPanel();
		drumLabelWithImage = createLabelImage("scorpio.jpg");
		p.add(drumLabelWithImage);
		p.add(drum);
		f.pack();
		f.add(p);
		break;
	}
	case SAGITTARIUS:{
		JFrame f = new JFrame();
		f.setVisible(true);
		f.setSize(500, 500);
		JPanel p = new JPanel();
		drumLabelWithImage = createLabelImage("sagittarius.jpg");
		p.add(drumLabelWithImage);
		p.add(drum);
		f.pack();
		f.add(p);
		break;
	}
	case CAPRICORN:{
		JFrame f = new JFrame();
		f.setVisible(true);
		f.setSize(500, 500);
		JPanel p = new JPanel();
		drumLabelWithImage = createLabelImage("download-2.jpg");
		p.add(drumLabelWithImage);
		p.add(drum);
		f.pack();
		f.add(p);
		break;
	}
	case AQUARIUS:{
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
	case PISCES:{
		JFrame f = new JFrame();
		f.setVisible(true);
		f.setSize(500, 500);
		JPanel p = new JPanel();
		drumLabelWithImage = createLabelImage("download-3.jpg");
		p.add(drumLabelWithImage);
		
		f.pack();
		f.add(p);
		break;
	}
	//https://github.com/League-Level1-Student/level1-module0-trygamer/blob/master/src/DrumKit.java
	
	
	
	}
	
	
	
	
	
}
	
	
	
public Zodiac Set(int i) {
	
	
		Zodiac z = null;
		
		
		switch (i) {
		
		
		case 0:
			 z = Zodiac.ARIES;
		case 1: 
			z = Zodiac.TAURUS;
		case 2: 
			z = Zodiac.GEMINI;
		case 3:
			z = Zodiac.CANCER;
		case 4:
			z = Zodiac.LEO;
		case 5:
			z = Zodiac.VIRGO;
		case 6 :
			z = Zodiac.LIBRA;
		case 7: 
			z = Zodiac.SCORPIO;
		case 8:
			z = Zodiac.SAGITTARIUS;
		case 9:
			z = Zodiac.CAPRICORN;
		case 10:
			z = Zodiac.AQUARIUS;
		case 11:
			z = Zodiac.PISCES;
		
		}
		
	
	
	return z ;
}
	
	
	
	
	// 3. Make a main method to test your method

public static void main(String[] args) throws Exception {
	_00_Horoscope h = new _00_Horoscope();
	
	String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
	int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null, options,0);
	Zodiac z1 =h.Set(input);
	h.Horos(z1);
	

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