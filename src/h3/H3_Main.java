package h3;

public class H3_Main {
    public static void main(String[] args) {
        int max = 5; // max plätze
        int fix = 2; // platz erhalten
        int wartend = 2; // leute auf warteliste
        boolean istVoll = false;

        if (max-fix > 0 && wartend > 0) {

            if (wartend < max-fix) {
                fix = fix + wartend;
                wartend = 0;
            }
            else if ( wartend > max-fix) {
            wartend = wartend - (max-fix);
            fix = max;
            }
            if (fix==max)
                istVoll = true;
            else
                istVoll = false;


            }
        System.out.println("Fix: "+fix);
        System.out.println("Wartend: "+wartend);
        System.out.println("Voll? "+istVoll);

    }
}
