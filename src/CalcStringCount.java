/**
 * Created by twer on 9/13/15.
 */
public class CalcStringCount {
    public static void main(String[] args) {
        String s = "AAAAaaaa986$";
        char[] chars = s.toCharArray();
        int upper = 0;
        int lower = 0;
        int other = 0;
        for (int i = 0; i <= chars.length - 1; i++) {
            if (chars[i] < 91 && chars[i] > 64) {
                upper += 1;
            } else if (chars[i] <= 122 && chars[i] >= 97) {
                lower += 1;
            } else {
                other += 1;
            }
        }
        System.out.println("upper=" + upper);
        System.out.println("lower=" + lower);
        System.out.println("other=" + other);
    }
}
