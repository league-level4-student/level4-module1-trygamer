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
	System.out.println("hi");
	//They can also be used in a switch statement
	switch(z) {
	// Notice that 'DataTypes.' is not requires when accessing categories
	case ARIES :{
		pictureset("");
		break;
	}
	case TAURUS:{
		pictureset("");
		break;
	}
	case GEMINI:{
		System.out.println("gemini");
		pictureset("gemini.jpg");
		break;
	}
	case CANCER:{
		pictureset("cancer.jpg");
		break;
	}
	case LEO:{
		pictureset("leo.jpg");
		break;
	}
	case VIRGO:{
		pictureset("virgo.jpg");
		break;
	}
	
	case LIBRA:{
		pictureset("libra.png");
		break;
	}
	case SCORPIO:{
		System.out.println("play");
		pictureset("scorpio.jpg");
		break;
	}
	case SAGITTARIUS:{
		pictureset("sagittarius.jpg");
		break;
	}
	case CAPRICORN:{
		pictureset("download-2.jpg");
		break;
	}
	case AQUARIUS:{
		pictureset("download-3.jpg");
		break;
	}
	case PISCES:{
		//pictureset("download-3.jpg");
		break;
	}
	//https://github.com/League-Level1-Student/level1-module0-trygamer/blob/master/src/DrumKit.java
	
	
	
	}
	
	
	
	
	
}
	
	
	
public Zodiac Set(int i) {
	
	
		Zodiac z = null;
		System.out.println(i);
		
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
			System.out.println("Pisces");
			z = Zodiac.PISCES;
		
		}
		
	
	
	return z ;
}
	
	

public void  pictureset(String s) throws MalformedURLException {
	
	JFrame f = new JFrame();
	f.setVisible(true);
	f.setSize(500, 500);
	JPanel p = new JPanel();
	drumLabelWithImage = createLabelImage(s);
	p.add(drumLabelWithImage);
	
	f.pack();
	f.add(p);
	
	
}
	
	
	// 3. Make a main method to test your method

public static void main(String[] args) throws Exception {
	_00_Horoscope h = new _00_Horoscope();
	
	String[] options = { "ARIES", "TAURUS", "GEMINI", "CANCER", "LEO", "VIRGO","LIBRA","SCORPIO","SAGITTARIUS","CAPRICORN","AQUARIUS","PISCES" };
	int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null, options,0);
	System.out.println(input);
	Zodiac z1 =h.Set(input);
	
	
	h.Horos(z1);
	System.out.println(z1);
	

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