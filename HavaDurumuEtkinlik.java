import java.util.Scanner;

public class HavaDurumuEtkinlik {
    public static void main(String[] args) {
        //variable
        double weather;
        Scanner input = new Scanner(System.in);

        System.out.print("Hava kaç derece?\n$ ");
        weather = input.nextDouble();

        if(weather < 5)
            System.out.println("Kayak yapmanızı öneriyoruz.");
        else if(weather < 15)
            System.out.println("Sinemaya gitmenizi öneriyoruz.");
        else if(weather < 25)
            System.out.println("Piknik yapmanızı öneriyoruz.");
        else
            System.out.println("Yüzmeye gitmenizi öneriyoruz.");
    }
}
