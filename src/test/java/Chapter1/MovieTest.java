package Chapter1;

import org.junit.Assert;
import org.junit.Test;

public class MovieTest {


    @Test
    public void getChargeShouldReturnCorrectCharge() {
        Movie movie0 = new Movie("title0", 0);
        Movie movie1 = new Movie("title1", 1);
        Movie movie2 = new Movie("title2", 2);

        Assert.assertEquals(2, movie0.getCharge(2), 0.0);
        Assert.assertEquals(3.5, movie0.getCharge(3), 0.0);
        Assert.assertEquals(9, movie1.getCharge(3), 0.0);
        Assert.assertEquals(1.5, movie2.getCharge(3), 0.0);
        Assert.assertEquals(3.0, movie2.getCharge(4), 0.0);
    }
}
