public class TriangleAsterik {
    public static void main(String[] args) {
        int count = 1;

        while (count <= 5) {
            int spaces = 5 - count;
            int stars = count;
            String me = "";

            // Add leading spaces
            while (spaces > 0) {
                me += "  "; // Two spaces for better alignment
                spaces--;
            }

            // Add asterisks with spaces
            while (stars > 0) {
                me += "* ";
                stars--;
            }

            System.out.println(me.trim()); // Print the row
            count++;
        }
    }
}
