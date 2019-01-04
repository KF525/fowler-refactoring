package Chapter1;

import org.junit.Assert;
import org.junit.Test;

public class RentalTest {

    @Test
    public void getChargeShouldReturnCorrectCharge() {
        Movie movie = new Movie("title", 2);
        Rental rental1 = new Rental(movie, 2);
        Rental rental2 = new Rental(movie, 5);

        Assert.assertEquals(1.5, rental1.getCharge(), 0.0);
        Assert.assertEquals(4.5, rental2.getCharge(), 0.0);
    }
}
