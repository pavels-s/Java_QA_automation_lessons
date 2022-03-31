package Lecture4;

public class NumberService {

    public int rangeSum(int start, int finish) {
        int sum = 0;

        if (start < finish) {
            for (int i = start; i <= finish; i++) {
                sum += i;
            }
        }

            if (finish < start) {
                for (int i = finish; i <= start; i++) {
                    sum += i;
                }
            }
        return sum;
    }


    public int rangeEvenCount(int start, int finish) {
        int sum = 0;

        if (start < finish) {
            for (int i = start + 1; i <= finish; i++) {
                if (i % 2 == 0) sum += i;
            }
        }

            if (finish < start) {
                for (int i = finish + 1; i <= start; i++) {
                    if (i % 2 == 0) sum += i;
                }
            }
        return sum;
    }

}