package h1;

public class H1_Main {
    public static void main(String[] args) {
       double guthaben= -150.0;
       double monEingang= 50.0;
       int rating = -2;
       boolean warnhinweis = false;
       boolean negativ = false;

       if (guthaben<0)
           negativ = true;
       else
           negativ = false;
       if (guthaben>0)
           rating=rating+3;
       if (guthaben==0)
           rating=rating+2;
       if (guthaben<0 && Math.abs(monEingang)>=Math.abs(guthaben))
           rating=rating+1;
       if (guthaben<0 && Math.abs(monEingang)<Math.abs(guthaben))
           rating=rating-1;
       if (guthaben<0 && monEingang<-guthaben && rating<0)
           warnhinweis=true;
       else
           warnhinweis=false;

       System.out.println("negativ: " + negativ);
       System.out.println("rating: " + rating);
       System.out.println("warnhinweis " + warnhinweis);

    }
}
