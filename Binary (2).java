/******************************************************************
 * Program 1: Conversion from binary to decimal representation
 * Programmer: James G. Gabion
 * 
 * Class: IS 1-1        Instructor: John Mark D. Gabrentina
 *        
 * Pledge: I have neither given nor received unauthorized aid
 * on this program.     (signature on file)
 *
 * Description: This program converts a binary number to decimal.
 *
 * Input: Binary number
 *
 * Output: Decimal number
 *
 ******************************************************************/
//////////////////////////////////////
		// ADD YOUR CODE HERE
		// FOLLOW THE EXAMPLE PROVIDED
		// FOR THE LAST BIT, THE 6th
		//////////////////////////////////////
		/*
		 * bit=binary%10;//get the last bit (6th)
		 * decimal=decimal+bit*1;//add it, multiplied by the corresponding power of 2
		 * binary=binary/10;//get rid of the 6th bit, now the 5th bit is last
		 * 
		 * bit=binary%10;//get the last bit (5th)
		 * decimal=decimal+bit*2;//add it, multiplied by the corresponding power of 2
		 * binary=binary/10;//get rid of the 5th bit, now the 4th bit is last
		 * 
		 * bit=binary%10;//get the last bit (4th)
		 * decimal=decimal+bit*4;//add it, multiplied by the corresponding power of 2
		 * binary=binary/10;//get rid of the 4th bit, now the 3rd bit is last
		 * 
		 * bit=binary%10;//get the last bit (3rd)
		 * decimal=decimal+bit*8;//add it, multiplied by the corresponding power of 2
		 * binary=binary/10;//get rid of the 3rd bit, now the 2nd bit is last
		 * 
		 * bit=binary%10;//get the last bit (2nd)
		 * decimal=decimal+bit*16;//add it, multiplied by the corresponding power of 2
		 * binary=binary/10;//get rid of the 2nd bit, now the 1st bit is last
		 * 
		 * bit=binary%10;//get the last bit (1st)
		 * decimal=decimal+bit*32;//add it, multiplied by the corresponding power of 2
		 */
// Imported packages
import javax.swing.*;

public class Binary {
	// Main method
	public static void main(String[] args) {

		// Request 6-bit binary number
		String binaryString = JOptionPane.showInputDialog("Enter a 6-bit binary number");

		// Convert from String to integer type
		int binary = Integer.parseInt(binaryString);

		// Declaration of output value
		int decimal = 0;

		// Declaration of variable to hold the current bit
		int bit;

		
		int d = 0;
		int power1 = 1;
		int len = binaryString.length();
		while (d < len) {
			bit = binary % 10;// get the last bit (6th)
			decimal = decimal + bit * power1;// add it, multiplied by the corresponding power of2
			binary = binary / 10;// get rid of the 6th bit, now the 5th bit is last
			power1 *= 2;
			d++;
		}

		

		// Format output String
		String binaryOutput = "Binary: " + binaryString;
		String decimalOutput = "Decimal: " + decimal;

		// Output message
		JOptionPane.showMessageDialog(null, binaryOutput + "\n" + decimalOutput,
				"Binary to Decimal Conversion", JOptionPane.INFORMATION_MESSAGE);



	// #############################4-bit################################################################	
String binaryZtring4 = JOptionPane.showInputDialog("Enter a 4-bit binary number");
int Binary4 = Integer.parseInt(binaryZtring4);
int Decimal4 = 0;
int Bit4;

int i=0;
		int power4=1;
		int len2=binaryZtring4.length();
		while (i<len2) {
			Bit4=Binary4%10;//get the last bit (4th)
		Decimal4=Decimal4+Bit4*power4;
		Binary4=Binary4/10;//get rid of the 4th bit, now the 3th bit is last
		power4*=2;
		i++;
		}
String binaryOutput4 = "Binary: " + binaryZtring4;
String decimalOutput4 = "Decimal: " + Decimal4;

// Output message
JOptionPane.showMessageDialog(null, binaryOutput4 + "\n" + decimalOutput4,
		"Binary to Decimal Conversion", JOptionPane.INFORMATION_MESSAGE);
// #############################################################################################
			

// #############################8-bit################################################################	
String binaryZtring3 = JOptionPane.showInputDialog("Enter a 8-bit binary number");
int Binary3 = Integer.parseInt(binaryZtring3);
int Decimal3 = 0;
int Bit3;

int l=0;
		int power8=1;
		int len3=binaryZtring3.length();
		while (l<len3) {
			Bit3=Binary3%10;//get the last bit (3rd)
		Decimal3=Decimal3+Bit3*power8;
		Binary3=Binary3/10;//get rid of the 3th bit, now the 2th bit is last
		power8*=2;
		l++;
		}
String binaryOutput3 = "Binary: " + binaryZtring3;
String decimalOutput3 = "Decimal: " + Decimal3;

// Output message
JOptionPane.showMessageDialog(null, binaryOutput3 + "\n" + decimalOutput3,
		"Binary to Decimal Conversion", JOptionPane.INFORMATION_MESSAGE);
// #############################################################################################




// #############################16-bit################################################################	
String binaryZtring2 = JOptionPane.showInputDialog("Enter a 16-bit binary number");
int Binary2 = Integer.parseInt(binaryZtring2);
int Decimal2 = 0;
int Bit2;

int n=0;
		int power16=1;
		int len4=binaryZtring2.length();
		while (n<len4) {
			Bit2=Binary2 % 10;
			Decimal2 = Decimal2 + Bit2 * power16;
		Binary2=Binary2 / 10;
		power16*=2;
		n++;
		}
String binaryOutput2 = "Binary: " + binaryZtring2;
String decimalOutput2 = "Decimal: " + Decimal2;

// Output message
JOptionPane.showMessageDialog(null, binaryOutput2 + "\n" + decimalOutput2,
		"Binary to Decimal Conversion", JOptionPane.INFORMATION_MESSAGE);
// #############################################################################################



		// #############################32-bit################################################################
		
		String binaryZtring = JOptionPane.showInputDialog("Enter a 32-bit binary number");
		int Binary1 = Integer.parseInt(binaryZtring);
		int Decimal1 = 0;
		int Bit1;

		int p = 0;
		int power32 = 1;
		int len5 = binaryZtring.length();
		while (p < len5) 
		{
			Bit1 = Binary1 % 10;// get the last bit (1st)
			Decimal1 = Decimal1 + Bit1 * power32;// add it, multiplied by the corresponding power of 2
			Binary1 = Binary1/10;
			power32 *= 2;
			p++;

		}

		String binaryOutput1 = "Binary: " + binaryZtring;
		String decimalOutput1 = "Decimal: " + Decimal1;

		// Output message
		JOptionPane.showMessageDialog(null, binaryOutput1 + "\n" + decimalOutput1,
				"Binary to Decimal Conversion", JOptionPane.INFORMATION_MESSAGE);
		// #############################################################################################




		// Exit
		System.exit(0);
	}
}