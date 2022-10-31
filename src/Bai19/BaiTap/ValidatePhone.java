package Bai19.BaiTap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhone {
    public static Pattern pattern3;
    public static Matcher matcher3;
    public static ValidatePhone validatePhone;
    public static final String[] validPhone = new String[]{"(843)(12312123123)", "(23)(1232324411)", "(234)(1234567894)"};
    public static final String VALIDATE_PHONE = "^\\([0-9]{2}\\)+(\\([0-9]{10}+\\))$";

    public ValidatePhone() {
        pattern3 = Pattern.compile(VALIDATE_PHONE);
    }

    public boolean validates(String regex4) {
        matcher3 = pattern3.matcher(regex4);
        return matcher3.matches();
    }

    public static void main(String[] args) {
        validatePhone = new ValidatePhone();
        for (String s : validPhone) {
            boolean isvalid = validatePhone.validates(s);
            System.out.println(s + isvalid);
        }
    }
}