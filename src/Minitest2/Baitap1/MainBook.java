package Minitest2.Baitap1;

public class MainBook {


    public static void main(String[] args) {
        ProgrammingBook [] programmingBook = new ProgrammingBook[5];
        programmingBook[0] = new ProgrammingBook(101, "BookP1", 1000, "A1", "Java", "50 trang");
        programmingBook[1] = new ProgrammingBook(102, "BookP2", 1001, "A2", "PHP", "51 trang");
        programmingBook[2] = new ProgrammingBook(103, "BookP3", 1002, "A3", "Python", "52 trang") ;
        programmingBook[3] = new ProgrammingBook(104, "BookP4", 1003, "A4", "Js", "53 trang") ;
        programmingBook[4] = new ProgrammingBook(105, "BookP5", 1004, "A5", "C++", "54 trang") ;

        FictionBook[] fictionBooks = new FictionBook[5];
        fictionBooks[0] = new FictionBook(201, "BookF1", 2000, "B1", "Viễn tưởng 1");
        fictionBooks[1] = new FictionBook(202, "BookF2", 2001, "B2", "Viễn tưởng 2");
        fictionBooks[2] = new FictionBook(203, "BookF3", 2002, "B3", "Viễn tưởng 3");
        fictionBooks[3] = new FictionBook(204, "BookF4", 2003, "B4", "Viễn tưởng 4");
        fictionBooks[4] = new FictionBook(205, "BookF5", 2004, "B5", "Viễn tưởng 5");

        double sum1 = sumPriceOfBook(fictionBooks, programmingBook);
        System.out.println("Tổng tiền sách là: " + sum1);
        String countPro = countProgrammingBook(programmingBook);
        System.out.println("Số sách trong tủ Program có ngôn ngữ Java là: " + countPro);
        String countFic = countFictionBook(fictionBooks);
        System.out.println("Số sách trong tủ Fiction có mô tả Viễn tưởng 1 là: " + countFic);
        int countlowFic = countFictionBooklowOneHundred(fictionBooks);
        System.out.println("Số sách trong tủ Fiction có giá dưới 100 là: " + countlowFic);
    }

    public static double sumPriceOfBook(FictionBook[] fictionBooks, ProgrammingBook [] programmingBook) {
        int sum = 0;
        for (FictionBook fictionBook : fictionBooks) {
            fictionBook.getPrice();
            sum += fictionBook.getPrice();
        }

        for (ProgrammingBook programmingBook1 : programmingBook){
            programmingBook1.getPrice();
            sum += programmingBook1.getPrice();
        }
            return sum ;
    }
    public static String countProgrammingBook(ProgrammingBook [] programmingBook){
        String txt = "Java";
        int count1 = 0;
        for (int i = 0; i < programmingBook.length; i++) {
           if (programmingBook[i].getLanguage() == txt) {
               count1++;
           }
       }
        return String.valueOf(count1);
     }

     public static String countFictionBook(FictionBook [] fictionBooks){
        String txt1 = "Viễn tưởng 1";
        int count2 = 0;
        for (int i = 0; i < fictionBooks.length; i++){
            if (fictionBooks[i].getCategory() == txt1) {
                count2++;
            }
        }
        return String.valueOf(count2);
     }
     public static int countFictionBooklowOneHundred(FictionBook [] fictionBooks){
        int count3 = 0 ;
        for (int i = 0 ; i < fictionBooks.length; i++) {
            if (fictionBooks[i].getPrice() < 100){
                count3++;
            }
         }
        return count3;
     }
 }



