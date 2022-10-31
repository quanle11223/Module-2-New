package Bai19.Thuchanh;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateAccount {
    public static Pattern pattern1;
    public static Matcher matcher1;

    public static final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";

    public ValidateAccount() {
        pattern1 = Pattern.compile(ACCOUNT_REGEX);
    }
    public boolean validateAccount(String regex1) {
        matcher1 = pattern1.matcher(regex1);
        return matcher1.matches();
    }
}
