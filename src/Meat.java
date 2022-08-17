import java.time.LocalDate;

public class Meat extends Material{
    private double weight;


    @Override
    public LocalDate getExpiryDate() {
        return null;
    }
    public Meat(String id, String name, LocalDate manufacturingDate, int cost, double weight) {
    }
    public Meat(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getAmount(){
        return this.getCost()*this.weight;
    }
}
