public class MiddleThree {
    
    public static void main(String[] args) {
        MiddleThree mt = new MiddleThree();
        System.out.println(mt.middleThree("Candy"));
        System.out.println(mt.middleThree("and"));
        System.out.println(mt.middleThree("solving"));
    }
    
    public String middleThree(String str) {
        int middle = str.length() / 2;
        return str.substring(middle - 1, middle + 2);
    }
}
