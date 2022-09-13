package square;

public class Power {
    public static void main(String[] args) {
        int[] powarr = new int[100];
        for(int i = 0; i < 100; i++) {
            powarr[i] = (int) Math.pow(i + 1, 2);
        }
    }
}