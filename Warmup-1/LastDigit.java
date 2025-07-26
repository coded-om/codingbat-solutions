public class LastDigit {
        public static void main(String[] args) {
            System.out.println(lastDigit(27, 57));
        System.out.println(lastDigit(123, 456)); 
    }

    public static boolean lastDigit(int a, int b) {
        return (a % 10 == b % 10);
    }

    
}
