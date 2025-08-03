public class FizzString2 {

    public static String fizzString2(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz!";
        } else if (n % 3 == 0) {
            return "Fizz!";
        } else if (n % 5 == 0) {
            return "Buzz!";
        } else {
            return n + "!";
        }
    }

    public static void main(String[] args) {
        System.out.println(fizzString2(1));  // → "1!"
        System.out.println(fizzString2(2));  // → "2!"
        System.out.println(fizzString2(3));  // → "Fizz!"
        System.out.println(fizzString2(5));  // → "Buzz!"
        System.out.println(fizzString2(15)); // → "FizzBuzz!"
    }
}

