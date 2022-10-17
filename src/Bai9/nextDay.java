package Bai9;

public class nextDay {

      public String nextDay1(int days, int months, int years) {

//
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Nhập ngày: ");
//            days = scanner.nextInt();
//            System.out.println("Nhập tháng:");
//            months = scanner.nextInt();
//            System.out.println("Nhập năm: ");
//            years = scanner.nextInt();

          if (days < 31) {
              if (months != 2) {
//                  return "Ngày tiếp theo là: " + (days + 1) + "Tháng tiếp theo là: " + months + years;
                  return days+1 + "/" + months + "/" + years;
              } else if (days == 31) {
                  if (months != 2) {
                      return "Ngày tiếp theo là: " + (days == 1) + "Tháng tiếp theo là: " + (months + 1) + years;
                  }
              } else if (months == 2) {
                  if (days == 29) {
                      return "Ngày tiếp theo là: " + (days == 1) + "Tháng tiếp theo là: " + (months + 1) + years;
                  }

              } else {
                  return "Ngày tiếp theo là: " + (days + 1) + "Tháng tiếp theo là: " + (months + 1) + years;
              }
          }

          return "";
      }
}

