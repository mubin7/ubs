import com.ubs.BerlinClock;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BerlinClockTest {

    BerlinClock berlinClock;

    @Before
    public void setUp() throws Exception {
        berlinClock = new BerlinClock();
    }

    @Test
    public void testSetClockParts() {
        String time = "12:13:14";
        berlinClock.setClockParts(time);
        Assert.assertEquals(12, berlinClock.getHour());
        Assert.assertEquals(13, berlinClock.getMinute());
        Assert.assertEquals(14, berlinClock.getSecond());
    }

    @Test
    public void testSetTopRow() {
        String time = "12:13:14";
        berlinClock.setClockParts(time);
        berlinClock.setTopRow();
        Assert.assertEquals(0, berlinClock.getTopRow()[0]);
    }

    @Test
    public void testSetHour() {
        String time = "12:13:14";
        berlinClock.setClockParts(time);
        berlinClock.setHour();
        Assert.assertEquals(1, berlinClock.getFirstRowHour()[0]);
        Assert.assertEquals(1, berlinClock.getFirstRowHour()[1]);
        Assert.assertEquals(0, berlinClock.getFirstRowHour()[2]);
        Assert.assertEquals(0, berlinClock.getFirstRowHour()[3]);
        Assert.assertEquals(1, berlinClock.getSecondRowHour()[0]);
        Assert.assertEquals(1, berlinClock.getSecondRowHour()[1]);
        Assert.assertEquals(0, berlinClock.getSecondRowHour()[2]);
        Assert.assertEquals(0, berlinClock.getSecondRowHour()[3]);
    }

    @Test
    public void testSetMinute() {
        String time = "12:13:14";
        berlinClock.setClockParts(time);
        berlinClock.setMinute();
        Assert.assertEquals(1, berlinClock.getFirstRowMinute()[0]);
        Assert.assertEquals(1, berlinClock.getFirstRowMinute()[1]);
        Assert.assertEquals(0, berlinClock.getFirstRowMinute()[2]);
        Assert.assertEquals(0, berlinClock.getFirstRowMinute()[3]);
        Assert.assertEquals(0, berlinClock.getFirstRowMinute()[4]);
        Assert.assertEquals(0, berlinClock.getFirstRowMinute()[5]);
        Assert.assertEquals(0, berlinClock.getFirstRowMinute()[6]);
        Assert.assertEquals(0, berlinClock.getFirstRowMinute()[7]);
        Assert.assertEquals(0, berlinClock.getFirstRowMinute()[8]);
        Assert.assertEquals(0, berlinClock.getFirstRowMinute()[9]);
        Assert.assertEquals(0, berlinClock.getFirstRowMinute()[10]);
        Assert.assertEquals(1, berlinClock.getSecondRowMinute()[0]);
        Assert.assertEquals(1, berlinClock.getSecondRowMinute()[1]);
        Assert.assertEquals(1, berlinClock.getSecondRowMinute()[2]);
        Assert.assertEquals(0, berlinClock.getSecondRowMinute()[3]);
    }

    @After
    public void tearDown() throws Exception {

    }
}
