import java.util.Scanner;
class Digits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter your 5 digit integer: ");
        int number = s.nextInt();
        int firstDigit = (number / 10000 + 1) % 10;
        int secondDigit = ((number % 10000) / 1000 + 1) % 10;
        int thirdDigit = ((number % 1000) / 100 + 1) % 10;
        int fourthDigit = ((number % 100) / 10 + 1) % 10;
        int fifthDigit = (number % 10 + 1) % 10;

        String firstDigit2 = Integer.toString(firstDigit);
        String secondDigit2 = Integer.toString(secondDigit);
        String thirdDigit2 = Integer.toString(thirdDigit);
        String fourthDigit2 = Integer.toString(fourthDigit);
        String fifthDigit2 = Integer.toString(fifthDigit);
        System.out.print(firstDigit2 + secondDigit2 + thirdDigit2 + fourthDigit2 + fifthDigit2);
        System.out.println("Program over!");
    }
}