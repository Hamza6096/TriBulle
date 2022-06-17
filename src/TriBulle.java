import java.util.Arrays;

public class TriBulle {
    public static void main(String[] args) {
        int[] t = {4, 5, 2, 1, 3};
        int k =  0;
        for (int i = 0; i < t.length - 1; i++) {
            for (int j = 0; j < t.length - i - 1; j++) {
                k++;
                if (t[j] > t[j + 1]) {
                    int temp = t[j];
                    t[j] = t[j + 1];
                    t[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(t));
        System.out.println(k);
    }
}
