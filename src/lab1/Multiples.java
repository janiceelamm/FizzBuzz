package lab1;

public class Multiples {
    public static void main(String[] args) {
        int n = 1000;
        int a = 3;
        int b = 5;
        System.out.println(multiples(n,a,b));
    }

    public static int multiples(int n, int a, int b) {
        int count = 0; // keep track of how many multiples of a or b

        for (int number = 1; number < n;
             number++) {
            if (number % a == 0 || number % b == 0) {
                count++;}
        }
        return count;
    }

    public static int multiples(){
        return multiples(1000,3,5);
    }
}