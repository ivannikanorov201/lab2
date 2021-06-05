public class Main {

    public static int fact(int n){
        int result;
        if (n < 2)
            return 1;
        else {
            result = fact(n - 1) * n;
            return result;
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(n + "! = " + fact(n));
    }
}
