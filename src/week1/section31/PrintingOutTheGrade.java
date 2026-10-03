package week1.section31;

public class PrintingOutTheGrade {
    public static void main(String[] args) {
        char a = 'A';
        String aDesc = "91-100%";

        char b = 'B';
        String bDesc = "81-90%";

        char c = 'C';
        String cDesc = "71-80%";

        char d = 'D';
        String dDesc = "61-70%";

        char f = 'F';
        String fDesc = "51-60%";

        System.out.printf("%c - %s\n", a, aDesc);
        System.out.printf("%c - %s\n", b, bDesc);
        System.out.printf("%c - %s\n", c, cDesc);
        System.out.printf("%c - %s\n", d, dDesc);
        System.out.printf("%c - %s\n", f, fDesc);



    }
}
