package Bai9;

public class FizzBuzz {
    int number;

    public Object checkFizzBuzz(int number) {

        if (number > 0) {
            System.out.println("Kết quả là: ");
            if ((number % 3 == 0) && (number % 5 == 0)) {
                return "FizzBuzz";
            } else if ((number % 3 == 0) && (number % 5 > 0)) {
                return "Fizz";
            } else if ((number % 5 == 0) && (number % 3 > 0)) {
                return "Buzz";
            } else {
                return "Khoogng có";
            }
        } return null;
    }
}

