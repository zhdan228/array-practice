package Massive;

public class MassiveWithNumbers {
    public static void main(String[] args) {
        int[] numbers = {7, -3, 9, -11, 18, 99, 2, 11};

        System.out.print("Все элементы массива: ");
        for (int a = 0; a < numbers.length; a++) {
            if (a < numbers.length - 1) {
                System.out.print(numbers[a] + ", ");
            } else {
                System.out.print(numbers[a] + ".\n");
            }
        }

        System.out.print("\nПервые 3 элемента массива: ");

        int count = 3;
        for (int num = 0; num < count; num++) {
            if (num < 2) {
                System.out.print(numbers[num] + ", ");
            } else {
                System.out.print(numbers[num] + ".");
            }
        }

        System.out.print("\nПервая половина массива: ");
        for (int num = 0; num < numbers.length / 2; num++) {
            if (num < (numbers.length / 2) - 1) {
                System.out.print(numbers[num] + ", ");
            } else {
                System.out.print(numbers[num] + ".");
            }
        }

        System.out.print("\nВторая половина массива: ");

        for (int num = numbers.length / 2; num < numbers.length; num++) {
            if (num != numbers.length - 1) {
                System.out.print(numbers[num] + ", ");
            } else {
                System.out.print(numbers[num] + ".");
            }
        }

        System.out.print("\nПоследние 3 элемента массива: ");
        for (int num = numbers.length - 3; num < numbers.length; num++) {
            if (num < numbers.length - 1) {
                System.out.print(numbers[num] + ", ");
            } else {
                System.out.print(numbers[num] + ".");
            }
        }

        System.out.print("\nВсе элеметы массива кроме первого и последнего: ");
        for (int num = 1; num < numbers.length - 1; num++) {
            if (num < numbers.length - 2) {
                System.out.print(numbers[num] + ", ");
            } else {
                System.out.print(numbers[num] + ".");
            }
        }

        System.out.print("\nКаждый второй элемент массива: ");
        for (int num = 0; num < numbers.length; num++) {
            if (num % 2 == 0) {
                if (num < numbers.length - 2) {
                    System.out.print(numbers[num] + ", ");
                } else {
                    System.out.print(numbers[num] + ".");
                }
            }

        }

        System.out.print("\nКоличество положительных элементов - ");
        int positiveCount = 0;
        int negativeCount = 0;
        int[] positive = new int[numbers.length];
        int[] negative = new int[numbers.length];

        for (int num = 0; num < numbers.length; num++) {
            if (numbers[num] < 0) {
                negativeCount++;
                negative[num] = numbers[num];
            } else {
                positiveCount++;
                positive[num] = numbers[num];
            }

        }
        System.out.print(positiveCount + ": ");

        for (int num = 0; num < positive.length; num++) {
            if (positive[num] > 0) {
                System.out.print(positive[num] + ", ");
            }
        }

        int examination = 0;
        for (int num2 = 0; num2 < negative.length; num2++) {
            if (negative[num2] < 0) {
                examination++;
            }
        }

        int c;
        int d;
        for (c = 0; c < negative.length; c++) {
            for (d = c + 1; d < negative.length; d++) {
                if (negative[c] > negative[d]) {
                    negative[d] = negative[c] ^ negative[d];
                    negative[c] = negative[d] ^ negative[c];
                    negative[d] = negative[c] ^ negative[d];
                }
            }
        }

        int[] examination2 = new int[examination];

        for (int num3 = 0; num3 < examination; num3++) {
            if (negative[num3] < 0) {
                examination2[num3] = negative[num3];
            }
        }

        System.out.print("количество отрицательных элементов - " + negativeCount + ": ");
        for (int num = 0; num < examination2.length; num++) {
            if (num != examination2.length - 1) {
                System.out.print(examination2[num] + ", ");
            } else {
                System.out.print(examination2[num] + ".");
            }
        }

        System.out.print("\nЗеркальный список: ");
        for (int num = 0; num < numbers.length; num++) {
            if (num < numbers.length - 1) {
                System.out.print(numbers[numbers.length - num - 1] + ", ");
            } else {
                System.out.print(numbers[numbers.length - num - 1] + ".\n");
            }

        }

        int maxNum = 0;
        int minNum = 0;

        for (int x = 1; x < numbers.length; x++) {
            if (numbers[x] > numbers[maxNum]) {
                maxNum = x;
            } else if (numbers[x] < numbers[minNum]) {
                minNum = x;
            }
        }
        System.out.println("Максимальное число: " + numbers[maxNum] + ", минимальное число: " + numbers[minNum] + ".");
    }
}