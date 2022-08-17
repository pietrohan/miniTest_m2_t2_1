import java.time.LocalDate;

public class CrispyFlour extends Material {
    private double quanity;

    public CrispyFlour() {
    }

    public CrispyFlour(double quanity) {
        this.quanity = quanity;
    }

    public CrispyFlour(String id, String name, LocalDate manufacturingDate, int cost, double quanity) {
        super(id, name, manufacturingDate, cost);
        this.quanity = quanity;
    }

    public double getQuanity() {
        return quanity;
    }

    public void setQuanity(double quanity) {
        this.quanity = quanity;
    }

    public double getAmount() {
        return quanity * this.getCost();
    }

    @Override
    public LocalDate getExpiryDate() {
        return null;
    }
}