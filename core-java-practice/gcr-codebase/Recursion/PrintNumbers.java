import java.util.*;

public class PrintNumbers {
    // Problem 1: Print Numbers N to 1
    static void printNto1(int n) {
        if (n == 0) return;
        System.out.print(n + " ");
        printNto1(n - 1);
    }

    public static void main(String[] args) {
        int N = 5;
        printNto1(N);
    }
}

// Problem 2: Factorial
class Factorial {
    static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}

// Problem 3: Sum of Natural Numbers
class SumNatural {
    static int sum(int n) {
        if (n == 0) return 0;
        return n + sum(n - 1);
    }
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}

// Problem 4: Reverse String
class ReverseString {
    static String reverse(String s) {
        if (s.isEmpty()) return s;
        return reverse(s.substring(1)) + s.charAt(0);
    }
    public static void main(String[] args) {
        System.out.println(reverse("hello"));
    }
}

// Problem 5: Palindrome Check
class Palindrome {
    static boolean isPalindrome(String s, int l, int r) {
        if (l >= r) return true;
        if (s.charAt(l) != s.charAt(r)) return false;
        return isPalindrome(s, l + 1, r - 1);
    }
    public static void main(String[] args) {
        String str = "madam";
        System.out.println(isPalindrome(str, 0, str.length() - 1) ? "Palindrome" : "Not Palindrome");
    }
}

// Problem 6: Fibonacci
class Fibonacci {
    static int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }
    public static void main(String[] args) {
        System.out.println(fib(6));
    }
}

// Problem 7: Power Function
class Power {
    static int power(int x, int n) {
        if (n == 0) return 1;
        return x * power(x, n - 1);
    }
    public static void main(String[] args) {
        System.out.println(power(2, 5));
    }
}

// Problem 8: Subsets of Array
class Subsets {
    static void generate(int[] arr, int index, List<Integer> current) {
        if (index == arr.length) {
            System.out.println(current);
            return;
        }
        generate(arr, index + 1, current);
        current.add(arr[index]);
        generate(arr, index + 1, current);
        current.remove(current.size() - 1);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2};
        generate(arr, 0, new ArrayList<>());
    }
}

// Problem 9: Tower of Hanoi
class TowerOfHanoi {
    static void solve(int n, char from, char to, char aux) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + from + " to " + to);
            return;
        }
        solve(n - 1, from, aux, to);
        System.out.println("Move disk " + n + " from " + from + " to " + to);
        solve(n - 1, aux, to, from);
    }
    public static void main(String[] args) {
        solve(3, 'A', 'C', 'B');
    }
}

// Problem 10: String Permutations
class Permutations {
    static void permute(String s, String ans) {
        if (s.isEmpty()) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String rest = s.substring(0, i) + s.substring(i + 1);
            permute(rest, ans + ch);
        }
    }
    public static void main(String[] args) {
        permute("ABC", "");
    }
}

// Extra Problem 1: Consecutive Sensor Readings
class SensorReadings {
    static boolean isIncreasing(int[] arr, int index) {
        if (index == arr.length - 1) return true;
        if (arr[index] >= arr[index + 1]) return false;
        return isIncreasing(arr, index + 1);
    }
    public static void main(String[] args) {
        int[] readings = {12, 15, 18, 22, 30};
        System.out.println(isIncreasing(readings, 0));
    }
}

// Extra Problem 2: Username Validator
class UsernameValidator {
    static boolean isValid(String s, int index) {
        if (index == s.length()) return true;
        char c = s.charAt(index);
        if (c < 'a' || c > 'z') return false;
        return isValid(s, index + 1);
    }
    public static void main(String[] args) {
        System.out.println(isValid("abcdxyz", 0));
    }
}

// Extra Problem 3: Employee Skill Assignment
class EmployeeSkill {
    static void findTeams(int[] arr, int target, int index, List<Integer> current) {
        if (target == 0) {
            System.out.println(current);
            return;
        }
        if (index == arr.length || target < 0) return;

        current.add(arr[index]);
        findTeams(arr, target - arr[index], index + 1, current);
        current.remove(current.size() - 1);
        findTeams(arr, target, index + 1, current);
    }
    public static void main(String[] args) {
        int[] skills = {2, 3, 5, 7};
        int target = 10;
        findTeams(skills, target, 0, new ArrayList<>());
    }
}
