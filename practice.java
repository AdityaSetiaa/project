public class practice {

    public int multiplication(int a, int b) {
        return a * b;
    }

    public void results() {
        int passMarks = 33;
        int marksObtained = 2345; // Example value
        if (marksObtained >= passMarks) {
            System.out.println("PASSED!");
        } else {
            System.out.println("FAILED, bro.");
        }
    }

    public static void main(String[] args) {
        practice goon = new practice();

        // Call multiplication method
        System.out.println("Multiplication result: " + goon.multiplication(23, 34));

        // Call results method
        goon.results();
    }
}
