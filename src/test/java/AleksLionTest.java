import com.efremov.AleksLion;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class AleksLionTest {

    @Test
    public void testAleksLionGetKittens() throws Exception {
        AleksLion aleksLion = new AleksLion();
        assertEquals(0, aleksLion.getKittens());
    }

    @Test
    public void testAleksLionGetFriends() throws Exception {
        AleksLion aleksLion = new AleksLion();
        assertEquals(List.of("Марти", "Глория", "Мелман"), aleksLion.getFriends());
    }

    @Test
    public void testAleksLionGetPlaceOfLiving() throws Exception {
        AleksLion aleksLion = new AleksLion();
        assertEquals("Нью-Йоркский зоопарк", aleksLion.getPlaceOfLiving());
    }
}
