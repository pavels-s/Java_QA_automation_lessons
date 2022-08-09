package lecture4;

public class Task2 {

    public static void main(String[] args) {

        int randomNumber1;
        int randomNumber2;
        int randomNumber3;

        int trys = 0;

        boolean result = true;

        do {
            randomNumber1 = (int) (Math.random() * 6) + 1;
            randomNumber2 = (int) (Math.random() * 6) + 1;
            randomNumber3 = (int) (Math.random() * 6) + 1;


            trys++;
        } while ((randomNumber1 != randomNumber2) && (randomNumber2 != randomNumber3));

        System.out.println("All dices = " + randomNumber1 + randomNumber2 + randomNumber3);
        System.out.println("Trys = " + trys);
    }
}

