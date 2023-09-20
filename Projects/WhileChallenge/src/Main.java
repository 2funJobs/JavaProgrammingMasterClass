public class Main {
    public static void main(String[] args) {
        int number = 5;
        int finishNumber = 20;
        int evenCount = 0;
        int oddCount = 0;
        int evenSum = 0;
        while (number <= finishNumber) {
            if (isEvenNumber(number)) {
                evenCount++;
                System.out.print(number + " ");
                evenSum += number;
                if (evenCount == 5) {
                    System.out.println("\nEven number count: " + evenCount +
                            "\nOdd number count: " + oddCount +
                            "\nEven number sum: " + evenSum);
                    break;
                }
            } else {
                oddCount++;
            }
            number++;
        }
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
