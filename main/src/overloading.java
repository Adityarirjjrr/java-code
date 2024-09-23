public class overloading {
    static int add(int a, int b) {
        return a + b;
    }
    static double add(double a, double b) {
        return a + b;
    }
    class testoverloading {
        public static void main(String [] args) {
            System.out.println(overloading.add(11,12));
        }
    }
}
