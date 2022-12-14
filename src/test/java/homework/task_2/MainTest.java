package homework.task_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/*
Тест задачи #2:
Отсортируйте массив [5,6,3,2,5,1,4,9]
*/

class MainTest {

    @Test
    void main() {
        int[] arrTest = {-3, 7, 0, 6, 9, 5, 2, 7};
        int arrLongTest = 8;
        Main.mainTest(arrTest, arrLongTest);
        int[] expected = new int[]{-3, 0, 2, 5, 6, 7, 7, 9};
        assertArrayEquals(expected,arrTest);
    }
}

