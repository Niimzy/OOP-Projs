public class Test {

    public static void main(String[] args) {

        Date d1 = new Date(1, 4, 2021);
        Singer s1 = new Singer("Hurl", "Male", "Colombian", d1);
        Music m1 = new Music("Heaven Sent", "3:00", "Hip pop", d1, s1);
        Music m2 = new Music("Hean Sent", "3:00", "Hip pop", d1, s1);



        System.out.println(m1.equals(m2));

    }
}