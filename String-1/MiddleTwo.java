public class MiddleTwo {
    
    public static void main(String[] args) {
        MiddleTwo mt = new MiddleTwo();
        System.out.println(mt.middleTwo("string"));
        System.out.println(mt.middleTwo("code"));
        System.out.println(mt.middleTwo("Practice"));
    }
    
    public String middleTwo(String str) {
        int middle = str.length() / 2;
        return str.substring(middle - 1, middle + 1);
    }
}
