public class Collatz {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]); 
        String mode = args[1];

        for (int seed = 1; seed <= N; seed++) {
            int n = seed; 
            int count = 1; 
            if (mode.equals("v")) {
                System.out.print(n + " ");
            }
            while (n != 1) {
                if (n % 2 == 0) {
                    n = n / 2;
                } else {
                    n = 3 * n + 1;
                }
                count++;
                if (mode.equals("v")) {
                    System.out.print(n + " ");
                }
            }

            if (mode.equals("v")) {
                System.out.println("(" + count + ")");
            }
		}
        System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
		
    }
}
