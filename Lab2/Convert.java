//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Samuel Zhang

import java.util.Scanner;
import static java.lang.System.*;

public class Convert
{
	private String sentence;
	private String binary;

	public Convert()
	{
	}

	public Convert(String sentence)
	{
		this.sentence = sentence;
		binary = "";
	}

	public void convert()
	{
		for (int i = 0; i < sentence.length(); i++) {
			char digit = sentence.charAt(i);
			String b = Integer.toBinaryString(digit);
			while (b.length() < 8) {
				b = "0" + b;
			}
			binary += b + " ";
		}
	}

	public String toString()
	{
		return sentence + "\n" + binary + "\n";
	}
}