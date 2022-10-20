package Minitest2.Baitap1.Baitap2;

import java.time.LocalDate;

public class Meat extends Material implements Discount{
    double weight;
public Meat(){

}
    public Meat(String id, String name, LocalDate manufacturingDate, int cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }


    @Override
    public double getAmount() {
        return this.cost * this.weight;
    }

    @Override
    public LocalDate getExpiryDate() {
        return manufacturingDate.plusDays(7);
    }

    @Override
    public double getRealMoney() {
        return 0;
    }
}
