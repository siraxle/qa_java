import com.efremov.AleksLion;
import com.efremov.CatFamily;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AleksLionTest {

    @Test
    public void testAleksLionConstructorMale() throws Exception {
        CatFamily mockCatFamily = mock(CatFamily.class);
        when(mockCatFamily.getKittens()).thenReturn(3);
        when(mockCatFamily.doesHaveMane()).thenReturn(true);
        when(mockCatFamily.getFood()).thenReturn(List.of("Meat"));

        AleksLion aleksLion = new AleksLion("Самец", mockCatFamily, 5);

        assertEquals(3, aleksLion.getKittens());
        assertTrue(aleksLion.doesHaveMane());
        assertEquals(List.of("Meat"), aleksLion.getFood());
        assertEquals(5, aleksLion.getRoarVolume());
    }

    @Test
    public void testAleksLionConstructorFemale() throws Exception {
        CatFamily mockCatFamily = mock(CatFamily.class);
        when(mockCatFamily.getKittens()).thenReturn(4);
        when(mockCatFamily.doesHaveMane()).thenReturn(false);
        when(mockCatFamily.getFood()).thenReturn(List.of("Meat"));

        AleksLion aleksLion = new AleksLion("Самка", mockCatFamily, 8);

        assertEquals(4, aleksLion.getKittens());
        assertFalse(aleksLion.doesHaveMane());
        assertEquals(List.of("Meat"), aleksLion.getFood());
        assertEquals(8, aleksLion.getRoarVolume());
    }

    @Test
    public void testAleksLionConstructorInvalidSex() {
        CatFamily mockCatFamily = mock(CatFamily.class);

        Throwable exception = assertThrows(Exception.class, () -> new AleksLion("InvalidSex", mockCatFamily, 10));

        assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }
}
