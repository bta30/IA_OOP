package uk.ac.cam.bta30.LowestCommon;

public class LowestCommon {
    static int lowestCommon(long a, long b) {
        int i = 0;
        boolean foundSetBit = false;

        while(a > 0 && b > 0) {
            if((a & b & 1) != 0) {
                foundSetBit = true;
                break;
            }

            i++;
            a >>= 1;
            b >>= 1;
        }

        return foundSetBit ? i : -1;
    }
}
