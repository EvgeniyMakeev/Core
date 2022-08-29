package MakeevEvgeniy.Task_1;

/*
Задача #1:
Заполните двумерный массив случайным числами и выведите максимальное, минимальное и среднее значение.
*/

public class Main {
    static int[][] arrX = new int[5][5];

    public static void main(String[] args) {
        Main numberX = new Main(100);
        for (int i = 0; i < arrX.length; i++) {
            for (int j = 0; j < arrX.length; j++) {
                arrX[i][j] = numberX.nextInt();
            }
        }
        for (int n = 0; n < arrX.length; n++) {
            for (int m = 0; m < arrX[n].length; m++) {
                System.out.print(arrX[n][m] + "\t");
            }
            System.out.println();
        }
        System.out.println("Массив из случйных чисел.");
        System.out.println("\n" + "Миниммальное число в массиве: " + getMinNumber(arrX));
        System.out.println("\n" + "Максимальное число в массиве: " + getMaxNumber(arrX));
        System.out.println("\n" + "Среднее арифмитическое массива: " + averageOfArray(arrX));
    }

    private int maxOfNumberX;
    private int last;

    public Main(int maxOfNumberX) {
        this.maxOfNumberX = maxOfNumberX;
        last = (int) (System.currentTimeMillis() % maxOfNumberX);
    }

    public int nextInt() {
        last = (last * 32719 + 3) % 32749;
        return last % maxOfNumberX;
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

    static double averageOfArray(int[][] arrX) {
        double sum = 0;
        for (int[] ints : arrX) {
            for (int number : ints) {
                sum += number;
            }
        }
        double average = sum / (arrX.length * arrX.length);
        return average;
    }
}
