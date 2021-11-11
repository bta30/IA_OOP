package uk.ac.cam.bta30.IntSet;

import static com.google.common.truth.Truth.assertThat;
import org.junit.Test;

public class SearchSetTest {

    @Test
    public void getNumberElements_returns0_whenSetIsEmpty() {
        SearchSet set = new SearchSet();

        int elems = set.getNumberElements();

        assertThat(elems).isEqualTo(0);
    }

    @Test
    public void getNumberElements_returns3_when3DistinctElementsInserted() {
        SearchSet set = new SearchSet();

        set.insert(2);
        set.insert(1);
        set.insert(3);
        int elems = set.getNumberElements();

        assertThat(elems).isEqualTo(3);
    }

    @Test
    public void getNumberElements_returns1_when3IdenticalElementsInserted() {
        SearchSet set = new SearchSet();

        set.insert(1);
        set.insert(1);
        set.insert(1);
        int elems = set.getNumberElements();

        assertThat(elems).isEqualTo(1);
    }

    @Test
    public void contains_returnsTrue_whenInsertElemThenCheckSameElem() {
        SearchSet set = new SearchSet();

        set.insert(1);
        boolean isInSet = set.contains(1);

        assertThat(isInSet).isEqualTo(true);
    }

    @Test
    public void contains_returnsFalse_whenInsertElemThenCheckDiffElem() {
        SearchSet set = new SearchSet();

        set.insert(1);
        boolean isInSet = set.contains(2);

        assertThat(isInSet).isEqualTo(false);
    }

    @Test
    public void contains_returnsFalse_whenCheckEmptyList() {
        SearchSet set = new SearchSet();

        boolean isInSet = set.contains(1);

        assertThat(isInSet).isEqualTo(false);
    }
}