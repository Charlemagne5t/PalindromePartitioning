import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SolutionTest {
    @Test
    public void partitionTest1() {
        String s = "aab";
        List<List<String>> expected = new ArrayList<>(
                List.of(
                        new ArrayList<>(List.of("a", "a", "b")),
                        new ArrayList<>(List.of("aa", "b"))
                )
        );
        List<List<String>> actual = new Solution().partition(s);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void partitionTest2() {
        String s = "a";
        List<List<String>> expected = new ArrayList<>(
                List.of(
                        new ArrayList<>(List.of("a"))

                )
        );
        List<List<String>> actual = new Solution().partition(s);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void partitionTest3() {
        String s = "efe";
        List<List<String>> expected = new ArrayList<>(
                List.of(
                        new ArrayList<>(List.of("a"))

                )
        );
        List<List<String>> actual = new Solution().partition(s);

        Assert.assertEquals(expected, actual);
    }
}
