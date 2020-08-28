package bradad;
import java.util.Scanner;
import java.util.Random;
import bradad.cvic04;

public class cviceni03{
    public static void main(String[] args){
        /*Scanner sc = new Scanner(System.in);
        boolean hasGuessed = false;
        int in;
        int attempts = 0;
        int rand = new Random().nextInt(99)+1;
        do{
            System.out.print("Zadejte číslo, které si myslíte, že jsem vygeneroval: ");
            in = sc.nextInt();
            if(in == rand){
                attempts++;
                hasGuessed = true;
            }else{
                attempts++;
                if(in>rand) System.out.println("moc");
                else if(in<rand)System.out.println("málo");
            }
        }while(!hasGuessed);
        System.out.println("Uhádnuto na "+attempts+". pokus");*/

        cvic04 c = new cvic04(new Random(), 99, 10);
    }
}