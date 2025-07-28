public class FirstTwo {
    
    public static void main(String[] args) {
        FirstTwo ft = new FirstTwo();
        System.out.println(ft.firstTwo("Hello"));
        System.out.println(ft.firstTwo("abcdefg"));
        System.out.println(ft.firstTwo("ab"));
        System.out.println(ft.firstTwo("X"));
        System.out.println(ft.firstTwo(""));
    }
    
    public String firstTwo(String str) {
        if (str.length() < 2) {
            return str;
        }
        return str.substring(0, 2);
    }
}
