import com.efremov.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineGetFamilyParameterizedTest {

    private final String family;
    private final boolean expected;

    public FelineGetFamilyParameterizedTest(String family, boolean expected) {
        this.family = family;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"Кошачьи", true},
                {"Заячьи", false},
        });
    }

    @Test
    public void testGetFamily() {
        Feline feline = new Feline();
        assertEquals(expected, feline.getFamily().contains(family));
    }
}
