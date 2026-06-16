import java.util.Scanner;

/**
 * SimpleInterest.java
 */
public class SimpleInterest {
    public static double calculateInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter Principal amount: ");
            double principal = sc.nextDouble();
            System.out.print("Enter Rate of Interest: ");
            double rate = sc.nextDouble();
            System.out.print("Enter Time (in years): ");
            double time = sc.nextDouble();

            double interest = calculateInterest(principal, rate, time);
            System.out.println("Simple Interest = " + interest);
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter numeric values.");
        }
        sc.close();
    }
}

/**
 * Handshakes.java
 */
class Handshakes {
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter number of people: ");
            int n = sc.nextInt();
            if (n < 0) {
                System.out.println("Number of people cannot be negative!");
            } else {
                System.out.println("Total Handshakes = " + calculateHandshakes(n));
            }
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter an integer.");
        }
        sc.close();
    }
}

/**
 * TriangularParkRun.java
 */
class TriangularParkRun {
    public static double calculatePerimeter(double a, double b, double c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter side A: ");
            double a = sc.nextDouble();
            System.out.print("Enter side B: ");
            double b = sc.nextDouble();
            System.out.print("Enter side C: ");
            double c = sc.nextDouble();

            System.out.println("Perimeter of Park = " + calculatePerimeter(a, b, c));
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter numeric values.");
        }
        sc.close();
    }
}

/**
 * PositiveNegativeZero.java
 */
class PositiveNegativeZero {
    public static String checkNumber(int num) {
        if (num > 0) return "Positive";
        else if (num < 0) return "Negative";
        else return "Zero";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            System.out.println("The number is " + checkNumber(num));
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter an integer.");
        }
        sc.close();
    }
}

/**
 * SpringSeason.java
 */
class SpringSeason {
    public static boolean isSpring(int month, int day) {
        return (month == 3 && day >= 20) || (month == 6 && day <= 20) || (month > 3 && month < 6);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter month (1-12): ");
            int month = sc.nextInt();
            System.out.print("Enter day (1-31): ");
            int day = sc.nextInt();

            if (isSpring(month, day)) {
                System.out.println("It is Spring Season!");
            } else {
                System.out.println("It is not Spring Season.");
            }
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter integers.");
        }
        sc.close();
    }
}

/**
 * SumNaturalNumbers.java
 */
class SumNaturalNumbers {
    public static int calculateSum(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter n: ");
            int n = sc.nextInt();
            if (n < 0) {
                System.out.println("n must be non-negative!");
            } else {
                System.out.println("Sum of first " + n + " natural numbers = " + calculateSum(n));
            }
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter an integer.");
        }
        sc.close();
    }
}

/**
 * SmallestLargest.java
 */
class SmallestLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter three numbers: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int smallest = Math.min(a, Math.min(b, c));
            int largest = Math.max(a, Math.max(b, c));

            System.out.println("Smallest = " + smallest);
            System.out.println("Largest = " + largest);
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter integers.");
        }
        sc.close();
    }
}

/**
 * QuotientRemainder.java
 */
class QuotientRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter dividend: ");
            int dividend = sc.nextInt();
            System.out.print("Enter divisor: ");
            int divisor = sc.nextInt();

            if (divisor == 0) {
                System.out.println("Divisor cannot be zero!");
            } else {
                int quotient = dividend / divisor;
                int remainder = dividend % divisor;
                System.out.println("Quotient = " + quotient);
                System.out.println("Remainder = " + remainder);
            }
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter integers.");
        }
        sc.close();
    }
}

/**
 * ChocolateDistribution.java
 */
class ChocolateDistribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter total chocolates: ");
            int chocolates = sc.nextInt();
            System.out.print("Enter number of students: ");
            int students = sc.nextInt();

            if (students <= 0) {
                System.out.println("Number of students must be positive!");
            } else {
                int each = chocolates / students;
                int remaining = chocolates % students;
                System.out.println("Each student gets " + each + " chocolates.");
                System.out.println("Remaining chocolates = " + remaining);
            }
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter integers.");
        }
        sc.close();
    }
}

/**
 * WindChillTemperature.java
 */
class WindChillTemperature {
    public static double calculateWindChill(double t, double v) {
        return 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter temperature (F): ");
            double t = sc.nextDouble();
            System.out.print("Enter wind speed (mph): ");
            double v = sc.nextDouble();

            System.out.println("Wind Chill Temperature = " + calculateWindChill(t, v));
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter numeric values.");
        }
        sc.close();
    }
}

/**
 * TrigonometricFunctions.java
 */
class TrigonometricFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter angle in degrees: ");
            double angle = sc.nextDouble();
            double radians = Math.toRadians(angle);

            System.out.println("sin(" + angle + ") = " + Math.sin(radians));
            System.out.println("cos(" + angle + ") = " + Math.cos(radians));
            System.out.println("tan(" + angle + ") = " + Math.tan(radians));
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter numeric values.");
        }
        sc.close();
    }
}
