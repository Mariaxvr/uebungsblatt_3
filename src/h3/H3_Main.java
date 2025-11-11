package h3;

public class H3_Main {
    public static void main(String[] args) {
        int max = 10; // max plätze
        int fix = 10; // platz erhalten
        int wartend = 5; // leute auf warteliste
        boolean istVoll = true;

        if (max-fix > 0 && wartend >= 0) {

            if (wartend <= max-fix) {
                fix = fix + wartend;
                wartend = 0;
            }
            else if ( wartend > max-fix) {
                wartend = wartend - (max - fix);
                fix = max;
            }
            if (fix==max)
                istVoll = true;
            else if (fix!=max)
                istVoll = false;


            }
        System.out.println("Fix: "+fix);
        System.out.println("Wartend: "+wartend);
        System.out.println("Voll: "+istVoll);

    }
}
