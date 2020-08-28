/* UTF-8 codepage: Příliš žluťoučký kůň úpěl ďábelské ódy. ÷ × ¤
 * «Stereotype», Section mark-§, Copyright-©, Alpha-α, Beta-β, Smile-☺
 */

import java.util.Scanner;
/*******************************************************************************
 * Třída {@code Application} je hlavní třídou projektu,
 * který ...
 *
 * @author  author name
 * @version 0.00.0000 — 20yy-mm-dd
 */
public class Application
{
    /***************************************************************************
     * Metoda, prostřednictvím níž se spouští celá aplikace.
     *
     * @param args Parametry příkazového řádku
     */
    public static void main(String[] args)
    {
        //TODO Kód spouštějící aplikaci
        //throw new UnsupportedOperationException("Prozatím neimplementováno");
        Scanner sc  = new Scanner(System.in);
        System.out.print("Napiš svoje jméno: ");
        String username = sc.nextLine();
        System.out.println(String.format("Ahoj, %s, jak se máš?", username));
        
        
    }
}
