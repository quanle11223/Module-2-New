package Minitest2.Baitap1;

public class FictionBook extends KethuaBook {
    private String category;

    public FictionBook() {

    }
    public FictionBook (double bookCode, String name, int price, String author, String category){
        super(bookCode, name,price,author);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

