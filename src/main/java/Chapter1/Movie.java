package Chapter1;

public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String title;
    private Price priceCode;

    public Movie(String title, int priceCode) {
        this.title = title;
        setPriceCode(priceCode);
    }

    public int getPriceCode() {
        return this.priceCode.getPriceCode();
    }

    public void setPriceCode(int arg) {
        switch (arg) {
            case REGULAR:
                this.priceCode = new RegularPrice();
                break;
            case NEW_RELEASE:
                this.priceCode = new NewReleasePrice();
                break;
            case CHILDRENS:
                this.priceCode = new ChildrensPrice();
                break;
            default:
                throw new IllegalArgumentException("Incorrect Price Code");
        }
    }

    public String getTitle() {
        return this.title;
    }

    public double getCharge(int daysRented) {
        return priceCode.getCharge(daysRented);
    }

    public int getFrequentRenterPoints(int daysRented) {
      return priceCode.getFrequentRenterPoints(daysRented);
    }
}
