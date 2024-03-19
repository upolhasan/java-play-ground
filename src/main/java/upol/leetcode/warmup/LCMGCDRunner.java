package upol.leetcode.warmup;

public class LCMGCDRunner {

    public static void main(String[] args) {
        BiNumber biNumber = new BiNumber(15,20);
        System.out.println(biNumber.calculateLCM());

        BiNumber biNumber2 = new BiNumber(48,18);
        System.out.println(biNumber2.calculateGCD());
    }
}
