
public class DoubleX {


    public static void main(String[] args) {
        DoubleX dx = new DoubleX();
        System.out.println(dx.doubleX("axaxax")); 
        System.out.println(dx.doubleX("xxxxx"));

    }
    
    
    boolean doubleX(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'x') {
                if (str.charAt(i + 1) == 'x') {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }
}
