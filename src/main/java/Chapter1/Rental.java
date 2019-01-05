package Chapter1;

public class Rental {
    private Movie movie;
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public int getDaysRented() {
        return this.daysRented;
    }

    public Movie getMovie() {
        return this.movie;
    }

    public int getFrequentRenterPoints() {
        if ((this.getMovie().getPriceCode() == Movie.NEW_RELEASE) &&
                this.getDaysRented() > 1) {
            return 2;
        } else {
            return 1;
        }
    }

    public double getCharge() {
        return movie.getCharge(daysRented);
    }
}
