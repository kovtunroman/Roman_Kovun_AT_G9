package homework.day8.collections;

import homework.day8.util.Printer;

import java.util.ArrayList;
import java.util.List;

public class Cities {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Minsk");
        cities.add("Moscow");
        cities.add("Berlin");

        Printer.printListThroughNewLineForEach(cities);
        calculateAndPrintNUmberOfAllChars(cities);
        Printer.printListThroughSpaceIterateByIndex(cities);
    }

    private static void calculateAndPrintNUmberOfAllChars(List<String> inputCities) {
        int counter = 0;
        for (String city : inputCities) {
            counter += city.length();
        }
        System.out.printf("Number of all chars in cities is %s", counter).println();
    }
}
