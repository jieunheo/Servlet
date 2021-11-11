package ezen;

public class Calculater
{
	public static void main(String[] args)
	{
		int k = Calculater.DoCal("14", "23", "+");
		System.out.println(k);
	}
	
	public static int DoCal(String x, String y, String op)
	{
		if(x == null || y == null || op == null)
		{
			return 0;
		}

		int iz = 0;
		try
		{
			x = x.replace(",", "");
			y = y.replace(",", "");
			int ix = Integer.parseInt(x);
			int iy = Integer.parseInt(y);
			switch (op) {
				case "+": iz = ix + iy; break;
				case "-": iz = ix - iy; break;
				case "*": iz = ix * iy; break;
				case "/": iz = ix / iy; break;
			}
		} catch (NumberFormatException e) {
			return 0;
		} catch (ArithmeticException  e) {
			return 0;
		}
		return iz;
		
	}
}