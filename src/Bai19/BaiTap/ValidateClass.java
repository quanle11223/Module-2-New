package Bai19.BaiTap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClass {
    public static Pattern pattern2;
    public static Matcher matcher2;
    public static final String[] validClass = new String[]{"A10434B", "H012345N", "C1234I"};
    public static ValidateClass validateClass;

    public static final String CLASS_REGEX = "^[ACP]+[0-9]{4}+[GHIKLM]$";

    public ValidateClass() {
        pattern2 = Pattern.compile(CLASS_REGEX);
    }

    public boolean validates(String regex1) {
        matcher2 = pattern2.matcher(regex1);
        return matcher2.matches();
    }

    public static void main(String[] args) {
        validateClass = new ValidateClass();
        for (String aClass : validClass) {
            boolean isvalid = validateClass.validates(aClass);
            System.out.println(aClass + "-" + isvalid);

        }
    }
}
