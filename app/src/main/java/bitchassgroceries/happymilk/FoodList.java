package bitchassgroceries.happymilk;

import java.util.ArrayList;

/**
 * Created by Andrew on 2/7/2017.
 */

public class FoodList {
    private static ArrayList<String> foods1;
    private static ArrayList<String> foods2;

    public static ArrayList<String> getFoodList1(){
        if(foods1 == null){
            foods1 = new ArrayList<String>();
            foods1.add("bacon");
            foods1.add("chicken");
            foods1.add("steak");

        }
        return foods1;
    }

    public static ArrayList<String> getFoodList2(){
        if(foods2 == null){
            foods2 = new ArrayList<String>();
            foods2.add("brocooli");
            foods2.add("peas");
            foods2.add("corn");

        }
        return foods2;
    }
}
