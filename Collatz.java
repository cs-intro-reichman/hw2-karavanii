// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int n = Integer.parseInt(args[0]);
		String mode = args[1];
		boolean IsV =  false;
		int count =1 ;
		boolean end = false;
		if (mode.equals("v")){
			IsV = true;
		}
		for(int seed = 1; seed<=n;seed++){
			if (IsV) {
				System.out.print(seed + " ");
			}
			int num = seed;
			if (seed == 1) {
				num = 4;
				if (IsV) {
					System.out.print("4 ");
				}
				count++;
			}
			while (num != 1) {
				if (num%2 ==0) {
					num = num/2;
					if (IsV) {
						System.out.print(num + " ");
						count++;
					}
				} else{
					num = num*3 +1;
					if (IsV) {
						System.out.print(num + " ");
						count++;
					}
				}
				if (num == 1) {
					end = true;
				}
			}
			if (IsV) {
				System.out.println("(" + count +")");
			}
			count = 1;
		}
		if (end) {
			System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
		}
		}
}