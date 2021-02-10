import java.util.Scanner;

public class Line_comparison_problem {
    static void compareTo(double length1, double length2) {
        if (length1 == length2)
            System.out.println("length1 is equal to length2");
        else if (length1 > length2)
            System.out.println("length1 is greater than length2");
        else
            System.out.println("length1 is shorter than length2");

    }

    static double calculate_length() {
        Scanner myobj = new Scanner(System.in);
        System.out.println("enter x1 and y1 values");
        int x1 = myobj.nextInt();
        int y1 = myobj.nextInt();
        System.out.println("enter x2 and y2 values");
        int x2 = myobj.nextInt();
        int y2 = myobj.nextInt();
        double length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return length;
    }

    public static void main(String[] args) {
        double length1 = calculate_length();
        System.out.println("length1: " + length1);
        double length2 = calculate_length();
        System.out.println("length2: " + length2);
        compareTo(length1, length2);
    }
}
