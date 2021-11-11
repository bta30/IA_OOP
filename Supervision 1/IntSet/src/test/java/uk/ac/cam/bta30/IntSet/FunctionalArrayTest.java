package uk.ac.cam.bta30.IntSet;

import static com.google.common.truth.Truth.assertThat;
import static org.junit.Assert.assertThrows;
import org.junit.Test;

public class FunctionalArrayTest {

    @Test
    public void get_Returns0_IfUnitiliasedIndex() {
        FunctionalArray arr = new FunctionalArray(5);

        int value = arr.get(2);

        assertThat(value).isEqualTo(0);
    }

    @Test
    public void get_Returns5_IfIndexSetTo5() {
        FunctionalArray arr = new FunctionalArray(5);

        arr.set(2, 5);
        int value = arr.get(2);

        assertThat(value).isEqualTo(5);
    }

    @Test
    public void get_ThrowsException_IfInvalidIndex() {
        FunctionalArray arr = new FunctionalArray(5);

        assertThrows(IllegalArgumentException.class, () -> arr.get(5));
    }

    @Test
    public void set_ThrowsException_IfInvalidIndex() {
        FunctionalArray arr = new FunctionalArray(5);

        assertThrows(IllegalArgumentException.class, () -> arr.set(5, 1));
    }
}