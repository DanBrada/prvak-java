package bradad;
import java.util.*;


public class cvic04 {

    public cvic04(Random r, int strop){
        int rand;
        do{
            rand = r.nextInt(strop);
            System.out.println("Generuji: "+ rand+" Zbytek po dělení je: "+rand%11);
        }while(rand%11 != 0);
    }

    public cvic04(Random r,int strop, int min){
        int rand = 0;
        ArrayList<Integer> AvrArray = new ArrayList<Integer>();
        do{
            rand = r.nextInt((strop-min)+1)+min;
            AvrArray.add(rand);
            System.out.println("Generuji: "+ rand+" Zbytek po dělení je: "+rand%11);
        }while(rand%11 != 0);

        double average = makeAverage(AvrArray);
        System.out.println("Průměr čísel je: "+average);
    }

    public double makeAverage(ArrayList<Integer> AvrArray){
        double myFoookAver = 0;
        for(Integer i: AvrArray) myFoookAver+=i;
        myFoookAver = myFoookAver/AvrArray.size();
        return myFoookAver;
    }
}


