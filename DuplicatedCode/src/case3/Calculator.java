package case3;

public class Calculator {

    public long sum(int min, int max) {
        long result = 0;
        for (int i = min ; i <= max ; i++)
            result += i;
        return result;
    }

    public long sumOfSquares(int min, int max) {
        long result = 0;
        for (int i = min ; i <= max ; i++)
            result += i * i;
        return result;
    }

}

