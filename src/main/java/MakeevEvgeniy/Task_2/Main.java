package MakeevEvgeniy.Task_2;

/*
Задача #2:
Отсортируйте массив [5,6,3,2,5,1,4,9]
*/

public class Main {
    static int[] arr = {5, 6, 3, 2, 5, 1, 4, 9};
    static int arrLong = 8;

    public static void main(String[] args) {
        for (int i = 0; i < arrLong; i++) System.out.print(arr[i] + " ");
        System.out.println("- Не сортированый массив.");
        for (int out = arrLong - 1; out >= 1; out--) {
            for (int in = 0; in < out; in++) {
                if (arr[in] > arr[in + 1]) {
                    int temp = arr[in];
                    arr[in] = arr[in + 1];
                    arr[in + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arrLong; i++) System.out.print(arr[i] + " ");
        System.out.println("- Отсортированый массив.");
    }

    public static void mainTest(int[] arr, int arrLong) {
            for (int out = arrLong - 1; out >= 1; out--) {
                for (int in = 0; in < out; in++) {
                    if (arr[in] > arr[in + 1]) {
                        int temp = arr[in];
                        arr[in] = arr[in + 1];
                        arr[in + 1] = temp;
                    }
                }
            }
    }
}