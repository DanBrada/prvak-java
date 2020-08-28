package bradad;

import java.util.*;
import java.util.Collections;

public class tohlemenebavi {
    static List<String> kombHashe = new ArrayList<>();
    public static void main(String[] args) throws InterruptedException {
        Random r = new Random();

        Integer[] pole = new Integer[10];
        for(int i=0; i<pole.length; ++i){
            pole[i] = r.nextInt(100);
        }

        boolean isSorted = false;
        while(!isSorted){
            for(Integer x: pole) System.out.printf("%d,",x);
            for(int i = 0; i<pole.length;++i) {
                if (pole[i] > pole[i + 1] && i+1 < pole.length) {
                    pole =tohlemenebavi.shufflePole(pole);
                    isSorted = false;
                    System.out.print('\n');
                    Thread.sleep(15);
                    break;
                }else{
                    isSorted = true;
                }
            }
        }

    }

    private static Integer[] shufflePole(Integer[] pole){
        List<Integer> poleList = new ArrayList<>();
        poleList.addAll(Arrays.asList(pole));
        Collections.shuffle(poleList);

        if(kombHashe.contains(String.valueOf(poleList.hashCode()))){
            shufflePole(pole);
        }else{
            kombHashe.add(String.valueOf(poleList.hashCode()));
            System.out.format("Uloženo %d kombinací", poleList.size());
        }
        return  poleList.toArray(new Integer[poleList.size()]);
    }
}


//[]{}
