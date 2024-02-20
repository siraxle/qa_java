import com.efremov.*;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AnimalTest {

    private Feline mockFeline;
    private CatFamily mockCatFamily;

    @Before
    public void setUp() {
        mockFeline = mock(Feline.class);
        mockCatFamily = mock(CatFamily.class);
    }

    @Test
    public void testGetFoodHerbivore() throws Exception {
        Animal animal = new Animal();
        assertEquals(List.of("Трава", "Различные растения"), animal.getFood("Травоядное"));
    }

    @Test
    public void testGetFoodCarnivore() throws Exception {
        Animal animal = new Animal();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), animal.getFood("Хищник"));
    }

    @Test
    public void testGetFoodUnknown() {
        Animal animal = new Animal();
        assertThrows(Exception.class, () -> animal.getFood("Неизвестный вид"));
    }

    @Test
    public void testGetFamily() {
        Animal animal = new Animal();
        assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", animal.getFamily());
    }

    @Test
    public void testCat() throws Exception {
        when(mockFeline.eatMeat()).thenReturn(List.of("Meat"));

        Cat cat = new Cat(mockFeline);

        assertEquals("Мяу", cat.getSound());
        assertEquals(List.of("Meat"), cat.getFood());
    }

    @Test
    public void testLionConstructorMale() throws Exception {
        when(mockCatFamily.getKittens()).thenReturn(3);
        when(mockCatFamily.doesHaveMane()).thenReturn(true);
        when(mockCatFamily.getFood()).thenReturn(List.of("Meat"));

        Lion lion = new Lion("Самец", mockCatFamily);

        assertEquals(3, lion.getKittens());
        assertTrue(lion.doesHaveMane());
        assertEquals(List.of("Meat"), lion.getFood());
    }

    @Test
    public void testLionConstructorFemale() throws Exception {
        when(mockCatFamily.getKittens()).thenReturn(4);
        when(mockCatFamily.doesHaveMane()).thenReturn(false);
        when(mockCatFamily.getFood()).thenReturn(List.of("Meat"));

        Lion lion = new Lion("Самка", mockCatFamily);

        assertEquals(4, lion.getKittens());
        assertFalse(lion.doesHaveMane());
        assertEquals(List.of("Meat"), lion.getFood());
    }

    @Test
    public void testLionConstructorInvalidSex() {
        try {
            new Lion("InvalidSex", mockCatFamily);
        } catch (Exception e) {
            assertEquals("Используйте допустимые значения пола животного - самец или самка", e.getMessage());
        }
    }

    @Test
    public void testEatMeat() throws Exception {
        Feline feline = new Feline();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }


    @Test
    public void testGetKittens() {
        Feline feline = new Feline();
        int result = feline.getKittens();

        assertEquals(1, result);
    }

}
