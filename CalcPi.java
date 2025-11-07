// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
        int n = Integer.parseInt(args[0]); //כמות פעמים
		double piValue = Math.PI;
		double result = 1.0;
		double odd_number= 3.0;
		double number;
			for(int i = 0; i < n-1; i++) {
				number =  1.0/odd_number;
				//System.out.println("try" + number);
				if (i%2 == 0) { 
					result = result - number;
					//System.out.println("try" + result);
				}
				else{
					result = result + number;
				}
				odd_number = odd_number+2;
				//System.out.println("first try:" + result);

	}
	System.out.println("pi according to Java: " + piValue);
	System.out.println("pi, approximated:     " + (4.0 * result));

	}
}
