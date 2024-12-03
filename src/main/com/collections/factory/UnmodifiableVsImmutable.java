package main.com.collections.factory;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class UnmodifiableVsImmutable {

    public static void main(String[] args) {

        Map<String, Integer> mutableCountryToPopulation = new HashMap<>();
        mutableCountryToPopulation.put("UK", 67);
        mutableCountryToPopulation.put("USA", 328);

        Map<String, Integer> unmodifiableCountryToPop = Collections.unmodifiableMap(mutableCountryToPopulation);

        Map<String, Integer> copiedCountryToPop = Map.copyOf(mutableCountryToPopulation);

        //copiedCountryToPop.put("Germany", 83);

        System.out.println("copiedCountryToPop= " + copiedCountryToPop);
        System.out.println("unmodifiableCountryToPop =" + unmodifiableCountryToPop);
       //unmodifiableCountryToPop.put("Germany", 83);
        mutableCountryToPopulation.put("Germany", 83);
        System.out.println("copiedCountryToPop= " + copiedCountryToPop);
        System.out.println("unmodifiableCountryToPop = " + unmodifiableCountryToPop);

       //System.out.println("mutableCountryToPopulation = " + mutableCountryToPopulation);

        Map<String, Integer> countryToPopulation = Map.of("UK", 67, "USA", 328);
        //countryToPopulation.put("Germany", 83);
        System.out.println("countryToPopulation = " + countryToPopulation);
    }
}
