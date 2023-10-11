//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Samuel Zhang

import static java.lang.System.*;

public class BaseConversion
{
	private String number;
	private int base;

	public BaseConversion(String num, int b)
	{
		number = num;
		base = b;
	}

	public void setNumBase(String num, int b)
	{
		number = num;
		base = b;
	}

	private int convertToTen( )
	{
		int base10 = 0;
		for (int i = 0; i < number.length(); i++) {
			int digit = number.charAt(i);
			if (digit >= 65 && digit <= 90) {
				digit -= 55;
			}
			else {
				digit -= 48;
			}
			base10 += digit *  Math.pow(base, number.length() - 1 - i);
		}
		return base10;
	}

	public String getNum(int newBase)
	{
		int base10 = convertToTen();
		String newNum = "";
		while (base10 > 0) {
			int remainder = base10 % newBase;

			if (remainder >= 10) {
				char letter = (char) (remainder + 55);
				newNum = letter + newNum;
			}
			else {
				newNum = remainder + newNum;
			}
			
			base10 /= newBase;
		}

		return newNum+"-"+newBase;
	}

	public String toString()
	{
		return number+"-"+base;
	}
}