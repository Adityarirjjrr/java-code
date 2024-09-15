public class function_string_1 {
    int get_name(int a, int b)
    {

        return a+b;
    }
    public static void main(String[] args) {
        function_string_1 f = new function_string_1();
        int xyz = f.get_name(5,10);
        System.out.println(xyz);
    }
}
