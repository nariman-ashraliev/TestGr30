package LessonOne;

public class LessonOne {
    static int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0};

    public static void main(String[] args) {
        checkSumSigh();
        printThreeWords();
        printColor();
        compareNumbers();
        System.out.println(summ(7, 5));
        checkNumber(6);
        System.out.println(negativeNumber(-9));
        stringNumber("Здравствуй", 3);
        System.out.println(isLeapYear(2234));
        arrTest(arr);
        arrTest1();
        changeArray();

    }
    public static void checkSumSigh() {
        int a = 20;
        int b = 20;

        if (a + b > 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }

    }

    public static void printThreeWords() {
        System.out.println("o");
        System.out.println("b");
        System.out.println("a");
    }

    public static void printColor() {
        int value = 150;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 29;
        int b = 19;

        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }

    public static boolean summ(int a, int b) {
        int summ = a + b;
        if (summ >= 10 && summ <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void checkNumber(int number) {
        if (number >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }

    public static boolean negativeNumber(int number) {
        if (number < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void stringNumber(String text, int number) {
        for (int i = 0; i < 2; i++) {
            System.out.println(text);
        }
    }

    public static boolean isLeapYear(int x) {
        if (x % 4 == 0 && x % 100 != 0) {
            return true;
        } else if (x % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void arrTest(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void arrTest1() {
        int[] numbers = new int [101];
        for (int i=0; i< numbers.length; i++){
            numbers[i]=i+0;
        }
        for(int num : numbers){
            System.out.println(num+" ");
        }
    }
    public static void changeArray() {
        int[]arr = {1,5,3,2,11,4,5,2,4,8,9,1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        for (int num: arr) {
            System.out.println(num + " ");
        }
    }


}
