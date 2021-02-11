public class Line_comparison_problem {

    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public Line_comparison_problem(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    static void compareTo(double length1, double length2) {
        if (length1 == length2)
            System.out.println("length1 is equal to length2");
        else if (length1 > length2)
            System.out.println("length1 is greater than length2");
        else
            System.out.println("length1 is shorter than length2");
    }

    static double calculate_length(Line_comparison_problem obj) {
        double length = Math.sqrt(Math.pow(obj.x2 - obj.x1, 2) + Math.pow(obj.y2 - obj.y1, 2));
        return length;
    }

    public static void main(String[] args) {
        Line_comparison_problem line1 = new Line_comparison_problem(1,2,3,4);
        Line_comparison_problem line2 = new Line_comparison_problem(3,3,3,4);
        double length1 = calculate_length(line1);
        double length2 = calculate_length(line2);
        System.out.println("length1: " + length1);
        System.out.println("length2: " + length2);
        compareTo(length1, length2);
    }
}
