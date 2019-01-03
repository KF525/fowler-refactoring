package Chapter1;

import org.junit.Assert;
import org.junit.Test;

public class CustomerTest {

    Customer customer = new Customer("test");

    @Test
    public void statementReturnsCustomerOverview() {
        Movie movie = new Movie("test title", 0);
        Rental rental = new Rental(movie, 12);
        customer.addRental(rental);
        String expected = "Rental Record for test\n" +
                "\ttest title\t17.0\n" +
                "Amount owed is 0.0\n" +
                "You earned 1 frequent renter points";
        Assert.assertEquals(expected, customer.statement().trim());
    }


}
