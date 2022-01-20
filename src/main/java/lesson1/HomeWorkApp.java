package lesson1;

public class HomeWorkApp {
    //1.
    public static void main(String[] args) {
        //2.
        printThreeWords();
        //3.
        checkSunSing();
        //4.
        printColor();
        //5.
        compareNumbers();
        }

    //2.
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    //3.
    public static void checkSunSing() {
        int a = 0, b = 9, c = a + b;
        if ( c > 0 || c == 0 ) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    //4.
    public static void printColor() {
        int value = 100;
        if ( value < 0 || value == 0 ){
            System.out.println("Красный");
        }
        if ( value > 0 || value <= 100 ) {
            System.out.println("Желтый");
        }
        if ( value > 100 ) {
            System.out.println("Зеленый");
        }
    }

    //5.
    public static void compareNumbers(){
        int a = 0, b = 1;
        if ( a >=b ) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }

    }

}

