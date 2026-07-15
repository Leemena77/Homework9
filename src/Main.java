import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static Object averageSum;

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
        System.out.println("Задача 1");
        int[] inputArray1 = {100, 200, 300, 400, 500};
        float[] outputArray1 = new float[4];
        int sum = 0;
        int maxSum = inputArray1[0];
        int minSum = inputArray1[0];
        System.out.println(Arrays.toString(inputArray1));

        for (int sumOne : inputArray1) {
            sum += sumOne;
            if (sumOne > maxSum) {
                maxSum = sumOne;
            }
            if (sumOne < minSum) {
                minSum = sumOne;
            }
            double averageSum = (float) sum / inputArray1.length;

            outputArray1[0] = sum;
            outputArray1[1] = maxSum;
            outputArray1[2] = minSum;
            outputArray1[3] = (float) averageSum;

        System.out.println(Arrays.toString(outputArray1));
        }
        System.out.println("Задача 2");
        int[] inputArray2 = {100, 200, 300, 400, 500};
        float[] outputArray2 = new float[inputArray2.length];
        int index = 0;
        System.out.println(Arrays.toString(inputArray2));
        for (int salary : inputArray2) {
            outputArray2[index] = ((float) salary / 100) * 13;
            index++;
        }
        System.out.println(Arrays.toString(outputArray2));
        System.out.println("Задача 3");
        int[] inputArray3 = {1000, 3000, 7000, 10000, 15000};
        boolean[] outputArray3 = new boolean[inputArray3.length];
        int indexOne = 0;
        for (
                int bonus : inputArray3) {
            outputArray3[indexOne] = bonus > 5000;
            indexOne++;
        }
        System.out.println(Arrays.toString(inputArray3));
        System.out.println(Arrays.toString(outputArray3));

        System.out.println("Задача 4");
        int[] inputArray4 = {100, -1, 300, 400, 500};
        boolean[] outputArray4 = {true};
        for (int remain : inputArray4) {
            if (remain < 0) {
                outputArray4[0] = false;
                break;
            }
            System.out.println(Arrays.toString(inputArray4));
            System.out.println(Arrays.toString(outputArray4));
        }
        System.out.println("Задача 5");
        int[] inputArray5 = {100, 200, 300, 400, 500};
        int monthProfit = 0;
        System.out.println(Arrays.toString(inputArray5));
        for (int profit : inputArray5) {
            if (profit > 0) {
                monthProfit++;
            }
            int[] outputArray5 = new int[0];
            outputArray5[0] = monthProfit;
            System.out.println(Arrays.toString(outputArray5));
            System.out.println("Количество прибыльных месяцев: " + outputArray5[0]);

        }
    }
}