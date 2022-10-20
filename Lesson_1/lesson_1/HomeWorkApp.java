// Task_1
package lesson_1;

public class HomeWorkApp {

    public static void main(String[] args) {
        System.out.println("Hello, world!");
        printThreeWords();
        checkSumSing();
        printColor();
        compareNumbers();
    }

    // Task_2
    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // Task_3
    static void checkSumSing() {
        int varA = 99;
        int varB = 66;
        int sum = varA + varB;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // Task_4
    static void printColor() {
        int value = 200;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 & value <= 200) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    // Task_4
    static void compareNumbers() {
        int varA = 49;
        int varB = 26;

        if (varA >= varB) {
            System.out.println("varA >= varB");
        } else if (varA < varB) {
            System.out.println("varA < varB");
        }
    }
}