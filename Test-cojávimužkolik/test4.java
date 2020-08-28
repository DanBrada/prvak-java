import java.util.*;
public class test4
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        boolean isNumValid = false;
        int cyp;
        do{
            System.out.println("Zadejte liché číslo, které je mezi 15 a 35");
            cyp = sc.nextInt();
            if(cyp%2!=0&&cyp >= 15 && cyp <=35) isNumValid = true;
        }while(!isNumValid);
        int[] cislo2 = new int[cyp];
        for(int i=0; i<cislo2.length;++i) cislo2[i] = new Random().nextInt(89)+10;
        int souc=0, poc=0;
        int task4min=100;
        for(int x : cislo2){
            if(x%10 != x/10){
                souc+=x;
                ++poc;
            }
            if(((x%10+x/10)%2!=0) && x<task4min) task4min = x;
        }   
        double task3 = (double)souc /(double)poc;
        System.out.printf("Od uživatele jsem načetl číslo %d,%n Vygeneroval jsem tato čísla: [", cyp);
        for(int x: cislo2) System.out.printf("%d,",x);
        System.out.printf("],%n Průměrem čísel která nemají stejné číslice je %s, nejmensím vygenerovaným číslem s lichým ciferným součinem je %d%n", String.valueOf(task3), task4min);
    }
}