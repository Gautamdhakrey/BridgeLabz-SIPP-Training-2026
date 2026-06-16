import java.util.Scanner;
import java.util.Random;

/**
 * FactorsOperations.java
 */
public class FactorsOperations {
    public static void printFactors(int n) {
        System.out.print("Factors of " + n + ": ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            printFactors(n);
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter an integer.");
        }
        sc.close();
    }
}

/**
 * RecursiveNaturalSum.java
 */
class RecursiveNaturalSum {
    public static int sumNatural(int n) {
        if (n <= 1) return n;
        return n + sumNatural(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter n: ");
            int n = sc.nextInt();
            System.out.println("Sum = " + sumNatural(n));
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter an integer.");
        }
        sc.close();
    }
}

/**
 * LeapYear.java
 */
class LeapYear {
    public static boolean isLeap(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter year: ");
            int year = sc.nextInt();
            System.out.println(year + (isLeap(year) ? " is a Leap Year." : " is not a Leap Year."));
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter an integer.");
        }
        sc.close();
    }
}

/**
 * UnitConverterKM.java
 */
class UnitConverterKM {
    public static double milesToKm(double miles) {
        return miles * 1.60934;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter miles: ");
            double miles = sc.nextDouble();
            System.out.println(miles + " miles = " + milesToKm(miles) + " km");
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter numeric values.");
        }
        sc.close();
    }
}

/**
 * UnitConverterYards.java
 */
class UnitConverterYards {
    public static double metersToYards(double meters) {
        return meters * 1.09361;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter meters: ");
            double meters = sc.nextDouble();
            System.out.println(meters + " meters = " + metersToYards(meters) + " yards");
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter numeric values.");
        }
        sc.close();
    }
}

/**
 * UnitConverterTemperature.java
 */
class UnitConverterTemperature {
    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter Celsius: ");
            double c = sc.nextDouble();
            System.out.println(c + " °C = " + celsiusToFahrenheit(c) + " °F");
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter numeric values.");
        }
        sc.close();
    }
}

/**
 * StudentVoteChecker.java
 */
class StudentVoteChecker {
    public static boolean canVote(int age) {
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            System.out.println(canVote(age) ? "Eligible to vote." : "Not eligible to vote.");
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter an integer.");
        }
        sc.close();
    }
}

/**
 * FriendsAgeHeight.java
 */
class FriendsAgeHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter number of friends: ");
            int n = sc.nextInt();
            int[] ages = new int[n];
            double[] heights = new double[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Enter age of friend " + (i + 1) + ": ");
                ages[i] = sc.nextInt();
                System.out.print("Enter height of friend " + (i + 1) + ": ");
                heights[i] = sc.nextDouble();
            }

            System.out.println("\nFriend Data:");
            for (int i = 0; i < n; i++) {
                System.out.println("Friend " + (i + 1) + ": Age = " + ages[i] + ", Height = " + heights[i]);
            }
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter correct values.");
        }
        sc.close();
    }
}

/**
 * NumberAnalysis.java
 */
class NumberAnalysis {
    public static void analyze(int[] arr) {
        int sum = 0, max = arr[0], min = arr[0];
        for (int num : arr) {
            sum += num;
            if (num > max) max = num;
            if (num < min) min = num;
        }
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + (double) sum / arr.length);
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter size of array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Enter element " + (i + 1) + ": ");
                arr[i] = sc.nextInt();
            }
            analyze(arr);
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter integers.");
        }
        sc.close();
    }
}

/**
 * BMITracker.java
 */
class BMITracker {
    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter weight (kg): ");
            double weight = sc.nextDouble();
            System.out.print("Enter height (m): ");
            double height = sc.nextDouble();

            double bmi = calculateBMI(weight, height);
            System.out.println("BMI = " + bmi);
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter numeric values.");
        }
        sc.close();
    }
}

/**
 * QuadraticRoots.java
 */
class QuadraticRoots {
    public static void findRoots(double a, double b, double c) {
        double d = b * b - 4 * a * c;
        if (d > 0) {
            double r1 = (-b + Math.sqrt(d)) / (2 * a);
            double r2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Roots are real and distinct: " + r1 + ", " + r2);
        } else if (d == 0) {
            double r = -b / (2 * a);
            System.out.println("Roots are real and equal: " + r);
        } else {
            System.out.println("Roots are imaginary.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter coefficients a, b, c: ");
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            findRoots(a, b, c);
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter numeric values.");
        }
        sc.close();
    }
}

/**
 * RandomNumberStatistics.java
 */
class RandomNumberStatistics {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[10];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
            sum += arr[i];
        }
        System.out.println("Generated numbers:");
        for (int num : arr) System.out.print(num +" ");
    }
}