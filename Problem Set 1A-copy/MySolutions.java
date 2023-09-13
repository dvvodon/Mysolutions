
/**
 * Write a description of class MySolutions here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MySolutions
{
   public void celciusToFarenheiht(){ 
    double farenheit;
    double celcius = 66;
    
    farenheit = (celcius * (9/5)) + 32;
    
    System.out.println(celcius + "°C " + " = " +  farenheit + " °F " );
    }
    
    public void elapsedTime(){
        int nowTimeH = 10;
        int nowTimeM = (nowTimeH * 60) + 45;
        int nowTimeS = (nowTimeM * 60) + 21;
        double dayLength = 24*3600;
        System.out.println("Seconds since midnight " + nowTimeS + " seconds");
        System.out.println("Seconds till midnight " + (dayLength - nowTimeS) + " seconds");
        System.out.println("Precentage of day passed " + ((nowTimeS/dayLength)*100) + "%");
    }
    
    public void secondsToHMS(){
        int nowTimeS = 38721;
        int H = (nowTimeS / 3600);
        int M = ((nowTimeS % 3600)/60);
        int S = (nowTimeS -  ((H*3600) + (M*60)));
        System.out.println(H + " hours," + M + " minutes," + S + " seconds");
    }
}
