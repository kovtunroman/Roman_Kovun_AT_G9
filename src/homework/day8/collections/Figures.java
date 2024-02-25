package homework.day8.collections;

import homework.day8.util.Printer;

import java.util.*;

public class Figures {
    public static void main(String[] args) {
        List<String> figures = Arrays.asList("Oval", "Rectangle", "Circle", "Square", "Ellipse");
        printFiguresThroughDash(figures);
        calculateAndPrintNumberOfFiguresWithoutN(figures);
        Printer.printListThroughSpaceIterateByIndex(figures);
        figures = insertTriangle(figures);
        Printer.printListThroughSpaceForEach(figures);
    }

    private static void printFiguresThroughDash(List<String> inputFigures) {
        for (String figure : inputFigures) {
            if (inputFigures.indexOf(figure) == inputFigures.size() - 1) {
                System.out.print(figure);
            } else {
                System.out.print(figure + "-");
            }
        }
        System.out.println();
    }

    private static void calculateAndPrintNumberOfFiguresWithoutN(List<String> inputFigures) {
        int counter = 0;
        for (String figure : inputFigures) {
            if (!figure.toLowerCase().contains("i")) {
                counter++;
            }
        }
        System.out.printf("Number of figures without \"i\" char is %s", counter).println();
    }

    private static List<String> insertTriangle(List<String> inputFigures) {
        inputFigures.set(3, "Triangle");
        return inputFigures;
    }
}
