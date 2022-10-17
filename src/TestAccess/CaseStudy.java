package TestAccess;

public class CaseStudy {
    public String phone;
    public double price;
    public String product = "Iphone 11";
    public String color;

   public CaseStudy() {
   }
   public String getProduct() {
       return this.product;
   }
   public double getPrice() {
       return this.price;
   }
   public String getColor(){
       return this.color;
   }
   public String setProduct(String product) {
       this.product = product;
       return product;
   }
   public double setPrice(double price) {
       this.price = price;
       return price;
   }
   public String setColor(String color) {
       this.color = color;
       return color;
   }
}
