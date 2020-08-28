/* UTF-8 codepage: Příliš žluťoučký kůň úpěl ďábelské ódy. ÷ × ¤
 * «Stereotype», Section mark-§, Copyright-©, Alpha-α, Beta-β, Smile-☺
 */


import java.util.Scanner;


public class test01
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dobrý den, zadejte prosím čísla ve formátu: cislo1,cislo2,cislo3: ");
        String[] in = sc.nextLine().split(",");
        if(in.length >=3){
            double aritAvr = (Integer.parseInt(in[0].toCharArray() )+Integer.parseInt(in[1])+Integer.parseInt(in[2]))/3;
            System.out.println("Aritmetický průměr zadaných čísel je: "+aritAvr);
            int sign = Integer.parseInt(in[0])+Integer.parseInt(in[1])+Integer.parseInt(in[2]);
            switch((int)Math.signum(sign)){
                case -1:
                    System.out.println("Součet zadaných čísel je záporný.");
                    break;
                case 0:
                    System.out.println("Součet zadaných čísel je 0.");
                    break;
                case 1:
                    System.out.println("Součet zadaných čísel je kladný.");
                    break;
            }
            
            System.out.println("Zbytky po dělění jedenácti: "+Integer.parseInt(in[0])%11+","+Integer.parseInt(in[1])%11+","+Integer.parseInt(in[2])%11);
            
            
            if(Integer.parseInt(in[0])%Integer.parseInt(in[1])==0||Integer.parseInt(in[0])%Integer.parseInt(in[2])==0) System.out.println("Číslo "+in[0]+" má v ostatních zadaných číslech dělitele.");
            if(Integer.parseInt(in[1])%Integer.parseInt(in[0])==0||Integer.parseInt(in[1])%Integer.parseInt(in[2])==0) System.out.println("Číslo "+in[1]+" má v ostatních zadaných číslech dělitele.");
            if(Integer.parseInt(in[2])%Integer.parseInt(in[1])==0||Integer.parseInt(in[2])%Integer.parseInt(in[0])==0) System.out.println("Číslo "+in[2]+" má v ostatních zadaných číslech dělitele.");
        } else{
            System.out.println("Dostal jsem málo čísel, restartujte a zkuste znovu :)");
        }
    }
}
