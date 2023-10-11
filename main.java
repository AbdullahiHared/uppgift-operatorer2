import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        

        // Uppgift avrunda till närmaste tusental.
        System.out.println("Enter a value to check ");
        double userNumber = sc.nextInt();

        double checkResult = Math.round(userNumber/1000) * 1000;
        System.out.println("Din avrundat tal är " + checkResult);


        // Uppgift omvandla bråktal  till ett tal i blandat form
          
        System.out.print("Mäta in täljäre: ");
        int täljäre = sc.nextInt();

        System.out.print("Mäta in nämnare: ");
        int nämnare = sc.nextInt();

        int divide = täljäre / nämnare;
        System.out.println(divide);
        int remainder = täljäre % nämnare;
        System.out.println("Talet "  + täljäre + ("/") + nämnare +" blir " + divide + " " + remainder + "/" + nämnare);

       // Uppgift omvandla till sekunder

       System.out.print("Ange antalet timmar: ");
       double hours = sc.nextInt();

       System.out.print("Ange antalet minuter: ");
       double minutes = sc.nextInt();

       System.out.print("Ange antalet sekunder: ");
       double seconds = sc.nextInt();

       double timmar = hours + seconds / 360 + minutes / 60;
       double minuter = hours * 60 + seconds / 60 + minutes;
       double sekunder = timmar * 360 + minuter * 60 + seconds;
       
       System.out.println("Tidomvandlingen ger : " + timmar + "h" + " = " + minuter + " min " + " = " + sekunder);

    //    double toHours = hours + (minutes / 60) + seconds / 360;

    //    System.out.println("Tidsomvadling ger : " + toHours + "h");




    }
}