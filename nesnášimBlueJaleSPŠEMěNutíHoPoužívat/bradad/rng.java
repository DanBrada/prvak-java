package bradad;
import java.util.Arrays;
import java.util.Random;
public class rng {

    public static void main(String[] args){
        Random rng = new Random();
        System.out.println(rng.nextInt(6)+1);
        int[] hody = {0,0,0,0,0,0};
        for(int i=0; i<100;i++){
            int y = rng.nextInt(6)+1;
            hody[y-1]++;
            System.out.println("Padlo "+y+", "+y+" padlo už "+ hody[y-1]+"x");
        }
        Arrays.stream(hody).forEach((x,i) ->{
            System.out.println((i+1)+" padlo "+x+"x");
        });
    }
}
