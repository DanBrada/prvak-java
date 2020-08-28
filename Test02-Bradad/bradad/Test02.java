package bradad;
import java.util.Scanner;



public class Test02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Zadejte dvě celá čísla, oddělte je enterem: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print("Čísla, která jsou soudělná s a, nebo b: [");
        for(int i = Math.max(a,b);i>Math.min(a,b);i-- ){
            if((a%i == 0 || b%i==0)&&(i!=b ||i!=a)) {
                System.out.print(i);
                if(i-1 > Math.min(a,b)) System.out.print(",");
            } else continue;
        }
        System.out.println("]");
        System.out.print("Všechna čísla mezi a a b, která jsou mocninami přirozenécho čísla: [");
        for(int y=Math.min(a,b); y<Math.max(a,b);y++){
            if((Math.sqrt(y))==((int)Math.sqrt(y))) System.out.print(y);
            if(y+1<Math.max(a,b))System.out.print(","); else continue;
        }
        System.out.print("]");

    }
}
