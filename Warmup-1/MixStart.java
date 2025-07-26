public class MixStart {
        public static void main(String[] args) {
        System.out.println(mixStart("mix"));   
        System.out.println(mixStart("pix"));   
        System.out.println(mixStart("pax")); 
        System.out.println(mixStart("mi"));   
    }

    public static boolean mixStart(String str) {
        if (str.length() < 3) {
            return false;
        }
        String two = str.substring(1, 3);
        if (two.equals("ix")) {
            return true;
        } else {
            return false;
        }
    }
    
}
