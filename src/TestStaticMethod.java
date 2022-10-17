public class TestStaticMethod {
    public static void main(String[] args) {
        ThuchanhAccess.change();

        ThuchanhAccess s1 = new ThuchanhAccess(111, "Hoang");
        ThuchanhAccess s2 = new ThuchanhAccess(222, "Khanh");
        ThuchanhAccess s3 = new ThuchanhAccess(333 , "Nam");

        s1.display();
        s2.display();
        s3.display();
    }
}
