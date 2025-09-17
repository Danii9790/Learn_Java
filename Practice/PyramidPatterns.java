public class PyramidPatterns {

    // Pyramid Pattern-1
    public static void pyramidPattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    // Pyramid Pattern-2
    public static void pyramidPattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // Pyramid Pattern-3
    public static void pyramidPattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }
            for (int star = 1; star <= (2 * i - 1); star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Pyramid Pattern-4
    public static void pyramidPattern4(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }
            // increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // decreasing numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // Pyramid Pattern-5
    public static void pyramidPattern5(int n) {
        for (int i = n; i >= 1; i--) {
            // spaces
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }
            // increasing numbers
            for (int j = i; j <= n; j++) {
                System.out.print(j);
            }
            // decreasing numbers
            for (int j = n - 1; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // Inverted Pyramid Pattern-6
    public static void invertedPyramid6(int n) {
        for (int i = n; i >= 1; i--) {
            // spaces
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }
            // stars
            for (int star = 1; star <= (2 * i - 1); star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Inverted Pyramid Pattern-7
    public static void invertedPyramid7(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    // MAIN method
    public static void main(String[] args) {
        int n = 9; // size of pyramid

        System.out.println("Pyramid Pattern-1:");
        pyramidPattern1(n);

        System.out.println("\nPyramid Pattern-2:");
        pyramidPattern2(n);

        System.out.println("\nPyramid Pattern-3:");
        pyramidPattern3(n);

        System.out.println("\nPyramid Pattern-4:");
        pyramidPattern4(n);

        System.out.println("\nPyramid Pattern-5:");
        pyramidPattern5(n);

        System.out.println("\nInverted Pyramid Pattern-6:");
        invertedPyramid6(n);

        System.out.println("\nInverted Pyramid Pattern-7:");
        invertedPyramid7(n);
    }
}
