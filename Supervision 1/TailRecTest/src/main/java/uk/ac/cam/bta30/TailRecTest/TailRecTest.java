package uk.ac.cam.bta30.TailRecTest;

public class TailRecTest {
    public static int addOnes(int n, int tail) {
        if(n == 0) {
            return tail;
        }
        else {
            return addOnes(n - 1, tail + 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(addOnes(1000000, 0));
    }
}