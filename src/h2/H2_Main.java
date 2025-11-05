package h2;

public class H2_Main {
    public static void main(String[] args) {
        int jahr = 1997;
        boolean schalt = false;

        if (jahr%4==0)
            schalt = true;
        if (jahr%100==0)
            schalt = false;
        if (jahr%400==0)
            schalt = true;

        System.out.println(schalt);
    }
}
