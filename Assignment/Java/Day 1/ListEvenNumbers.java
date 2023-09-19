public class ListEvenNumbers {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide a single integer argument.");
            return;
        }

        try {
            int n = Integer.parseInt(args[0]);

            if (n < 0) {
                System.out.println("Please provide a non-negative integer.");
            } else {
                System.out.println("Even numbers less than or equal to " + n + ":");
                listEvenNumbers(n);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide a valid integer.");
        }
    }

    public static void listEvenNumbers(int n) {
        for (int i = 0; i <= n; i += 2) {
            System.out.println(i);
        }
    }
}
