import java.awt.*;
import javax.swing.*;
public class main {
	/*
	 * Author: Morad Abdelrasheed Mokhtar Ali Gill
	 * Last-modified Date: 26/12/2020
	 * Please don't remove this comment.
   * This example applies only on 1x1 images
	 */
	public static void main(String[] args) {
		
		// START: FROM RGB TO DECIMAL
		
		String RGB = "46|35|145"; // RGB Color, delimiter is |
		String Dim = "1x1"; // Image size
		StringBuilder O = new StringBuilder();
		String[] RGBs = RGB.split("\\|");
		for(int i = 0;i<RGBs.length;i++) { // From RGB to Decimal char
			int tempRGB = Integer.parseInt(RGBs[i]);
			char c = (char) tempRGB;
			O.append(c);
			}
		System.out.println("File content (if stored): "+Dim+"."+O.toString()); // Print the content
		
		// START: FROM DECIMAL TO RGB
		
		String toRGBs = "";
		for(int i=0;i<O.length();i++) { // From Decimal char to RGB
			char c = O.charAt(i);
			toRGBs += String.valueOf((int) c)+".";
		}
		toRGBs = toRGBs.substring(0,toRGBs.length()-1);
		System.out.println("Original RGB after conversion: "+toRGBs); // Print the RGB
		String[] RGBss = toRGBs.split("\\.");
		
		// START: SET RGB COLOR AS TEXT FONT (JFrame)
		
		JFrame f = new JFrame();
		f.setVisible(true);
	    f.setSize(100,100);
		JLabel l = new JLabel();
		l.setText("Test");
		l.setFont(new Font(l.getFont().getName(), l.getFont().getStyle(), 20));
		Color r = new Color(Integer.parseInt(RGBss[0]),Integer.parseInt(RGBss[1]),Integer.parseInt(RGBss[2])); // Take translated RGB and init a color
		l.setForeground(r);
		l.setBackground(r);
		f.add(l);
	}
}
