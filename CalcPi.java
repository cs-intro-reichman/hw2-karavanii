// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		int termsnum = Integer.parseInt(args[0]);
		double denominator = 3;
		double sum = 1;
		for(int i = 0; i < termsnum -1 ; i++){
			if (i % 2 == 0) {
				sum = sum - (double)(1/denominator);
			}
			else {
				sum = sum + (double)(1/denominator);
			}
			denominator = denominator +2;
		}
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + (double)(sum * 4));
	}
}
