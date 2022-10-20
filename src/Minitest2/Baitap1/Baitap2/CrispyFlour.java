package Minitest2.Baitap1.Baitap2;

import java.time.LocalDate;

public class CrispyFlour extends Material implements Discount {
   double quantity;
public CrispyFlour(){

}
    public CrispyFlour(String id, String name, LocalDate manufacturingDate, int cost, double quantity){
    super(id, name, manufacturingDate, cost);
    this.quantity = quantity;
    }

    @Override
    public double getAmount() {
        return this.quantity * this.cost;
    }

    @Override
    public LocalDate getExpiryDate() {
        return manufacturingDate.plusYears(1);
    }

    @Override
    public double getRealMoney() {
        return 0;
    }


}
