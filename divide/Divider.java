package divide;

public class Divider {
    public static void main(String[] args) {
        for(int i = 100; i <= 200; i++) {
            if(i % 3 == 0) System.out.println(i + " can be divided by 3");
            if(i % 5 != 0 && i % 4 == 0) System.out.println(i + " cannot be divided by 5 but can be divided by 4");
            if(prime(i)) System.out.println(i + " is prime"); 
        }

    }
    static boolean prime(int j) {
        for(int i = j - 1; i > 1; i--) {
            if(j % i == 0) {
                return false;
            }
        }
        return true;
    }
}
