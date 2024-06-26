public class b1 {
    public static void main(String[] args) {
        Transport bmw = new Transport();
        bmw.SetValue(250.1f, 2500, "White", new byte[]{0, 10, 100});
        String res1 = bmw.getValue();

        System.out.println(res1);
    }
}