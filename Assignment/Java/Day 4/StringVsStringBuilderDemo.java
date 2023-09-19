public class StringVsStringBuilderDemo {
    public static void main(String[] args) {
        int n = 100000;

        // Using String
        long startTime = System.nanoTime();
        String str = "";
        for (int i = 0; i < n; i++) {
            str += "a";
        }
        long endTime = System.nanoTime();
        System.out.println("String concatenation took " + (endTime - startTime) + " nanoseconds.");

        // Using StringBuilder
        startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("a");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuilder append took " + (endTime - startTime) + " nanoseconds.");
    }
}
