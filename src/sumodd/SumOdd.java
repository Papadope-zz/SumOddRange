package sumodd;

public class SumOdd {

    public static void main(String[] args) {
        sumOdd(1, 100);
        sumOdd(-1, 100);
        sumOdd(100, 100);
        sumOdd(13, 13);
        sumOdd(100, -100);
        sumOdd(100, 1000);
        sumOdd(10, 5);
    }

    public static boolean isOdd(int number) {
        if (number > 0) {
            if (number % 2 == 0) {
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        
        if ((start > 0) && (end > 0) && (end >= start)) {
            for (int number = start; number <= end; number++) {
                if (isOdd(number)) {
                    sum += number;
                }
            }
            System.out.println(sum);
            return sum;
        } else {
            System.out.println("-1");
            return -1;
        }
    }
}
