package Bai19.Thuchanh;

public class ValidateAcountTest {
    public static ValidateAccount validateAccount;

    public static final String[] validAccount = new String[]{"123abc_", "_abc123", "______", "123456", "abcdefgh"};
    public static final String[] invalidAccount = new String[]{".@", "12345", "1234_", "abcde"};

    public static void main(String[] args) {
        validateAccount = new ValidateAccount();
        for (String s : validAccount) {
            boolean isvalid = validateAccount.validateAccount(s);
            System.out.println("Account is " + s + " is valid: " + isvalid);
        }
        for (String s : invalidAccount) {
            boolean isvalid = validateAccount.validateAccount(s);
            System.out.println("Account is " + s + " is valid" + isvalid);
        }
    }
}
