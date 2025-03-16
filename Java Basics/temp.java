

public class temp {
	public static void main(String[] args) {
        // Starting point for the pattern
        int start = 7;
        // Loop for each row
        for (int i = 0; i < 3; i++) {
            // Loop for each column
            for (int j = 0; j < 3; j++) {
                // Print numbers in the specific pattern
                if (i == 0) {
                    System.out.print((start + j) + " "); // First row: 7 8 9
                } else if (i == 1) {
                    System.out.print((start - 1) + " "); // Second row: 6 1 2
                    start = (j == 0) ? 1 : start; // Move to 1 in the second column
                } else {
                    System.out.print((start - j) + " "); // Third row: 5 4 3
                }
            }
            // Move to the next line after each row
            System.out.println();
            // Update start for the next row (only applicable for the last two rows)
            if (i == 0) {
                start = 6; // For the second row
            } else if (i == 1) {
                start = 5; // For the third row
            }
        }
    }
	    }

