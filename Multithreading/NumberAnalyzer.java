import java.util.Scanner;

class NumberProcessor implements Runnable {
    private int[] numbers;
    private String type;

    public NumberProcessor(int[] numbers, String type) {
        this.numbers = numbers;
        this.type = type;
    }

    @Override
    public void run() {
        
        switch (type) {
            case "negative":
                processNegativeNumbers();
                break;
            case "positiveEven":
                processPositiveEvenNumbers();
                break;
            case "positiveOdd":
                processPositiveOddNumbers();
                break;
            default:
                System.out.println("Invalid type.");
        }
    }

    private void processNegativeNumbers() {
        System.out.println("Negative numbers: ");
        for (int num : numbers) {
            if (num < 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    private void processPositiveEvenNumbers() {
        System.out.println("Positive even numbers: ");
        for (int num : numbers) {
            if (num > 0 && num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    private void processPositiveOddNumbers() {
        System.out.println("Positive odd numbers: ");
        for (int num : numbers) {
            if (num > 0 && num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}

public class NumberAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        Thread negativeThread = new Thread(new NumberProcessor(numbers, "negative"));
        Thread positiveEvenThread = new Thread(new NumberProcessor(numbers, "positiveEven"));
        Thread positiveOddThread = new Thread(new NumberProcessor(numbers, "positiveOdd"));

        negativeThread.start();
        positiveEvenThread.start();
        positiveOddThread.start();
    }
}