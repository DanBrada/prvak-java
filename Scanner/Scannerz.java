/* UTF-8 codepage: Příliš žluťoučký kůň úpěl ďábelské ódy. ÷ × ¤
 * «Stereotype», Section mark-§, Copyright-©, Alpha-α, Beta-β, Smile-☺
 */


import java.util.Scanner;

public class Scannerz
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //in
        System.out.print("Napiš sem první celé číslo: ");
        int i1 = sc.nextInt();
        System.out.print("napiš se druhé celé číslo: ");
        int i2 = sc.nextInt();

        //1)
        System.out.println("Jejich součet je: "+(i1+i2));
        System.out.println("Jejich rozdíl je: "+(i1-i2));
        System.out.println("Jejich rozdíl je: "+(i1*i2));
        System.out.println("Jejich podíl (zbytek) je: "+(i1/i2)+" ("+(i1%i2)+") \n");

        //2)
        if(i1%2 == 1 && i2%2 == 1){
            System.out.println("Obě čísla jsou lichá.");
        }else if(i1%2 == 0 && i2%2 == 0){
            System.out.println("Obě čísla jsou sudá.");
        }else{
            System.out.println("Obě čísla nejsou ani sudá ani lichá.");
        }

        if(i1 != i2){
            System.out.println("Čísla jsou různá.");
        }else{
            System.out.println("Čísla jsou stejná.");
        }
    }
}