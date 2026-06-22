//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
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
        int[] inputArray1 = {15000, 22000, 18000, 25000, 12000};

        double[] outputArray1 = calculatePayments(inputArray1);
        System.out.println("inputArray1: " + Arrays.toString(inputArray1));
        System.out.println("outputArray1: [сумма, максимум, минимум, среднее]");
        System.out.println("outputArray1: " + Arrays.toString(outputArray1));
        System.out.println();
        if (array.length == 0) {
            return new double[]{0, 0, 0, 0};
        }
        int sum = 0;
        int max = array[0];
        int min = array[0];
        for (int value : array) {
            sum += value;
            if (value > max) max = value;
            if (value < min) min = value;
        }
        double average = (double) sum / array.length;
        return new double[]{sum, max, min, average};
        System.out.println();

        System.out.println("Задача 2");
        int[] inputArray2 = {50000, 75000, 60000, 90000, 45000};
        double[] outputArray2 = calculateTax(inputArray2);
        System.out.println("inputArray2: " + Arrays.toString(inputArray2));
        System.out.println("outputArray2: " + Arrays.toString(outputArray2));
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i] * 0.13;
        }
        return result;
        System.out.println();

        System.out.println("Задача 3");
        int[] inputArray3 = {3000, 7000, 4500, 8000, 2000};
        boolean[] outputArray3 = findBonusesAbove5000(inputArray3);
        System.out.println("inputArray3: " + Arrays.toString(inputArray3));
        System.out.println("outputArray3: " + Arrays.toString(outputArray3));
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i] > 5000;
        }
        return result;

        System.out.println("Задача 4");
        int[] inputArray4 = {1000, 500, 200, 300, 100};
        boolean outputArray4 = checkCreditHistory(inputArray4);
        System.out.println("inputArray4: " + Arrays.toString(inputArray4));
        System.out.println("outputArray4: " + outputArray4);
        System.out.println();
        for (int value : array) {
            if (value < 0) {
                return false;
            }
            return true;
        }

        System.out.println("Задача 5");
        int[] inputArray5 = {15000, -5000, 20000, -3000, 10000};
        int outputArray5 = countProfitableMonths(inputArray5);
        System.out.println("inputArray5: " + Arrays.toString(inputArray5));
        System.out.println("outputArray5 (количество рентабельных месяцев): " + outputArray5);
        int count = 0;
        for(int value = array);
        if (value > 0) {
            count++;
        }
        return count;
    }
}
