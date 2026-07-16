import java.util.Scanner;
import java.util.Random;

/**
 * FootballTeamHeight.java
 */
public class FootballTeamHeight {
    public static double averageHeight(double[] heights) {
        double sum = 0;
        for (double h : heights) sum += h;
        return sum / heights.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter number of players: ");
            int n = sc.nextInt();
            double[] heights = new double[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Enter height of player " + (i + 1) + ": ");
                heights[i] = sc.nextDouble();
            }
            System.out.println("Average Height = " + averageHeight(heights));
        } catch (Exception e) {
            System.out.println("Invalid input!");
        }
        sc.close();
    }
}

/**
 * NumberChecker1.java
 */
class NumberChecker1 {
    public static boolean isEven(int n) { return n % 2 == 0; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.println(n + (isEven(n) ? " is Even" : " is Odd"));
        sc.close();
    }
}

/**
 * NumberChecker2.java
 */
class NumberChecker2 {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) if (n % i == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.println(n + (isPrime(n) ? " is Prime" : " is not Prime"));
        sc.close();
    }
}

/**
 * NumberChecker3.java
 */
class NumberChecker3 {
    public static boolean isPalindrome(int n) {
        int temp = n, rev = 0;
        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        return rev == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.println(n + (isPalindrome(n) ? " is Palindrome" : " is not Palindrome"));
        sc.close();
    }
}

/**
 * NumberChecker4.java
 */
class NumberChecker4 {
    public static boolean isArmstrong(int n) {
        int temp = n, sum = 0, digits = String.valueOf(n).length();
        while (temp > 0) {
            int d = temp % 10;
            sum += Math.pow(d, digits);
            temp /= 10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.println(n + (isArmstrong(n) ? " is Armstrong" : " is not Armstrong"));
        sc.close();
    }
}

/**
 * NumberChecker5.java
 */
class NumberChecker5 {
    public static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) if (n % i == 0) sum += i;
        return sum == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.println(n + (isPerfect(n) ? " is Perfect" : " is not Perfect"));
        sc.close();
    }
}

/**
 * FactorOperationsAdvanced.java
 */
class FactorOperationsAdvanced {
    public static void printFactors(int n) {
        System.out.print("Factors: ");
        for (int i = 1; i <= n; i++) if (n % i == 0) System.out.print(i + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        printFactors(n);
        sc.close();
    }
}

/**
 * OTPGenerator.java
 */
class OTPGenerator {
    public static String generateOTP(int length) {
        Random rand = new Random();
        StringBuilder otp = new StringBuilder();
        for (int i = 0; i < length; i++) otp.append(rand.nextInt(10));
        return otp.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter OTP length: ");
        int len = sc.nextInt();
        System.out.println("Generated OTP: " + generateOTP(len));
        sc.close();
    }
}

/**
 * CalendarDisplay.java
 */
class CalendarDisplay {
    public static void main(String[] args) {
        System.out.println("June 2026 Calendar");
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int day = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7 && day <= 30; j++) {
                System.out.printf("%3d ", day++);
            }
            System.out.println();
        }
    }
}

/**
 * CollinearPoints.java
 */
class CollinearPoints {
    public static boolean areCollinear(int x1, int y1, int x2, int y2, int x3, int y3) {
        return (y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter coordinates x1 y1 x2 y2 x3 y3: ");
        int x1 = sc.nextInt(), y1 = sc.nextInt();
        int x2 = sc.nextInt(), y2 = sc.nextInt();
        int x3 = sc.nextInt(), y3 = sc.nextInt();
        System.out.println(areCollinear(x1, y1, x2, y2, x3, y3) ? "Points are Collinear" : "Points are not Collinear");
        sc.close();
    }
}

/**
 * EmployeeBonus.java
 */
class EmployeeBonus {
    public static double calculateBonus(double salary, double rating) {
        return salary * (rating / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter rating (1-10): ");
        double rating = sc.nextDouble();
        System.out.println("Bonus = " + calculateBonus(salary, rating));
        sc.close();
    }
}

/**
 * EuclideanDistanceLine.java
 */
class EuclideanDistanceLine {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter coordinates x1 y1 x2 y2: ");
        int x1 = sc.nextInt(), y1 = sc.nextInt();
        int x2 = sc.nextInt(), y2 = sc.nextInt();
        System.out.println("Distance = " + distance(x1, y1, x2, y2));
        sc.close();
    }
}

/**
 * StudentScoreCard.java
 */
class StudentScoreCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();
        int[] marks = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            sum += marks[i];
        }
        System.out.println("Total = " + sum);
        System.out.println("Average = " + (double) sum / n);
        sc.close();
    }
}

/**
 * MatrixOperations.java
 */
// class MatrixOperations {
//     public static int[][] add(int[][] A, int[][] B) {
//         int[][] C = new int[A.length][A[0].length];
//         for (int i = 0; i < A.length; i++)
//             for (int j = 0; j < A[0].length; j++)
//                 C[i][j] = A[i][j] + B[i][j];
//         return C;
// }
