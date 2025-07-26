public class NotString {
    public static void main(String[] args) {
        System.out.println(notString("good"));     
        System.out.println(notString("not bad"));  
    }

    public static String notString(String str) {
        if (str.length() >= 3) {
            String firstThree = str.substring(0, 3);
            if (firstThree.equals("not")) {
                return str;
            }
        }
        return "not " + str;
    }
    
}
