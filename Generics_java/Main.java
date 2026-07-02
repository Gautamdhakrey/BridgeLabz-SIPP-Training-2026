import java.util.*;

//---------------- Pair<T, U> ----------------
class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}

//---------------- Stack<T> ----------------
class Stack<T> {
    private ArrayList<T> list = new ArrayList<>();

    public void push(T item) {
        list.add(item);
    }

    public T pop() {
        if (list.isEmpty()) {
            throw new EmptyStackException();
        }
        return list.remove(list.size() - 1);
    }

    public T peek() {
        if (list.isEmpty()) {
            throw new EmptyStackException();
        }
        return list.get(list.size() - 1);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}

//---------------- Generic Repository<T> ----------------
class Repository<T> {
    private List<T> data = new ArrayList<>();

    public void add(T item) {
        data.add(item);
    }

    public List<T> getAll() {
        return data;
    }
}

//---------------- Utility Class ----------------
class Utility {

    // Generic Method
    public static <T extends Comparable<T>> T findMax(T[] arr) {
        if (arr == null || arr.length == 0)
            return null;

        T max = arr[0];

        for (T item : arr) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }

        return max;
    }

    // Wildcard Method
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }
}

//---------------- Student Entity ----------------
class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " " + name;
    }
}

//---------------- Main Class ----------------
public class Main {
    public static void main(String[] args) {

        // Pair
        Pair<String, Integer> p = new Pair<>("Age", 22);
        System.out.println("Pair : " + p);

        // Stack
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Pop : " + stack.pop());
        System.out.println("Peek : " + stack.peek());

        // findMax()
        Integer[] nums = {10, 50, 30, 80, 60};
        System.out.println("Maximum : " + Utility.findMax(nums));

        String[] names = {"Amit", "Rohit", "Zoya", "Karan"};
        System.out.println("Maximum String : " + Utility.findMax(names));

        // Repository
        Repository<Student> repo = new Repository<>();
        repo.add(new Student(1, "Rahul"));
        repo.add(new Student(2, "Priya"));

        System.out.println("Repository : " + repo.getAll());

        // Wildcard List<?>
        List<Integer> list1 = Arrays.asList(10, 20, 30);
        List<String> list2 = Arrays.asList("Java", "Python", "C++");

        System.out.print("Integer List : ");
        Utility.printList(list1);

        System.out.print("String List : ");
        Utility.printList(list2);
    }
}