/* Soubor je ulozen v kodovani UTF-8.
 * Kontrola kódování: Příliš žluťoučký kůň úpěl ďábelské ódy. */
import java.util.Scanner;

public class Application
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dobrý den, vložte prvmí číslo, stiskněte enter a vložte drtuhé číslo.");
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();

        System.out.print("Vypisuji násobky pět mezi čísly: [");
        for(int i=i1; i<=i2; i+=5){
            if(i==i1) i = (i-(i%10))+5;
            System.out.print(", "+i);
        }
        System.out.println("]");


        System.out.print("Nyní vypisuji všechna lichá čísla mezi zadanými čísly: [ ");
        for(int i=i2; i>=i1; i-=2){
            if(i%2==0) i--;
            System.out.print(", "+i);
        }
        System.out.println("]");
    }
}
