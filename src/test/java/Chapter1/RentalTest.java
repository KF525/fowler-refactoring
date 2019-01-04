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

    @Test
    public void getFrequentRenterPointsReturnsCorrectPointsForNewRelease() {
        Movie movie = new Movie("title", 1);
        Rental rental1 = new Rental(movie, 1);
        Rental rental2 = new Rental(movie, 2);

        Assert.assertEquals(1, rental1.getFrequentRenterPoints());
        Assert.assertEquals(2, rental2.getFrequentRenterPoints());
    }

    @Test
    public void getFrequentRenterPointsReturnsCorrectPointsForOtherCategories() {
        Movie movie1 = new Movie("title", 0);
        Movie movie2 = new Movie("title", 2);
        Rental rental1 = new Rental(movie1, 2);
        Rental rental2 = new Rental(movie2, 2);

        Assert.assertEquals(1, rental1.getFrequentRenterPoints());
        Assert.assertEquals(1, rental2.getFrequentRenterPoints());

    }
}
