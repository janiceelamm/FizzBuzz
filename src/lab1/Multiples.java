package lab1;

public class Multiples {
    public static void main(String[] args) {

        System.out.println(multiples());
    }

    static int multiples() {
        int count = 0; // keep track of how many multiples of 3 or 5

        for (int v = 3; v < 1000;
             v++) {
            if (v % 3 == 0 || v % 5 == 0) ;
            count++;
        }
        return count;
    }
}