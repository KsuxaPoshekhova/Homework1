import ru.netology.service.CashbackHackService;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class CashbackHackServiceTest {
    @org.testng.annotations.Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual ,expected );
    }
    @org.testng.annotations.Test
    public void testRemain2() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(actual ,expected  );
    }
    @org.testng.annotations.Test
    public void testRemain3() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual ,expected  );
    }
}
