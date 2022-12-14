package homework.task_1;

/*
Задача #1:
Заполните двумерный массив случайным числами и выведите максимальное, минимальное и среднее значение.
*/

public class Main {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    static int[][] arrX = new int[5][5];


    public static void main(String[] args) {
        RandomGenerator numberX = new RandomGenerator(100);
        for (int i = 0; i < arrX.length; i++) {
            for (int j = 0; j < arrX.length; j++) {
                arrX[i][j] = numberX.nextInt();
                if (arrX[i][j] <= 33) System.out.print(ANSI_GREEN + arrX[i][j] + "\t" + ANSI_RESET);
                else if (arrX[i][j] >= 66) System.out.print(ANSI_RED + arrX[i][j] + "\t" + ANSI_RESET);
                else System.out.print(ANSI_YELLOW + arrX[i][j] + "\t" + ANSI_RESET);
            }
            System.out.println();
        }
        System.out.println("Массив из случайных чисел.");
        System.out.println("\n" + "Миниммальное число в массиве: " + ANSI_GREEN + getMinNumber(arrX) + ANSI_RESET);
        System.out.println("\n" + "Максимальное число в массиве: " + ANSI_RED + getMaxNumber(arrX) + ANSI_RESET);
        System.out.println("\n" + "Среднее арифмитическое массива: " + ANSI_CYAN + averageOfArray(arrX) + ANSI_RESET);
        System.out.println("\n" + "Среднее число в массиве: " + ANSI_PURPLE + middleOfNumber(arrX) + ANSI_RESET);
    }

    public static int getMaxNumber(int[][] arrX) {
        int maxNumber = arrX[0][0];
        for (int i = 0; i < arrX.length; i++) {
            for (int j = 0; j < arrX[i].length; j++) {
                if (arrX[i][j] > maxNumber) {
                    maxNumber = arrX[i][j];
                }
            }
        }
        return maxNumber;
    }

    public static int getMinNumber(int[][] arrX) {
        int minNumber = arrX[0][0];
        for (int i = 0; i < arrX.length; i++) {
            for (int j = 0; j < arrX[i].length; j++) {
                if (arrX[i][j] < minNumber) {
                    minNumber = arrX[i][j];
                }
            }
        }
        return minNumber;
    }

    static int averageOfArray(int[][] arrX) {
        int sum = 0;
        for (int[] ints : arrX) {
            for (int number : ints) {
                sum += number;
            }
        }
        return sum / (arrX.length * arrX.length);
    }

    static int middleOfNumber(int[][] arrX) {
        int average = averageOfArray(arrX);
        int middle = arrX[0][0];
        for (int i = 0; i < arrX.length; i++) {
            for (int j = 0; j < arrX[i].length; j++) {
                if (Math.abs(middle - arrX[i][j]) < Math.abs(middle - average)) {
                    middle = arrX[i][j];
                }
            }
        }
        return middle;
    }
    static class RandomGenerator{
        public int maxOfNumberX;
        public int last;

        public RandomGenerator(int maxOfNumberX) {
            this.maxOfNumberX = maxOfNumberX;
            last = (int) (System.currentTimeMillis() % maxOfNumberX);
        }

        public int nextInt() {
            last = (last * 32719 + 3) % 32749;
            return last % maxOfNumberX;
        }
    }
}
