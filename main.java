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

       


    }
}