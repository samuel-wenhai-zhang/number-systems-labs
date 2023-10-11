//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Samuel Zhang

import static java.lang.System.*;

public class Number implements Comparable<Number>
{

	private String number;
	private int base;
	private String binary;
	private int numOnes;

	public Number() {
	}

	public Number(String number, int base) {
		this.number = number;
		this.base = base;
		binary = Integer.toBinaryString(Integer.parseInt(number, base));
		numOnes = 0;
		for (int i = 0; i < binary.length(); i++) {
			if (binary.charAt(i) == '1') {
				numOnes++;
			}
		}
	}



	public int compareTo(Number param)
	{
		if (numOnes != param.numOnes) {
			return numOnes - param.numOnes;
		}
		else if (Integer.parseInt(number, base) != Integer.parseInt(param.number, param.base)) {
			return Integer.parseInt(number, base) - Integer.parseInt(param.number, param.base);
		}
		else {
			return number.compareTo(param.number);
		}
	}
	
	public String toString( )
	{
	  return number + " " + Integer.parseInt(number, base) + " " + binary;
	}
}