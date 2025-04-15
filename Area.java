import java.util.Scanner;

class Area {
    double calc(double r) {
        return Math.PI * (r * r);
    }

    int calc(int side) {
        return side * side;
    }

    int calc(int l, int b) {
        return l * b;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Area a = new Area();
        System.out.print("Enter the radius of circle :");
        double r = sc.nextInt();
        System.out.print("Area of circle =: " + a.calc(r));
        System.out.print("\nEnter the side of square :");
        int s = sc.nextInt();
        System.out.print("\nArea of square =: " + a.calc(s));
        System.out.print("\nEnter the length of rectangle :");
        int l = sc.nextInt();
        System.out.print("\nEnter the breadth of rectangle :");
        int b = sc.nextInt();
        System.out.print("\nArea of rectangle =: " + a.calc(l, b));
    }
}
